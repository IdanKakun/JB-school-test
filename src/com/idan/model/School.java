package com.idan.model;

import com.idan.enums.Profession;
import com.idan.model.person.Teacher;

import java.util.Arrays;


public class School {
    private final String name;
    private ClassRoom[] classRooms = new ClassRoom[5];

    @Override
    public String toString() {
        return "School{" +
                "name= '" + name + '\'' +
                ", classRooms= " + Arrays.toString(classRooms) +
                '}';
    }

    public String getName() {
        return name;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    public School(String name) {
        this.name = name;
        for (int i = 0; i < 5; i++) {
            classRooms[i] = new ClassRoom("class" + (i + 1), new Teacher("teacher" + (i + 1), Profession.getRandom()));
        }
    }
}
