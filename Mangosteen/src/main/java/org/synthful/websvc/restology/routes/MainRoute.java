package org.synthful.websvc.restology.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.synthful.websvc.camel.BasicRoute;
import org.synthful.websvc.restology.model.AliveStatus;
import org.synthful.websvc.restology.model.Request;
import org.synthful.websvc.restology.process.Alive;
import org.synthful.websvc.restology.process.RequestResponse;

/**
 * 
 * @author SylkWay
 * 
 * Example url:
 * http://localhost:8080/Mangosteen/web/alive
 * 
 *
 */
@Service
public class MainRoute extends BasicRoute {
    

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet")
        .bindingMode(RestBindingMode.xml)
        .dataFormatProperty("prettyPrint", "true")
        ;
    
        rest().description("Restive festive")
            .get("/alive").description("alive")
                .produces(MediaType.APPLICATION_XML_VALUE)
                .outType(AliveStatus.class)
                .route()
                    .process(new Alive())
                .endRest()
                
            .get("/alive/autobind")
                .outType(AliveStatus.class)
                .route()
                    .process(new Alive())
                .endRest()
                .bindingMode(RestBindingMode.auto)

            .get("/shoresh")
                .consumes(MediaType.APPLICATION_XML_VALUE).produces(MediaType.TEXT_HTML_VALUE)
                .outType(Request.class)
                .type(Request.class)
                .route()
                    .process(new RequestResponse())
                    .log("routeid = " + getRouteId())
                .endRest()
                
                
        ;
    }
}
