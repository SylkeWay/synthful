package org.synthful.websvc.restology.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Request")
public class Request {
    @XmlElement (name="root")
    public String root;
}
