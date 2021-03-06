/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jetspeed.profiler.impl;

import org.apache.jetspeed.profiler.ProfileLocator;
import org.apache.jetspeed.profiler.ProfileLocatorProperty;
import org.apache.jetspeed.profiler.Profiler;
import org.apache.jetspeed.profiler.rules.RuleCriterion;

import java.util.*;

/**
 * ProfileLocatorImpl
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: JetspeedProfileLocator.java 1507157 2013-07-25 23:59:57Z taylor $
 */
public class JetspeedProfileLocator implements ProfileLocatorControl
{    
    private LinkedList elements = new LinkedList();
    private String requestPath;
    private String requestServerName;

    public List getElements()
    {
        return elements;
    }

    public void init(Profiler profiler, String requestPath)
    {
        init(profiler, requestPath, null);
    }

    public void init(Profiler profiler, String requestPath, String requestServerName)
    {
        if (requestPath != null)
        {
            if (requestPath.indexOf("/") != -1)
            {
                this.requestPath = requestPath;
            }
            else
            {
                this.requestPath = "/" + requestPath;
            }
        }
        else
        {
            this.requestPath = "/";
        }
        this.requestServerName = requestServerName;
    }

    public Iterator<ProfileLocatorProperty []> iterator()
    {    
        return new ProfileFallbackIterator(this);
    }
    
    public String getValue(String name)
    {
        Iterator iter = elements.iterator();
        while (iter.hasNext())
        {
            ProfileLocatorPropertyImpl element = (ProfileLocatorPropertyImpl)iter.next();
            String elementName = element.getName();
            if (elementName != null && elementName.equals(name))
            {
                return element.getValue();
            }
        }
        return null;
    }

    public boolean isControl(String name)
    {
        Iterator iter = elements.iterator();
        while (iter.hasNext())
        {
            ProfileLocatorPropertyImpl element = (ProfileLocatorPropertyImpl)iter.next();
            String elementName = element.getName();
            if (elementName != null && elementName.equals(name))
            {
                return element.isControl();
            }
        }
        return false;
    }

    public boolean isNavigation(String name)
    {
        Iterator iter = elements.iterator();
        while (iter.hasNext())
        {
            ProfileLocatorPropertyImpl element = (ProfileLocatorPropertyImpl)iter.next();
            String elementName = element.getName();
            if (elementName != null && elementName.equals(name))
            {
                return element.isNavigation();
            }
        }
        return false;
    }
    
    public void add(RuleCriterion criterion, boolean isControl, boolean isNavigation, String value)
    {
        elements.add(new ProfileLocatorPropertyImpl(criterion, isControl, isNavigation, value));
    }

    public void add(String name, boolean isControl, boolean isNavigation, String value)
    {
        elements.add(new ProfileLocatorPropertyImpl(name, isControl, isNavigation, value));
    }
    
    public void add(String name, String value)
    {
        add(name, true, false, value);
    }
    
    public void createFromLocatorPath(String path)
    {
        elements.clear();
        StringTokenizer tokenizer = new StringTokenizer(path, ProfileLocator.PATH_SEPARATOR);
        while (tokenizer.hasMoreTokens())
        {
            String name = tokenizer.nextToken();
            if (tokenizer.hasMoreTokens())
            {
                String value = tokenizer.nextToken();
                this.add(name, true, false, value);
            }
        }        
    }
                    
    public String getLocatorPath()
    {
        StringBuffer key = new StringBuffer();
        ListIterator it = elements.listIterator();
        while (it.hasNext())
        {
            ProfileLocatorPropertyImpl element = (ProfileLocatorPropertyImpl)it.next();
            key.append(element.getName());
            key.append(ProfileLocator.PATH_SEPARATOR);
            key.append(element.getValue());
            if (it.hasNext())
            {
                key.append(ProfileLocator.PATH_SEPARATOR);
            }
        }
        return key.toString();
    }
        
    public String getLocatorPath(ProfileLocatorProperty [] properties)
    {
        StringBuffer key = new StringBuffer();
        if (properties != null)
            for (int i = 0; (i < properties.length); i++)
            {
                if (i > 0)
                    key.append(ProfileLocator.PATH_SEPARATOR);
                key.append(properties[i].getName());
                key.append(ProfileLocator.PATH_SEPARATOR);
                key.append(properties[i].getValue());
            }
        return key.toString();
    }

    public String toString()
    {
        return getRequestPath() + ProfileLocator.PATH_SEPARATOR + getLocatorPath();
    }
        
    public String getRequestPath()
    {
        return requestPath;
    }

    public String getRequestServerName()
    {
        return requestServerName;
    }
}
