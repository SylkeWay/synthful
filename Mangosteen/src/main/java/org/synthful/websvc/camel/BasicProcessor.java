package org.synthful.websvc.camel;

import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface BasicProcessor extends Processor {

    public default Logger logger() {
        return LogManager.getLogger();
    }
    
    public default void logHeaders(Message message) {
        message.getHeaders().forEach((key, value)->{
            logger().info("{} : {}", key, value);
        } );
    }

}
