package com.example.community;

public class User {

    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public User(){
        name = "Sample"; email = "Sample@email.com";
    }

    //Profile
}
