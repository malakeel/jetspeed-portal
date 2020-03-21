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
package org.apache.jetspeed.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author <a href="mailto:vkumar@apache.org">Vivek Kumar</a>
 * @version $Id: ContextRefreshableBeanInitializer.java 767444 2009-04-22 10:08:53Z ate $
 */
public class ContextRefreshableBeanInitializer implements ApplicationListener
{
    Logger log = LoggerFactory.getLogger(ContextRefreshableBeanInitializer.class);
    
    private RefreshableBean bean;
    /**
     * @param bean
     */
    public ContextRefreshableBeanInitializer(RefreshableBean bean)
    {
        this.bean = bean;
    }

    public void onApplicationEvent(ApplicationEvent appEvent)
    {
        if (appEvent instanceof ContextRefreshedEvent && bean != null)
        {
            try
            {
                bean.refresh();
            }
            catch (Exception ex)
            {
                log.error("Failed to refresh bean", ex);
            }
        }
    }
}
