package APCompSci.ClassWork.Inheritance;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name?");
        String n = input.nextLine();
        System.out.println("What is the birth year of the person?");
        int bY = input.nextInt();;
        System.out.println("Are they a \n1. Student\n2. Instructor");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("What is their major?");
            input.nextLine();
            String m = input.nextLine();
            Student b = new Student(n, bY, m);
            System.out.println(b.toString());
        }
        if (choice == 2) {
            System.out.println("What is their salary?");
            double s = input.nextInt();
            Instructor b = new Instructor(n, bY, s);
            System.out.println(b.toString());
        }
        
    }

}