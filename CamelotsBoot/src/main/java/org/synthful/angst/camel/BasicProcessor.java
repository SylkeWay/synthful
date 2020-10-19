package org.synthful.angst.camel;

import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract public class BasicProcessor implements Processor {
    protected Logger log = LogManager.getLogger(getClass());

    public void logHeaders(Message message) {
        message.getHeaders().forEach((key, value)->{
            log.info("{} : {}", key, value);
        } );
    }
}
