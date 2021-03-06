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
package org.apache.jetspeed.security.stubs;

import org.apache.jetspeed.security.JetspeedPrincipal;
import org.apache.jetspeed.security.JetspeedPrincipalQueryContext;
import org.apache.jetspeed.security.JetspeedPrincipalResultList;


/**
 * @author <a href="mailto:ddam@apache.org">Dennis Dam</a>
 */

public class StubGroupManager extends StubJetspeedPrincipalManager
{

    
    public JetspeedPrincipal newPrincipal(String name, boolean mapped)
    {
        // TODO Auto-generated method stub
        return null;
    }

	public JetspeedPrincipalResultList getPrincipals(JetspeedPrincipalQueryContext queryContext) {
		throw new RuntimeException("Not implemented here.");
	}

}
