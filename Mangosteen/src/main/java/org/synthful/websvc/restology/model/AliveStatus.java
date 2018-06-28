package org.synthful.websvc.restology.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "AliveStatus")
public class AliveStatus {
    private String Status;

    @XmlElement (name="status")
    public String getStatus() {
        return "Alive";
    }

    @XmlElement (name="date")
    public String getDate() {
        return new Date().toString();
    }
}
