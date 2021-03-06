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

package org.apache.jetspeed.security;

import javax.security.auth.Subject;

/**
 * @version $Id: UserSubjectPrincipalImpl.java 696058 2008-09-16 21:06:19Z ate $
 *
 */
public class UserSubjectPrincipalImpl implements UserSubjectPrincipal
{
    private static final long serialVersionUID = -2269455453318109892L;
    private final User user;
    private Subject subject;
    
    public UserSubjectPrincipalImpl(User user)
    {
        this.user = user;
    }
    public String getName()
    {
        return user.getName();
    }
    public User getUser()
    {
        return user;
    }
    public Subject getSubject()
    {
        return subject;
    }
    
    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }
}