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
package org.apache.jetspeed.capabilities;

import org.apache.jetspeed.exception.JetspeedException;

/**
 * <p>
 * UnableToBuildCapabilityMapException
 * </p>
 * <p>
 *
 * </p>
 * @author <a href="mailto:weaver@apache.org">Scott T. Weaver</a>
 * @version $Id: UnableToBuildCapabilityMapException.java 516448 2007-03-09 16:25:47Z ate $
 *
 */
public class UnableToBuildCapabilityMapException extends JetspeedException
{

    /**
     * 
     */
    public UnableToBuildCapabilityMapException()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public UnableToBuildCapabilityMapException( String message )
    {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param nested
     */
    public UnableToBuildCapabilityMapException( Throwable nested )
    {
        super(nested);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param msg
     * @param nested
     */
    public UnableToBuildCapabilityMapException( String msg, Throwable nested )
    {
        super(msg, nested);
        // TODO Auto-generated constructor stub
    }

}
