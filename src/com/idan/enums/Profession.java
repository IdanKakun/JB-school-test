package com.idan.enums;

public enum Profession {
    MATH,
    CHEMISTRY,
    GEOGRAPHY,
    LITERATURE,
    PHYSICS,
    SPORTS;

    public static Profession getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
