package com.synthful.angst.model;

public class Branch {
    
    private Address location;
    private String manager;
    private int id;
    
    public Address getLocation() {
        return location;
    }
    public void setLocation(Address location) {
        this.location = location;
    }
    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
