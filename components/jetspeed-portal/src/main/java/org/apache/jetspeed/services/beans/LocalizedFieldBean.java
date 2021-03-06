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
package org.apache.jetspeed.services.beans;

import java.io.Serializable;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.jetspeed.om.portlet.LocalizedField;

/**
 * LocalizedFieldBean
 * 
 * @version $Id: LocalizedFieldBean.java 884883 2009-11-27 14:17:56Z woonsan $
 */
@XmlRootElement(name="field")
public class LocalizedFieldBean implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String value;
    private String localeString;

    public LocalizedFieldBean()
    {
        
    }
    
    public LocalizedFieldBean(final LocalizedField localizedField)
    {
        name = localizedField.getName();
        value = localizedField.getValue();
        
        Locale locale = localizedField.getLocale();
        
        if (locale != null)
        {
            localeString = locale.toString();
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getLocaleString()
    {
        return localeString;
    }

    public void setLocaleString(String localeString)
    {
        this.localeString = localeString;
    }
    
}
