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
package org.apache.jetspeed.maven.utils;

import java.io.File;
import java.util.zip.ZipEntry;

/**
 * FileEntry
 * 
 * @version $Id: FileEntry.java 930226 2010-04-02 10:10:35Z woonsan $
 */
public class FileEntry
{
    private ZipEntry zipEntry;
    private File file;
    private String name;
    
    public FileEntry(ZipEntry zipEntry)
    {
        this.zipEntry = zipEntry;
    }
    
    public FileEntry(File file, String name)
    {
        this.file = file;
        this.name = name;
    }
    
    public boolean isDirectory()
    {
        if (zipEntry != null)
        {
            return zipEntry.isDirectory();
        }
        
        return file.isDirectory();
    }
    
    public String getName()
    {
        if (zipEntry != null)
        {
            return zipEntry.getName();
        }
        
        return name;
    }
    
    public long getTime()
    {
        if (zipEntry != null)
        {
            return zipEntry.getTime();
        }
        
        return file.lastModified();
    }
    
    public Object getEntryObject()
    {
        return (zipEntry != null ? zipEntry : file);
    }
}
