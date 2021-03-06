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
package org.apache.jetspeed.container;

import javax.portlet.PortletConfig;

import org.apache.jetspeed.om.portlet.PortletDefinition;

/**
 * This interface defines the Jetspeed specific methods added on the Portlet Config.
 * 
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: JetspeedPortletConfig.java 755550 2009-03-18 11:08:48Z ate $
 */
public interface JetspeedPortletConfig extends PortletConfig
{
    PortletDefinition getPortletDefinition();
    void setPortletDefinition(PortletDefinition pd);
}
