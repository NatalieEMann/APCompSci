package JavaClass.HW;

/*------------------------------------------------
File: InvestementHW.java
Date: Oct 28, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose: INVEST
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;

public class InvestementHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double iStart;
        double rate;
        int yrs;
        while (true) {
            System.out.println("What is your starter investement? (0-10,000)");
            iStart = input.nextDouble();
            if (iStart >= 0 && iStart <= 10000) {
                break;
            } else {
                System.out.println("Stay in Range.");
                System.exit(0);
            }
        }
        while (true) {
            System.out.println("What is your interest rate? (0-200)");
            rate = input.nextDouble();
            rate = rate / 100;
            if (rate >= 0 && rate <= 200) {
                break;
            } else {
                System.out.println("Stay in Range.");
                System.exit(0);
            }
        }
        while (true) {
            System.out.println("What is your amount of years? (0-40)");
            yrs = input.nextInt();
            if (yrs >= 0 && yrs <= 40) {
                break;
            } else {
                System.out.println("Stay in Range.");
                System.exit(0);
            }
            if (yrs == 0) {
                System.out.println("No money for you.");
                System.exit(0);
            }
        }
        System.out.println("\n\nYear\tStart\tEarned\tEnd\n----\t-----\t------\t---");
        for (int y = 1; y <= yrs; y++) {
            System.out.println(y + "\t" + iStart + "\t" + Math.round(iStart * rate) + "\t" + (iStart + Math.round(iStart * rate)));
            iStart = iStart + Math.round(iStart * rate);
        }
        input.close();
    }
}
