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

import org.apache.jetspeed.om.page.BaseConcretePageElement;
import org.apache.jetspeed.om.page.Fragment;

/**
 * BasePageElementBean
 * 
 * @version $Id: BaseConcretePageElementBean.java 920481 2010-03-08 19:51:56Z woonsan $
 */
@XmlRootElement(name="baseConcretePageElement")
public class BaseConcretePageElementBean extends BasePageElementBean
{
    private static final long serialVersionUID = 1L;
    
    private String effectiveDefaultLayoutDecorator;
    private String effectiveDefaultPortletDecorator;
    
    public BaseConcretePageElementBean()
    {
        
    }
    
    public BaseConcretePageElementBean(BaseConcretePageElement baseConcretePageElement)
    {
        super(baseConcretePageElement);
        effectiveDefaultLayoutDecorator = baseConcretePageElement.getEffectiveDefaultDecorator(Fragment.LAYOUT);
        effectiveDefaultPortletDecorator = baseConcretePageElement.getEffectiveDefaultDecorator(Fragment.PORTLET);
    }

    public String getEffectiveDefaultLayoutDecorator()
    {
        return effectiveDefaultLayoutDecorator;
    }

    public void setEffectiveDefaultLayoutDecorator(String effectiveDefaultLayoutDecorator)
    {
        this.effectiveDefaultLayoutDecorator = effectiveDefaultLayoutDecorator;
    }

    public String getEffectiveDefaultPortletDecorator()
    {
        return effectiveDefaultPortletDecorator;
    }

    public void setEffectiveDefaultPortletDecorator(String effectiveDefaultPortletDecorator)
    {
        this.effectiveDefaultPortletDecorator = effectiveDefaultPortletDecorator;
    }
    
}
