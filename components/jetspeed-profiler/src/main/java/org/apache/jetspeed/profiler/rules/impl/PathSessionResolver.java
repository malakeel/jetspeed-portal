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
package org.apache.jetspeed.profiler.rules.impl;

import org.apache.jetspeed.om.page.ContentPage;
import org.apache.jetspeed.profiler.rules.RuleCriterion;
import org.apache.jetspeed.profiler.rules.RuleCriterionResolver;
import org.apache.jetspeed.request.RequestContext;

/**
 * PathSessionResolver
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: PathSessionResolver.java 891420 2009-12-16 20:38:20Z rwatler $
 */
public class PathSessionResolver implements RuleCriterionResolver
{
    /* (non-Javadoc)
     * @see org.apache.jetspeed.profiler.rules.RuleCriterionResolver#resolve(org.apache.jetspeed.request.RequestContext, org.apache.jetspeed.profiler.rules.RuleCriterion)
     */
    public String resolve(RequestContext context, RuleCriterion criterion)
    {        
        String path = null;
        ContentPage page = context.getPage();
        
        if (page != null)
        {
            path = page.getId();
        }
        else
        {
            path = context.getPath();
        }
        
        if ((path == null) || path.equals("/"))
        {
            String key = this.getClass() + "." + criterion.getName();
            path = (String)context.getSessionAttribute(key);
            if (path == null)
            {
                path = criterion.getValue();
            }
        }
        return path;            
    }
    
    /* (non-Javadoc)
     * @see org.apache.jetspeed.profiler.rules.RuleCriterionResolver#isControl()
     */
    public boolean isControl(RuleCriterion criterion)
    {
        return false;
    }
    
    public boolean isNavigation(RuleCriterion criterion)
    {
        return false;
    }
    
}
