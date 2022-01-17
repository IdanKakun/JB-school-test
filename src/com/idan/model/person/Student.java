package com.idan.model.person;

import com.idan.enums.Profession;
import com.idan.model.Grade;

import java.util.Arrays;
import java.util.Random;

public class Student extends Person {
    private Grade[] grades = {
            new Grade(Profession.MATH, new Random().nextInt(100 - 40) + 40),
            new Grade(Profession.CHEMISTRY, new Random().nextInt(100 - 40) + 40),
            new Grade(Profession.GEOGRAPHY, new Random().nextInt(100 - 40) + 40),
            new Grade(Profession.LITERATURE, new Random().nextInt(100 - 40) + 40),
            new Grade(Profession.PHYSICS, new Random().nextInt(100 - 40) + 40),
            new Grade(Profession.SPORTS, new Random().nextInt(100 - 40) + 40)
    };


    public Student(String name) {
        super(name);
    }

    public Grade[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + getName() +
                ", age= " + getAge() +
                ", grades= " + Arrays.toString(grades) +
                '}';
    }
}
