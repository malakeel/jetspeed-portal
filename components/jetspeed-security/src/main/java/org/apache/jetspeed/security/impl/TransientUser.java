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

package org.apache.jetspeed.security.impl;

import org.apache.jetspeed.security.JetspeedPrincipalType;
import org.apache.jetspeed.security.User;

/**
 * @version $Id: TransientUser.java 698049 2008-09-23 00:51:02Z ate $
 * 
 */
public class TransientUser extends TransientJetspeedPrincipal implements User
{
	private static final long serialVersionUID = 2966176187274497019L;

	public TransientUser(String name)
	{
		super(JetspeedPrincipalType.USER, name);
	}
}
