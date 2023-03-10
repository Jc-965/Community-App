package com.example.community;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;

    }

    //Change later on
    public User(){
        name = "Joe";
    }

    //Profile
}
