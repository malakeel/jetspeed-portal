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

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.jetspeed.om.portlet.PortletInfo;

/**
 * PortletInfoBean
 * 
 * @version $Id: PortletInfoBean.java 884670 2009-11-26 19:21:39Z woonsan $
 */
@XmlRootElement(name="portletInfo")
public class PortletInfoBean implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String keywords;
    private String shortTitle;
    private String title;
    
    public PortletInfoBean()
    {
        
    }
    
    public PortletInfoBean(final PortletInfo portletInfo)
    {
        keywords = portletInfo.getKeywords();
        shortTitle = portletInfo.getShortTitle();
        title = portletInfo.getTitle();
    }

    public String getKeywords()
    {
        return keywords;
    }

    public void setKeywords(String keywords)
    {
        this.keywords = keywords;
    }

    public String getShortTitle()
    {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle)
    {
        this.shortTitle = shortTitle;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

}
