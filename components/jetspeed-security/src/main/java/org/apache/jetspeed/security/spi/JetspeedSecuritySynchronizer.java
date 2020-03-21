/* 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jetspeed.security.spi;

import org.apache.jetspeed.security.SecurityException;

/**
 * @author <a href="mailto:ddam@apache.org">Dennis Dam</a>
 * @version $Id: JetspeedSecuritySynchronizer.java 931491 2010-04-07 10:20:17Z ate $
 */
public interface JetspeedSecuritySynchronizer
{
	
	/**
	 * Synchronizes the user principal with the specified name. 
	 * @param name
	 */
    void synchronizeUserPrincipal(String name) throws SecurityException;
    
    /**
     * Synchronize all principals of a certain type.
     * @param principalTypeName
     */
    void synchronizePrincipalsByType(String principalTypeName) throws SecurityException;
    
    /**
     *  Synchronizes all principals.
     */
    void synchronizeAll() throws SecurityException;
    
}
