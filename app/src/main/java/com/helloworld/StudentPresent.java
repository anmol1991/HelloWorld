package com.helloworld;

/**
 * Created by cdot on 7/4/17.
 */

public class StudentPresent {
    String name;
    String course;

    public StudentPresent(String Name,String Course){
        this.name = Name;
        this.course =Course;
        ;
    }

    @Override
    public String toString() {
        return "StudentPresent{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
