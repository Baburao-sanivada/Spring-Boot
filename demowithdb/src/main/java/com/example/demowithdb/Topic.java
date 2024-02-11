package com.example.demowithdb;
public class Topic {
    
    private int id;
    private String description;
    private String name;

    public Topic(int id, String name, String description) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public Topic(){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
   
    
}
