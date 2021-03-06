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
package org.apache.jetspeed.spaces;

import java.io.Serializable;

import org.apache.jetspeed.om.folder.Folder;

/**
 * Environment implementation, environments are collections of folders holding links to other folders 
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: EnvironmentImpl.java 903904 2010-01-27 23:30:43Z taylor $
 */
public class EnvironmentImpl extends BaseSpaceImpl implements Environment, Serializable
{  
    private static final long serialVersionUID = 1L;    
    
    public EnvironmentImpl(Folder folder)
    {
        this.backingFolder = folder;
    }   
    
	@Override    
    protected String getOwnerFieldName()
    {
    	return META_ENV_OWNER;
    }	
    
}
