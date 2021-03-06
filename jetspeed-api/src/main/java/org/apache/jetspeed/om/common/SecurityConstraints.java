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
package org.apache.jetspeed.om.common;

import java.util.List;

/**
 * <p>
 * SecurityConstraints
 * </p>
 * <p>
 * Used to specify security constraints for a resource.
 *
 * </p>
 * @author <a href="mailto:rwatler@finali.com">Randy Watler</a>
 * @version $Id: SecurityConstraints.java 1576070 2014-03-10 20:31:10Z taylor $
 *
 */
public interface SecurityConstraints
{   
    /**
     * <p>
     * getOwner
     * </p>
     *
     * @return owner constraint for resource 
     */
    String getOwner();
    
    /**
     * <p>
     * setOwner
     * </p>
     *
     * @param owner constraint for resource
     */
    void setOwner(String owner);

    /**
     * <p>
     * getSecurityConstraints
     * </p>
     *
     * @return security constraints list for resource
     */
    List<SecurityConstraint> getSecurityConstraints();
    
    /**
     * <p>
     * setSecurityConstraint
     * </p>
     *
     * @param constraints security constraints for resource
     */
    void setSecurityConstraints(List<SecurityConstraint> constraints);

    /**
     * <p>
     * getSecurityConstraintsRefs
     * </p>
     *
     * @return security constraints references for resource
     */
    List<String> getSecurityConstraintsRefs();
    
    /**
     * <p>
     * setSecurityConstraintsRefs
     * </p>
     *
     * @param constraintsRefs security constraints references for resource
     */
    void setSecurityConstraintsRefs(List<String> constraintsRefs);

    /**
     * <p>
     * isEmpty
     * </p>
     *
     * @return flag indicating whether there are constraints or owner set
     */
    boolean isEmpty();
}
