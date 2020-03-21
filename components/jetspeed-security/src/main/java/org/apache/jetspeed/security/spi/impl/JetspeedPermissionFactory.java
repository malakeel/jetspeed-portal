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

package org.apache.jetspeed.security.spi.impl;

import org.apache.jetspeed.security.spi.PersistentJetspeedPermission;

/**
 * @version $Id: JetspeedPermissionFactory.java 700788 2008-10-01 14:33:30Z ate $
 *
 */
public abstract class JetspeedPermissionFactory
{
    private String type;

    public JetspeedPermissionFactory(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    
    public abstract BaseJetspeedPermission newPermission(String name, String actions);    

    public abstract BaseJetspeedPermission newPermission(String name, int mask);    

    public abstract BaseJetspeedPermission newPermission(PersistentJetspeedPermission permission);    
}
