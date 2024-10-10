package com.abhi.springboot.thymeleafdemo.models;

import java.util.List;

public class Student {
    private String firstName ;
    private String lastName ;
    private String country ;
    private String favoriteProgrammingLanguage ;
    private List<String> favOperatingSystem ;


    public Student(){
    }

    public Student(String firstName, String lastName, String country, String favoriteProgrammingLanguage, List<String> favOperatingSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country ;
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
        this.favOperatingSystem = favOperatingSystem;
    }

    public List<String> getFavOperatingSystem() {
        return favOperatingSystem;
    }

    public void setFavOperatingSystem(List<String> favOperatingSystem) {
        this.favOperatingSystem = favOperatingSystem;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
