package org.synthful.angst.camelot.process;

import org.apache.camel.Exchange;
import org.synthful.angst.camel.BasicProcessor;
import org.synthful.angst.camelot.model.AliveStatus;

public class Alive extends BasicProcessor{

    @Override
    public void process(Exchange exchange) throws Exception {
        logHeaders(exchange.getIn());
        
        AliveStatus response = new AliveStatus();
        exchange.getOut().setBody(response);
    }
    

}
