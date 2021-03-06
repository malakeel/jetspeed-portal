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
package org.apache.jetspeed.userinfo;


import java.util.Collection;
import java.util.Map;

import javax.security.auth.Subject;

import org.apache.jetspeed.om.portlet.UserAttributeRef;
import org.apache.jetspeed.request.RequestContext;

/**
 * Required Interface for a User Attribute Source
 * 
 * @author <a href="mailto:KeithGarry.Boyce@bcbsma.com">Keith Garry Boyce</a>
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: $
 */
public interface UserAttributeSource 
{	
	Map<String, String> getUserAttributeMap(Subject subject, Collection<UserAttributeRef> userAttributeRefs, RequestContext context) 
        throws UserAttributeRetrievalException;
}
