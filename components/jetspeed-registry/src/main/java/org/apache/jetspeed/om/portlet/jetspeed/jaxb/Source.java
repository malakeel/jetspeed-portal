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
package org.apache.jetspeed.om.portlet.jetspeed.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Source extends JAXBElement<String> implements MetadataType
{
    protected final static QName NAME = new QName("http://www.purl.org/dc", "source");

    public Source(String value)
    {
        super(NAME, ((Class) String.class), null, value);
    }

    public String getMetadataName()
    {
        return "source";
    }

    public String getContent()
    {
        return this.getValue();
    }

    public String getLang()
    {
        return "en";
    }

    public void setContent(String value)
    {
        this.setValue(value);
    }
}
