package org.synthful.angst.camel;

import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract public class BasicProcessor implements Processor {
    protected Logger log = LoggerFactory.getLogger(getClass());

    public void logHeaders(Message message) {
        message.getHeaders().forEach((key, value)->{
            log.info("{} : {}", key, value);
        } );
    }
}
