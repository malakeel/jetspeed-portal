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

import org.apache.jetspeed.profiler.ProfileLocatorProperty;
import org.apache.jetspeed.profiler.rules.ProfilingRule;
import org.apache.jetspeed.profiler.rules.RuleCriterion;

/**
 * ProfileLocatorElement
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: ProfileLocatorPropertyImpl.java 1510080 2013-08-03 23:35:19Z taylor $
 */
public class ProfileLocatorPropertyImpl implements ProfileLocatorProperty
{
    private String name;
    private String value;
    private String type;
    private int fallbackType;
    private boolean isControl = true;
    private boolean isNavigation = false;
        
    public ProfileLocatorPropertyImpl(RuleCriterion criterion, boolean isControl, boolean isNavigation, String value)
    {
        this.name = criterion.getName();
        this.value = value;
        this.type = criterion.getType();
        this.fallbackType = criterion.getFallbackType();
        this.isControl = isControl;
        this.isNavigation = isNavigation;
    }
    
    public ProfileLocatorPropertyImpl(String name, boolean isControl, boolean isNavigation, String value)
    {
        this.name = name;
        this.value = value;
        this.type = ProfilingRule.STANDARD;
        this.fallbackType = RuleCriterion.FALLBACK_CONTINUE;
        this.isControl = isControl;
        this.isNavigation = isNavigation;
    }

    /**
     * @return
     */
    public String getValue()
    {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value)
    {
        this.value = value;
    }


    /**
     * @return
     */
    public int getFallbackType()
    {
        return fallbackType;
    }

    /**
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param i
     */
    public void setFallbackType(int i)
    {
        fallbackType = i;
    }

    /**
     * @param string
     */
    public void setName(String string)
    {
        name = string;
    }

    /**
     * @param string
     */
    public void setType(String string)
    {
        type = string;
    }

    /**
     * @return control classification flag
     */
    public boolean isControl()
    {
        return isControl;
    }

    /**
     * @return navigation classification flag
     */
    public boolean isNavigation()
    {
        return isNavigation;
    }
    
}
