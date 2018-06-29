package org.synthful.websvc.restology.process;

import org.apache.camel.Exchange;
import org.synthful.websvc.camel.BasicProcessor;
import org.synthful.websvc.restology.model.AliveStatus;
import org.synthful.websvc.restology.model.Request;

public class RequestResponse implements BasicProcessor{

    @Override
    public void process(Exchange exchange) throws Exception {
        logHeaders(exchange.getIn());
        Request req = (Request) exchange.getIn().getBody();
        exchange.getOut().setBody(req);
    }
    

}
