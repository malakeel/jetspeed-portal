/*
 * Copyright 2008 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jetspeed.om.portlet;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/**
 * 
 * @version $Id: UserDataConstraint.java 755263 2009-03-17 14:23:52Z ate $
 *
 */
public interface UserDataConstraint extends org.apache.pluto.container.om.portlet.UserDataConstraint, Serializable
{
	Description getDescription(Locale locale);
    List<Description> getDescriptions();
    Description addDescription(String lang);
    void setTransportGuarantee(String transport);    
}