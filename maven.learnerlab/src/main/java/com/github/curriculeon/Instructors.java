package com.github.curriculeon;

/**
 * Created by leon on 7/27/2020.
 */
public class Instructors extends People {
    private static final Instructors instance = new Instructors();

    public Instructors() {
        this.add(new Instructor(0L, "Leon Hunter"));
        this.add(new Instructor(1L, "Haseeb Muhammad"));
    }

    public static Instructors getInstance() {
        return instance;
    }
}
