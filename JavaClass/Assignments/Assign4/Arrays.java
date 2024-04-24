package JavaClass.Assignments.Assign4;

/*------------------------------------------------
File: Arrays.java
Date: Nov 7, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose:
Sauce Code: 3

https://mrhanleyc.com/java/assigns/Java_Assignment4_Budget.pdf - website for the explanation on the project
------------------ team20.com ------------------*/
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String cat1[] = new String[15];
            cat1[0] = "*FIT";
            cat1[1] = "NYS";
            cat1[2] = "SS";
            double amt1[] = new double[15];
            amt1[0] = 480;
            amt1[1] = 240;
            amt1[2] = 300;
            String cat2[] = new String[15];
            cat2[0] = "*FIT";
            cat2[1] = "NYS";
            cat2[2] = "SS";
            double amt2[] = new double[15];
            amt2[0] = 0.12;
            amt2[1] = 0.06;
            amt2[2] = 0.075;
            System.out.println("Choose an option (Click a number to choose the option) \n0. Exit \n1. Display Sample Budget 1 \n2. Display Sample Budget 2 \n3. Enter Actual Budget \n4. Display Actual Budget \n5. Clear Actual Budget \n6. Load Budget From Disk \n7. Save Budget to Disk \n8. Pie Chart");
            int Choice = input.nextInt();
            if (Choice == 0) {
                System.exit(0);
            }
            if (Choice == 1) {
                System.out.println("Your Sample Budget is $4000\n");
                double left = 4000 - amt1[0] - amt1[1] - amt1[2];
                //starts at 3 since the first 3 must be FIT, NYS, and SS
                for (int i = 3; i < 14; i++) { //reserve 14 for the Miscellaneous
                    System.out.println("Enter category name or q to quit");
                    input.skip("\n");
                    cat1[i] = input.nextLine();
                    if (cat1[i].equals("q") || i==14) {
                        cat1[i] = "Misc";
                        left = 0;
                    //need to make an amount for misc (rest of the money)
                    System.out.println("Item\tAmount\tItem\n------\t------\t----");
                    /*for loop for format*/ System.out.println("1     \t" + amt1[0] + "\t" + cat1[0] + "\n2     \t" + amt1[1] + "\t" + cat1[1] + "\n3     \t" + amt1[2] + "\t" + cat1[2] + "\n4     \t" + amt1[3] + "\t" + cat1[3] + "\n5     \t" + amt1[4] + "\t" + cat1[4] + "\n6     \t" + amt1[5] + "\t" + cat1[5] + "\n7     \t" + amt1[6] + "\t" + cat1[6] + "\n8     \t" + amt1[7] + "\t" + cat1[7] + "\n9     \t" + amt1[8] + "\t" + cat1[8] + "\n10     \t" + amt1[9] + "\t" + cat1[9] + "\n11     \t" + amt1[10] + "\t" + cat1[10] + "\n12     \t" + amt1[11] + "\t" + cat1[11] + "\n13     \t" + amt1[12] + "\t" + cat1[12] + "\n14     \t" + amt1[13] + "\t" + cat1[13]);
                        break; //exits loop
                    }
                    System.out.println("How much do you want to spend in " + cat1[i] + "?\nYou have " + left + " left.");
                    amt1[i] = input.nextDouble();
                    left = left - amt1[i];
                }
            }
            input.close();
        }
    }
}