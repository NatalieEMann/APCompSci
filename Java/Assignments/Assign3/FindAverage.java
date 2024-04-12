/*------------------------------------------------
File: FindAverage.java
Date: Dec 2, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose: Test 
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Drop the lowest grade\n2. Drop the 2 lowest grades\n3. Bagels\n4. Bagels Bonus");
        int choice = input.nextInt();
        if (choice == 1) {
            double average;
            double smallest = 100;
            double num = 0;
            double[] i = new double[100];
            int far = 0;
            while (1 == 1) {
                System.out.println("Input -1 to calculate average.\nInput a grade: ");
                i[far] = input.nextDouble();
                if (smallest > i[far]) {
                    if (i[far] == -1) {
                        far = far - 1;
                        num = num - smallest;
                        average = num / far;
                        average = average * 100;
                        average = (int) (average + 0.5);
                        average = average / 100;
                        System.out.println("Taking out your lowest grade " + smallest + " Your average is: " + average);
                        break;
                    }
                    smallest = i[far];
                }
                num = i[far] + num;
                far++;
                //System.out.println("Sum so far: " + num + " Numbers so far: " + far + "\n");
            }

        }
        /*if (choice == 2) {
            double average;
            double smallest = 100;
            double smallest2 = 100;
            double num = 0;
            double[] i = new double[100];
            int far = 0;
            while (1 == 1) {
                System.out.println("Input -1 to calculate average.\nInput a grade: ");
                i[far] = input.nextDouble();
                if (smallest > i[far]) {
                    if (smallest2 > smallest && smallest2 > i[far]) {
                        if (i[far] == -1) {
                            far = far - 2;
                            num = num - smallest;
                            num = num - smallest2;
                            average = num / far;
                            average = average * 100;
                            average = (int) (average + 0.5);
                            average = average / 100;
                            System.out.println("Taking out your lowest grade " + smallest + " and " + smallest2 + " Your average is: " + average);
                            break;
                        }
                        smallest = i[far];
                        smallest = i[far];
                    }
                    num = i[far] + num;
                    far++;
                    //System.out.println("Sum so far: " + num + " Numbers so far: " + far + "\n");
                }
            }*/
        if (choice == 3) {
            while (1 == 1) {
                System.out.println("\nPlease enter number of bagels > 0, -1 to quit");
                double bagels = input.nextDouble();
                if (bagels == -1) {
                    System.exit(0);
                }
                for (int i = 1; i < bagels + 1; i++) {
                    System.out.print("O");

                    if (i % 12 == 0) {
                        System.out.print("\n");
                    }

                }
            }
        }
        /*if (choice == 4) {
            while (1 == 1) {
                System.out.println("\nPlease enter number of bagels > 0, -1 to quit");
                double bagels = input.nextDouble();
                if (bagels == -1) {
                    System.exit(0);
                }
                for (int i = 1; i < bagels + 1; i++) {
                    System.out.print("O");
                    int counter = 0;
                    if(counter==12){
                       counter--;   
                    }
                    if(counter==0){
                       counter++;
                    }
                }
            }
        }*/
    }
}
