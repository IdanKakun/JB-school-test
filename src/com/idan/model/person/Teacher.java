package com.idan.model.person;

import com.idan.enums.Profession;

public class Teacher extends Person {
    private final Profession profession;

    public Teacher(String name, Profession profession) {
        super(name);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name= " + getName() +
                ", age= " + getAge() +
                ", profession=" + profession +
                '}';
    }

    public Profession getProfession() {
        return profession;
    }
}
