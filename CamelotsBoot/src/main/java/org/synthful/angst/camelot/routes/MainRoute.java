package org.synthful.angst.camelot.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
import org.synthful.angst.camelot.model.AliveStatus;
import org.synthful.angst.camelot.process.Alive;
import org.synthful.angst.camelot.process.Hello;

@Component
public class MainRoute extends RouteBuilder {
    
    private interface Constants {
        String APPLICATION_XML = "application/xml";
        String TEXT_PLAIN = "text/plain";
    }
    

    @Override
    public void configure() throws Exception {
        CamelContext context = new DefaultCamelContext();

        restConfiguration()
            .component("servlet")
            .bindingMode(RestBindingMode.xml)
            .dataFormatProperty("prettyPrint", "true")
            .contextPath("camelot")
        ;
    
        rest("/w").description("Alive probe")
        .get("/alive").description("alive")
        .consumes(Constants.APPLICATION_XML).produces(Constants.APPLICATION_XML)
        .outType(AliveStatus.class)
        .route()
            .process(new Alive())
        .endRest()
        .get("/hello").description("alive")
        .consumes(Constants.APPLICATION_XML).produces(Constants.TEXT_PLAIN)
        .outType(String.class)
        .route()
            .process(new Hello())
        .endRest()
/*
        .post("/fried").description("get fried")
            .consumes(Constants.APPLICATION_XML).produces(Constants.APPLICATION_XML)
            .type(InDTO.class)
            .to(newRouteBuilder)
            .outType(OutDTO.class)
*/
        ;
    }
}
