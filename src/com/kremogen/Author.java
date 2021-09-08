package com.kremogen;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public char getGender(){
        return gender;
    }
}
