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
package org.apache.jetspeed.search;

import java.util.Set;

/**
 * Contract for implementing a specific object handler. Implementation
 * should convert the object into a document suitable for placement into
 * search index.
 * 
 * @author <a href="mailto:morciuch@apache.org">Mark Orciuch</a>
 * @version $Id: ObjectHandler.java 516448 2007-03-09 16:25:47Z ate $
 */
public interface ObjectHandler
{
    /**
     * Parses a specific object into a document suitable for index placement
     * 
     * @param o
     * @return 
     */
    public ParsedObject parseObject(Object o);
    
    /**
     * Returns the set of fields used to create the parsed object.
     * @return
     */
    public Set getFields();
    
    /**
     * Returns the set of keywords used to create the parsed object.
     * @return
     */
    public Set getKeywords();
}

