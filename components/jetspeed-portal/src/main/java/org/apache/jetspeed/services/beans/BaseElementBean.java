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

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.jetspeed.om.page.BaseElement;

/**
 * BaseElementBean
 * 
 * @version $Id: BaseElementBean.java 920481 2010-03-08 19:51:56Z woonsan $
 */
@XmlRootElement(name="baseElement")
public class BaseElementBean extends SecuredResourceBean
{
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String title;
    private String shortTitle;
    
    public BaseElementBean()
    {
        
    }
    
    public BaseElementBean(BaseElement baseElement)
    {
        super(baseElement);
        id = baseElement.getId();
        title = baseElement.getTitle();
        shortTitle = baseElement.getShortTitle();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getShortTitle()
    {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle)
    {
        this.shortTitle = shortTitle;
    }
    
}
