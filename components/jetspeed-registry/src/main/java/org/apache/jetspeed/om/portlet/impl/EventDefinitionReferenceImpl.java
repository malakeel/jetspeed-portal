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

package org.apache.jetspeed.om.portlet.impl;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.jetspeed.om.portlet.EventDefinitionReference;

/**
 * @version $Id: EventDefinitionReferenceImpl.java 746039 2009-02-19 22:45:54Z taylor $
 *
 */
public class EventDefinitionReferenceImpl extends PortletQNameImpl implements EventDefinitionReference, Serializable
{
    private static final long serialVersionUID = 1L;

    public EventDefinitionReferenceImpl()
    {
        super();
    }
    
    public EventDefinitionReferenceImpl(QName qname)
    {
        super(qname);
    }

    public EventDefinitionReferenceImpl(String qname)
    {
        super(new QName(qname));
    }
    
    public String getName()
    {
        return super.getLocalPart();
    }

    public QName getQualifiedName(String defaultNamespace)
    {
        return super.getQName();
    }
}
