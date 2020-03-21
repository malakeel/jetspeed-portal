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
package org.apache.jetspeed.security;

import java.io.Serializable;
import java.security.Principal;

import javax.security.auth.Subject;

/**
 * <p>The Principal representing the User of a Subject</p>
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: UserSubjectPrincipal.java 725977 2008-12-12 12:06:29Z ate $
 */
public interface UserSubjectPrincipal extends Principal, Serializable
{
    public String getName();
    public User getUser();
    public Subject getSubject();
}
