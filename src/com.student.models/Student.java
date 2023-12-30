package com.student.models;

public class Student {

    private String cin;
    private String name;
    private String age;

    public student() {
    }

    public student(String cin, String name, String age) {
        this.cin = cin;
        this.name = name;
        this.age = age;
    }

    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
