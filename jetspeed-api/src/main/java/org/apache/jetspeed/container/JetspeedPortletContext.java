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

import javax.portlet.PortletContext;
import javax.servlet.ServletContext;

import org.apache.jetspeed.om.portlet.PortletApplication;
import org.apache.portals.bridges.common.ServletContextProvider;

/**
 * This interface defines the Jetspeed specific methods added on the Portlet Context.
 * 
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: JetspeedPortletContext.java 761258 2009-04-02 11:58:58Z ate $
 */
public interface JetspeedPortletContext extends PortletContext
{
    PortletApplication getApplicationDefinition(); 
    ServletContext getServletContext();
    ServletContextProvider getServletContextProvider();
}
