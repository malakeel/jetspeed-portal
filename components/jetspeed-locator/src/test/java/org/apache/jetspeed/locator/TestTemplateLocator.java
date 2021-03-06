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
package org.apache.jetspeed.locator;

import java.util.ArrayList;

import org.apache.jetspeed.test.JetspeedTestCase;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestTemplateLocator
 *
 * @author <a href="mailto:taylor@apache.org">David Sean Taylor</a>
 * @version $Id: TestTemplateLocator.java 643159 2008-03-31 21:30:38Z ate $
 */
public class TestTemplateLocator extends JetspeedTestCase
{
    private JetspeedTemplateLocator templateLocator;

    public TestTemplateLocator(String name) 
    {
        super( name );
    }

    
    /**
     * Start the tests.
     *
     * @param args the arguments. Not used
     */
    public static void main(String args[]) 
    {
        junit.awtui.TestRunner.main( new String[] { TestTemplateLocator.class.getName() } );
    }

    public static Test suite()
    {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(TestTemplateLocator.class);
    }
            
    public void testLocateTemplate()
          throws Exception
    {
        // TemplateLocator component = (TemplateLocator)componentManager.getComponent("TemplateLocator");
        assertNotNull("template service is null", templateLocator);            
        LocatorDescriptor locator = templateLocator.createLocatorDescriptor("email");
        locator.setName("test.vm");
        TemplateDescriptor template = templateLocator.locateTemplate(locator);
        assertNotNull("template is null", template);
        System.out.println("template1 = " + template);
        assertTrue("template1 result", "type/email/name/test.vm".endsWith(template.toString()));
        
        LocatorDescriptor locator2 = templateLocator.createLocatorDescriptor("email");
        locator2.setName("htmltest.vm");
        locator2.setMediaType("html");        
        template = templateLocator.locateTemplate(locator2);
        assertNotNull("template is null", template);                
        System.out.println("template2 = " + template);            
        assertTrue("template2 result", "type/email/media-type/html/name/htmltest.vm".endsWith(template.toString()));

        LocatorDescriptor locator3 = templateLocator.createLocatorDescriptor("email");
        locator3.setName("entest.vm");
        locator3.setMediaType("html");
        locator3.setLanguage("en");                
        template = templateLocator.locateTemplate(locator3);
        assertNotNull("template is null", template);        
        System.out.println("template3 = " + template);            
        assertTrue("template3 result", "type/email/media-type/html/language/en/name/entest.vm".endsWith(template.toString()));

        LocatorDescriptor locator4 = templateLocator.createLocatorDescriptor("email");
        locator4.setName("ustest.vm");
        locator4.setMediaType("html");
        locator4.setLanguage("en");
        locator4.setCountry("US");                
        template = templateLocator.locateTemplate(locator4);
        assertNotNull("template is null", template);        
        System.out.println("template4 = " + template);            
        assertTrue("template4 result", 
            "type/email/media-type/html/language/en/country/US/name/ustest.vm".endsWith(template.toString()));

        // test fallback
        LocatorDescriptor locator5 = templateLocator.createLocatorDescriptor("email");
        locator5.setName("entest.vm");
        locator5.setMediaType("html");
        locator5.setLanguage("en");
        locator5.setCountry("UZ");                
        template = templateLocator.locateTemplate(locator5);
        assertNotNull("template is null", template);        
        System.out.println("template5 = " + template);            
        assertTrue("template5 result", 
            "type/email/media-type/html/language/en/name/entest.vm".endsWith(template.toString()));

        // test fallback all the way to email
        LocatorDescriptor locator6 = templateLocator.createLocatorDescriptor("email");
        locator6.setName("test.vm");
        locator6.setMediaType("html");
        locator6.setLanguage("en");
        locator6.setCountry("UZ");                
        template = templateLocator.locateTemplate(locator6);
        System.out.println("template6 = " + template);            
        assertTrue("template6 result", 
            "type/email/name/test.vm".endsWith(template.toString()));
                    
    }
    
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception
    {
        ArrayList roots = new ArrayList(1);
        roots.add(getBaseDir()+"target/test-classes/templates");
        ArrayList classes = new ArrayList(2);
        classes.add(JetspeedTemplateDescriptor.class);
        classes.add(JetspeedLocatorDescriptor.class);
        
        templateLocator = new JetspeedTemplateLocator(roots, classes, "email", "./");
        templateLocator.start();
    }
}
