package org.example.app.model;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private String name;
    private boolean isMarked;

    public Product(UUID id, String name){
        this.uuid = id;
        this.name = name;
        this.isMarked = false;
    }

    public UUID getUUID() {
        return this.uuid;
    }
    public String getName() {
        return this.name;
    }
    public boolean getIsMarked() {
        return this.isMarked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarked() {
        this.isMarked = !this.isMarked;
    }

}