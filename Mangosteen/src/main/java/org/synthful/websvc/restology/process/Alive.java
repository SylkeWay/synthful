package org.synthful.websvc.restology.process;

import org.apache.camel.Exchange;
import org.synthful.websvc.camel.BasicProcessor;
import org.synthful.websvc.restology.model.AliveStatus;

public class Alive implements BasicProcessor{

    @Override
    public void process(Exchange exchange) throws Exception {
        logHeaders(exchange.getIn());
        
        AliveStatus response = new AliveStatus();
        exchange.getOut().setBody(response);
    }
    

}
