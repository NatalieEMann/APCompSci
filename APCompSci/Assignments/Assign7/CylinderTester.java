package APCompSci.Assignments.Assign7;
/**
 * FILE: CylinderTester.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:
 */
import java.util.Scanner;

public class CylinderTester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nRun? \n1. Yes \n0. No");
            int i = input.nextInt();
            if (i == 1) {
                System.out.println("\n1. r & l = v\n2. v & r = l");
                int choice = input.nextInt();
                if (choice == 1) {
                    Cylinder c1 = new Cylinder(0, 0);
                    System.out.println("Give a radius");
                    c1.setRadius(input.nextDouble());
                    System.out.println("Give a length");
                    c1.setLength(input.nextDouble());
                    c1.getVolume();
                    System.out.println(c1);
                } else if (choice == 2) {
                    Cylinder c2 = new Cylinder(0, 0);
                    System.out.println("Desired Volume");
                    c2.setVolume(input.nextDouble());
                    System.out.println("Give a radius");
                    c2.setRadius(input.nextDouble());
                    c2.getLenFromVol();
                    System.out.println(c2);
                }
            } else if (i == 0) {
                System.exit(0);
            }
            input.close();
        }
    }
}
