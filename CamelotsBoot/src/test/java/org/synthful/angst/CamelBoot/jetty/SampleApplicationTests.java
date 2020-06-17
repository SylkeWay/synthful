/*
 * Copyright 2012-2014 the original author or authors.
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

package org.synthful.angst.CamelBoot.jetty;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.synthful.angst.camelot.CamelotSpringBootStarter;
import org.synthful.angst.camelot.process.Hello;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CamelotSpringBootStarter.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = "server_port=0")
@DirtiesContext
public class SampleApplicationTests {

    @LocalServerPort
    private int port;
    @Value("${camel.component.servlet.mapping.contextPath}")
    private String contextPath;

    @Test
    public void testHome() throws Exception {
        ResponseEntity<String> entity = new TestRestTemplate().getForEntity(
                String.format("http://localhost:%s/camelot/w/hello", this.port), String.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(Hello.hello , entity.getBody());
    }

}
