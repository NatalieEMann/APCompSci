package APCompSci.Assignments.Assign7;
import java.util.Scanner;

/**
 * FILE: PlanetTester.java DATE: Nov 20, 2023 AUTHOR: Natalie Mann VERSION: 1.0
 * PURPOSE:
 */
public class PlanetTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Planet Earth = new Planet("Earth", 365.26);
        Planet Mars = new Planet("Mars", 686.98);

        Earth.addDays(500);
        Mars.addDays(500);
        Earth.getNumOrbits();
        Earth.getDaysTowardsNext();
        Mars.getNumOrbits();
        Mars.getDaysTowardsNext();
        
        System.out.println(Earth);
        System.out.println(Mars);
        System.out.println("Please enter a # of days: "); // input days to add to each planet
        double days = input.nextDouble();
        Earth.addDays(days);
        Mars.addDays(days);
        System.out.println("Days Passed: " + Planet.daysAdd);
        
        input.close();
    }
}
