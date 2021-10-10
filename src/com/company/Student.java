package com.company;


public class Student {
    boolean isAlive;
    String forename;
    String surname;
    String birthDay;
    String country;
    int age;

    public Student(String forename, String surname, String birthDay, String country){
        isAlive=true;
        this.forename=forename;
        this.surname=surname;
        this.birthDay=birthDay;
        this.country=country;
    }

    public void setAge(int age) {
        this.age = age;
    }

}