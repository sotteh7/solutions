package com.github.perscholas;

import java.util.Scanner;

/**
 * Created by leon on 7/14/2020.
 */
public class MainApplication {
    public static void main(String[] args) {
        do {
            GradeEvaluator gradeEvaluator = new GradeEvaluator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("What score did the student receive in the class?");
            String studentScoreAsString = scanner.nextLine();
            Double studentScoreAsDouble = Double.parseDouble(studentScoreAsString);
            Character studentGrade = gradeEvaluator.getGrade(studentScoreAsDouble);
            System.out.println("The student's class-score was " + studentScoreAsString);
            System.out.println("The student's grade was " + studentGrade);
        } while(true);
    }
}
