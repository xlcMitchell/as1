package com.example.bit603_mitchell_travis_5080526_as1;

/*
The pokemon class is created because we will be creating many different pokemon
objects in our application. The class acts as a blue print for creating pokemon
objects and saves us from repeating code. Instead we can just create a new pokemon
object for each pokemon with different parameters representing the distinct characteristics
of each pokemon.This demonstrates the OOP principle of instantiation and reduces code duplication.
 */


import java.io.Serializable;

public class Pokemon implements Serializable {
    private int imageResourceID;
    private String name;
    private String description;
    private String height;
    private String category;
    private String weight;
    private String ability;

    public Pokemon(int imageResourceID,String name,String description,
                   String height, String category,
                   String weight,String ability){
           this.imageResourceID = imageResourceID;
           this.name = name;
           this.description = description;
           this.height = height;
           this.category = category;
           this.weight = weight;
           this.ability = ability;
    }


    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int id) {
        this.imageResourceID = id;
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


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }



}
