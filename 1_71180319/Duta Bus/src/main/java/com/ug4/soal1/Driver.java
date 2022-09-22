package com.ug4.soal1;

public class Driver {
    private String name;
    private int age;
    private String gender;

    public Driver (String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
    public String getName(){
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
