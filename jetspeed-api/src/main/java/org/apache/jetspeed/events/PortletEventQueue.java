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
package org.apache.jetspeed.events;

import org.apache.jetspeed.container.PortletWindow;

import java.util.List;


/**
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: PortletEventQueue.java 1576070 2014-03-10 20:31:10Z taylor $
 */
public interface PortletEventQueue
{
    /**
     * Publish a Portlet API Event internally in Jetspeed
     *
     * @param event
     */
    void publishEvent(ProcessEvent event);

    /**
     * Remove an event from Portlet API queue
     *
     * @param window
     * @return List of remaining events
     */
    List<ProcessEvent> dequeueEvents(PortletWindow window);
}