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
package org.apache.commons.scxml2.model;

import java.util.Set;

import org.apache.commons.scxml2.SCXMLExecutor;
import org.apache.commons.scxml2.SCXMLTestHelper;
import org.junit.Assert;
import org.junit.Test;

public class ScriptTest {

    /**
     * Test JEXL script execution.
     */    
    @Test
    public void testJexlScriptExecution() throws Exception {
        SCXMLExecutor exec = SCXMLTestHelper.getExecutor("org/apache/commons/scxml2/env/jexl/script-01.xml");
        exec.go();
        Set<EnterableState> currentStates = exec.getStatus().getStates();
        Assert.assertEquals(1, currentStates.size());
        Assert.assertEquals("end", currentStates.iterator().next().getId());
    }

    /**
     * Test JS script execution.
     */
    @Test
    public void testJavaScriptExecution() throws Exception {
        SCXMLExecutor exec = SCXMLTestHelper.getExecutor("org/apache/commons/scxml2/env/javascript/script-01.xml");
        exec.go();
        Set<EnterableState> currentStates = exec.getStatus().getStates();
        Assert.assertEquals(1, currentStates.size());
        Assert.assertEquals("end", currentStates.iterator().next().getId());
    }

}
