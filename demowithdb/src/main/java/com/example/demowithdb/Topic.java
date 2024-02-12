package com.example.demowithdb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    
    @Id
    private String id;
    private String description;
    private String name;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public Topic(){

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
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
