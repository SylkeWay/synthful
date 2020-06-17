package org.synthful.angst.camelot.process;

import org.apache.camel.Exchange;
import org.synthful.angst.camel.BasicProcessor;
import org.synthful.angst.camelot.model.AliveStatus;

public class Hello extends BasicProcessor{
    final static public String hello = "Hello";

    @Override
    public void process(Exchange exchange) throws Exception {
        logHeaders(exchange.getIn());
        
        exchange.getOut().setBody(hello);
    }
    

}
