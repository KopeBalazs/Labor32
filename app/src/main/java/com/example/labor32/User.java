package com.example.labor32;

import java.util.ArrayList;

public class User {

    private String name = "";
    private String passw = "";
    private String date = "";
    private ArrayList<String> hobbies= new ArrayList<String>();

    public User(){
        this.name="";
        this.passw="";
        this.date="";
        hobbies.add("");
    }

    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
    }
}