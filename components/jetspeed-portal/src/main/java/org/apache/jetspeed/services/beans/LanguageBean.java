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

import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.jetspeed.om.portlet.Language;

/**
 * LanguageBean
 * 
 * @version $Id: LanguageBean.java 884670 2009-11-26 19:21:39Z woonsan $
 */
@XmlRootElement(name="language")
public class LanguageBean extends PortletInfoBean
{
    private static final long serialVersionUID = 1L;
    
    private String localeString;
    
    public LanguageBean()
    {
        super();
    }
    
    public LanguageBean(final Language language)
    {
        super(language);
        
        Locale locale = language.getLocale();
        
        if (locale != null)
        {
            localeString = locale.toString();
        }
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
