package org.synthful.websvc.restology.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Service;
import org.synthful.websvc.restology.model.AliveStatus;
import org.synthful.websvc.restology.process.Alive;

@Service
public class MainRoute extends RouteBuilder {
    
    private interface Constants {
        String APPLICATION_XML = "application/xml";
    }
    

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet")
        .bindingMode(RestBindingMode.xml)
        .dataFormatProperty("prettyPrint", "true")
        ;
    
        rest().description("Restive festive")
        .get("/alive").description("alive")
            .consumes(Constants.APPLICATION_XML).produces(Constants.APPLICATION_XML)
            .outType(AliveStatus.class)
            .route()
                .process(new Alive())
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
