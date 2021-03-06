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
package org.apache.jetspeed.components.portletregistry;

import org.apache.jetspeed.exception.JetspeedException;


/**
Occurs when anything unexpected happens within Jetspeed and its Registry.  Any 

@author <a href="mailto:burton@apache.org">Kevin A. Burton</a>
@version $Id: RegistryException.java 516448 2007-03-09 16:25:47Z ate $
*/

public class RegistryException extends JetspeedException
 {

    public static final String REGISTRY_NOT_FOUND
        = "The specified registry does not exist.";

    public RegistryException() 
    {
        super();
    }

    public RegistryException( String message )
    {
        super( message );
    }

    public RegistryException(Throwable nested)
    {
        super(nested);
    }
    
    public RegistryException(String msg, Throwable nested)
    {
        super(msg, nested);
    }


}

