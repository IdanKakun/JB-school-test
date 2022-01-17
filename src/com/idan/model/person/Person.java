package com.idan.model.person;


import java.util.Random;

public class Person {
    private final String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = new Random().nextInt(120 - 20) + 20;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
