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
package org.apache.jetspeed.sso;

import java.io.Writer;


/**
 * @author <a href="mailto:ddam@apache.org">Dennis Dam</a>
 * @version $Id: SSOClient.java 734954 2009-01-16 10:07:13Z ddam $
 */
public interface SSOClient
{

    String get(String url, boolean refreshProxy) throws SSOException;
    void write(String url, boolean refreshProxy, Writer out) throws SSOException;
    
}
