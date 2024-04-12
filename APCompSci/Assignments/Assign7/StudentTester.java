package APCompSci.Assignments.Assign7;

/**
 * FILE: StudentTester.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:  
 */

import java.util.Scanner;

public class StudentTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        Student s = new Student(input.nextLine());
        System.out.println("How many quizzes to input?");

        for (int i = input.nextInt(); i >= 0; i--) {
            if (i == 0) {
                if (s.getAverageScore() == -1) { // if there is no such quizzes 
                    System.out.println("No Quizzes");
                }
                System.out.println(s);
                System.out.println("\nClear? \nYes - 1\nNo - 2");
                int choice = input.nextInt();
                if (choice == 1) {
                    s.clear();
                }
                break;
            }
            System.out.println("Quiz grade:");
            s.addQuiz(input.nextInt());

        }
    }
}
