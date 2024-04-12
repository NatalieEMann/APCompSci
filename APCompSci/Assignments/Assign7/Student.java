package APCompSci.Assignments.Assign7;
/**
 * FILE: Student.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:
 */
public class Student {

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //++++++++++++++ S T A T I C V A R I A B L E S ++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static double totalPts = 0;
    public static int totalQuizzes = 0;
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S ---------
    //----------------------------------------------------------------
    // if no quizzes -1
    private double gradePoints;
    private double quizzes;
    private String name;
    private double average;

    /////////////////////////////////////////////////////////////////
    //////////////////// C O N S T R U C T O R S ////////////////////
    /////////////////////////////////////////////////////////////////
    public Student(String n) {
        name = n;
    }

    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public String getName() {
        return name;
    }

    public double getTotalScore() {
        return (int) totalPts;
    }

    public int getTotalQuizzes() {
        return totalQuizzes;
    }

    public int getAverageScore() {
        // returns int rounded (whole)
        if (gradePoints == 0) {
            return -1;
        }
        average = Math.round(gradePoints / quizzes);
        return (int) average;
    }

    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void addQuiz(int score) {
        try {
            if (score < 0) {
                throw new IllegalArgumentException("No");
            } else {
                gradePoints += score;
                totalPts += score;
                quizzes++;
                totalQuizzes++;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Tried to add negative amount of quizzes.");
            System.exit(0);
        }
    }

    public void clear() {
        //sets all to 0 / null
        totalPts -= gradePoints;
        totalQuizzes -= quizzes;
        gradePoints = 0;
        quizzes = 0;
    }

    @Override
    public String toString() {
        return "Average: " + average + "\nTotal Quizzes: " + totalQuizzes + "\nTotal Points: " + totalPts;
    }
}
