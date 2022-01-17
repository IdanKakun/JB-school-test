package com.idan.model;

import com.idan.model.person.Student;
import com.idan.model.person.Teacher;

import java.util.Arrays;

public class ClassRoom {
    private final String className;
    private Teacher teacher;
    private Student[] students = new Student[15];

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        for (int i = 0; i < 15; i++) {
            students[i] = new Student("student" + (i + 1));
        }
    }

    public String getClassName() {
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "ClassRoom{" +
                "className= '" + className + '\'' +
                ", teacher= " + teacher +
                ", students= " + Arrays.toString(students) +
                '}';
    }

    public static float getAvgClassroomGrades(ClassRoom classRoom) {
        float gradeSum = 0;
        float studentAvg = 0;
        float classSum = 0;
        for (Student student : classRoom.students) {
            for (Grade grade : student.getGrades()) {
                gradeSum += grade.getScore();
            }
            studentAvg = gradeSum / 6;
            classSum += studentAvg;
            gradeSum = 0;
        }
        return classSum / 15;
    }
}
