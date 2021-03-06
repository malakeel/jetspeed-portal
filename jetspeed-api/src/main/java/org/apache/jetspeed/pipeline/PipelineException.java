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
package org.apache.jetspeed.pipeline;

import org.apache.jetspeed.exception.JetspeedException;

/**
  * Occurs when anything unexpected happens within Jetspeed and the Pipeline.
  *
  * @author <a href="mailto:david@bluesunrise.com">David Sean Taylor</a>
  * @version $Id: PipelineException.java 1595089 2014-05-16 02:42:46Z taylor $
  */

public class PipelineException extends JetspeedException
 {

    public PipelineException() 
    {
        super();
    }

    public PipelineException( String message )
    {
        super( message );
    }

    public PipelineException(Throwable nested)
    {
        super(nested);
    }
    
    public PipelineException(String msg, Throwable nested)
    {
        super(msg, nested);
    }

}
