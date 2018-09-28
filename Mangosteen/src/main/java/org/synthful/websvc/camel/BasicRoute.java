package org.synthful.websvc.camel;

import java.lang.invoke.MethodHandles;

import org.apache.camel.builder.RouteBuilder;

abstract public class BasicRoute extends RouteBuilder {
    final static private Class<?> classId = MethodHandles.lookup().lookupClass();
    final static private String DIRECT = "direct:";
    
    static public Class<?> getClassId() {
        return classId;
    }
    
    static public String getRouteId() {
        return DIRECT+classId.getSimpleName();
    }


}
