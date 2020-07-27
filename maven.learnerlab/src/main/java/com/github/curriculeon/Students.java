package com.github.curriculeon;

/**
 * Created by leon on 7/27/2020.
 * existing independent of an instance of the class that defines it
 */
public class Students extends People {
    private static final Students instance = new Students();

    //private constructor to avoid client applications to use constructor
    private Students(){
        super(); // optional invocation
        this.add(new Student(0L, "Julia"));
        this.add(new Student(1L, "David Y"));
        this.add(new Student(2L, "Ghasan"));
    }

    public static Students getInstance(){
        return instance;
    }
}
