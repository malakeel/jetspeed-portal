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

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.jetspeed.container.PortletWindow;

/**
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: PortletEventQueueImpl.java 755263 2009-03-17 14:23:52Z ate $
 */
public class PortletEventQueueImpl implements PortletEventQueue
{
    private Map<String, List<ProcessEvent>> eventQueue = Collections.synchronizedMap(new HashMap<String, List<ProcessEvent>>());

    public PortletEventQueueImpl()
    {}
    
    public List<ProcessEvent> dequeueEvents(PortletWindow window)
    {
        return eventQueue.remove(window.getId().toString());
    }

    public void publishEvent(ProcessEvent event)
    {
        List<ProcessEvent> events = eventQueue.get(event.getPortletWindow().getId());
        if (events == null)
        {
            events = new LinkedList<ProcessEvent>();
            eventQueue.put(event.getPortletWindow().getId().toString(), events);
        }
        events.add(event);        
    }
    
}