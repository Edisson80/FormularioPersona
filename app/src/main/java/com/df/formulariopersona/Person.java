package com.df.formulariopersona;

public class Person {
    private String name;
    private String lastName;
    private  String document;

    public Person(String name, String lastName, String document) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
