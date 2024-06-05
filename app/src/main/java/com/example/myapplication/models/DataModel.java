package com.example.myapplication.models;

public class DataModel {

    String name;
    String Description;
    int image;
    int id;

    public DataModel(String name, String Description, int image, int id) {
        this.name = name;
        this.Description = Description;
        this.image = image;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id;
    }
}


