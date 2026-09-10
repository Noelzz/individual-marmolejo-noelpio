package com.joysistvi.stage2.day19;

import java.sql.SQLOutput;

public class Student {
    private int id ;
    private String name;
    private int age;
    private String course;
    private String section;
    private String address;

   // Constructor



    // parametrerize Constructor
    public Student(int id, String name, int age, String course, String section, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
        this.address = address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
