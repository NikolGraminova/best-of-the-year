package org.web.entertainment.bestoftheyear.model;

public class Info {

    // fields
    private String firstName;
    private String lastName;


    // constructors
    public Info(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
    }

    public Info() {
    }


    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
