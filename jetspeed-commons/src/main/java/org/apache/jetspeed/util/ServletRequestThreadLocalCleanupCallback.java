package org.apache.jetspeed.util;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
/**
 * @version $Id: ServletRequestThreadLocalCleanupCallback.java 1101917 2011-05-11 15:19:31Z ate $
 *
 */
public class ServletRequestThreadLocalCleanupCallback implements ServletRequestCleanupCallback
{
    private ThreadLocal<?> threadLocal;
    
    public ServletRequestThreadLocalCleanupCallback(ThreadLocal<?> threadLocal)
    {
        this.threadLocal = threadLocal;
        ServletRequestCleanupService.addCleanupCallback(this);
    }
    
    public void cleanup(ServletContext context, HttpServletRequest request, HttpServletResponse response)
    {
        threadLocal.remove();
    }
}
