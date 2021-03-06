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
package org.apache.jetspeed.security.mapping.ldap.dao.impl;

import org.apache.jetspeed.security.mapping.ldap.dao.EntityRelationDAO;
import org.apache.jetspeed.security.mapping.model.SecurityEntityRelationType;

/**
 * @author <a href="mailto:ddam@apache.org">Dennis Dam</a>
 * @version $Id: AbstractRelationDAO.java 925214 2010-03-19 13:37:33Z ate $
 */
public abstract class AbstractRelationDAO implements EntityRelationDAO
{
    private SecurityEntityRelationType relationType;

    public SecurityEntityRelationType getRelationType()
    {
        return relationType;
    }

    public void setRelationType(SecurityEntityRelationType relationType)
    {
        this.relationType = relationType;
    }
}
