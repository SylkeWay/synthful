package com.synthful.angst.model;

public class Message {
    final private String message;
    private String suffix = "";
    
    public void setSuffix(String suffix) {
        if (suffix==null || suffix.isEmpty()) return;
            
        this.suffix = " " + suffix;
    }

    public Message(String message){
        this.message = message;
    }

    public String toString() {
        return message + suffix;
    }
}
