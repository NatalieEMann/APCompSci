package APCompSci.Assignments.Assign7;
/**
 * FILE: CarTester.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:  
 */

import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {
       
        while(true){
        Scanner input = new Scanner(System.in);
        Car myBeemer = new Car("Beemer", 29); // declaring the object
        Car c1 = new Car(30);
        System.out.println("Choose a Car: \n 1. Beemer \n 2. c1");
        int choice = input.nextInt();
        if(choice == 1){
            myBeemer.getName();
            System.out.println("How much gas to add to the tank?");
                double gas = input.nextDouble();
                myBeemer.addGas(gas);
            System.out.println("How far do you want to drive?");
                double distance = input.nextDouble();
                myBeemer.drive(distance);
            System.out.println(myBeemer);
        }
        if(choice == 2){
            c1.getName();
            System.out.println("How much gas to add to the tank?");
                double gas = input.nextDouble();
                c1.addGas(gas);
            System.out.println("How far do you want to drive?");
                double distance = input.nextDouble();
                c1.drive(distance);
            System.out.println(c1);
        }
        input.close();
    }
    }
}
