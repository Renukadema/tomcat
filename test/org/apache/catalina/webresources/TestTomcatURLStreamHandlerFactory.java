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
package org.apache.catalina.webresources;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

import org.junit.Test;

/**
 * @deprecated Code under test is deprecated and will be removed in Tomcat 11
 */
@Deprecated
public class TestTomcatURLStreamHandlerFactory {

    @Test
    public void testUserFactory() throws Exception {
        URLStreamHandlerFactory factory = new URLStreamHandlerFactory() {
            @Override
            public URLStreamHandler createURLStreamHandler(String protocol) {
                return null;
            }
        };
        TomcatURLStreamHandlerFactory.getInstance().addUserFactory(factory);
        TomcatURLStreamHandlerFactory.release(factory.getClass().getClassLoader());
    }
}