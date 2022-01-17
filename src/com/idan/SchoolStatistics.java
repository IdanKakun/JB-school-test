package com.idan;

import com.idan.model.ClassRoom;
import com.idan.model.Grade;
import com.idan.model.School;
import com.idan.model.person.Student;

public class SchoolStatistics {

    private static void getGeneralGradesAverage(School school) {
        float gradesSum = 0;
        float studentCounter = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                for (Grade grade : student.getGrades()) {
                    studentCounter++;
                    gradesSum += grade.getScore();

                }

            }
        }
        System.out.println("The general grades average of school " + school.getName() + " is: " + gradesSum / studentCounter);
    }

    private static void getClassRoomGradesAverage(School school) {
        int amountOfClasses = school.getClassRooms().length;
        for (int i = 0; i < amountOfClasses; i++) {
            float averageClass = ClassRoom.getAvgClassroomGrades(school.getClassRooms()[i]);
            System.out.println("The average grades of " + school.getClassRooms()[i].getClassName() + " is: " + averageClass);
        }
    }


    private static void getProfessionGradeAverage(School school) {
        float mathSum = 0;
        float chemistrySum = 0;
        float geographySum = 0;
        float literatureSum = 0;
        float physicsSum = 0;
        float sportsSum = 0;
        float amountOfStudent = 75;

        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                for (Grade grade : student.getGrades()) {
                    switch (grade.getProfession()) {
                        case MATH:
                            mathSum += grade.getScore();
                            break;

                        case CHEMISTRY:
                            chemistrySum += grade.getScore();
                            break;

                        case GEOGRAPHY:
                            geographySum += grade.getScore();
                            break;

                        case LITERATURE:
                            literatureSum += grade.getScore();
                            break;

                        case PHYSICS:
                            physicsSum += grade.getScore();
                            break;

                        case SPORTS:
                            sportsSum += grade.getScore();
                            break;
                    }

                }
            }
        }
        System.out.println("The math average is: " + mathSum / amountOfStudent +
                "\nThe chemistry average is: " + chemistrySum / amountOfStudent +
                "\nThe geography average is: " + geographySum / amountOfStudent +
                "\nThe literature average is: " + literatureSum / amountOfStudent +
                "\nThe physics average is: " + physicsSum / amountOfStudent +
                "\nThe sports average is: " + sportsSum / amountOfStudent);
    }

    //Bonus of student age average
    private static void studentsAgeAverage(School school) {
        float studentCounter = 0;
        float ageSum = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                ageSum += student.getAge();
                studentCounter++;
            }
        }
        System.out.println("The average of students ages is: " + ageSum / studentCounter);
    }

    public static void main(String[] args) {
        School school = new School("ort");
        System.out.println(school);
        getGeneralGradesAverage(school);
        getProfessionGradeAverage(school);
        getClassRoomGradesAverage(school);
        studentsAgeAverage(school);
    }
}

