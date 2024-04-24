package JavaClass;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

/*
Name: Natalie Mann
Date: Wednesday September 14th 2022
Block: 4 B/D
 */

public class TaxCalc {
    public static void main(String[] args) {
        Date now = new Date();
        String display = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG).format(now);
        System.out.println(display);
           double grossincome;
           int Dependents;
           double taxincome;
           double incomeTax;
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, I am your IRS Agent.  Do your taxes, now.");
        System.out.println("Income, please.");
        grossincome = input.nextDouble();
        System.out.println("Good, now your number of Dependents.");
        Dependents = input.nextInt();
        taxincome = grossincome - 10000 - Dependents * 2000;
        incomeTax = taxincome * .20;
        System.out.println("Here are your taxes."+ incomeTax);
        System.out.println("Don't forget to pay them.");
        System.out.println("I will come for you if you don't.");
        input.close();
    }
    
}
