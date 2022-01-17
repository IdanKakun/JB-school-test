package com.idan.model;

import com.idan.enums.Profession;

public class Grade {
    private Profession profession;
    private int score;

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Grade(Profession profession, int score) {
        this.profession = profession;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "profession=" + profession +
                ", score=" + score +
                '}';
    }
}
