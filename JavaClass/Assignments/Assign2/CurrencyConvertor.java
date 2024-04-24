package JavaClass.Assignments.Assign2;

/*------------------------------------------------
File: CurrencyConvertor.java
Date: Sep 28, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose:
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;

public class CurrencyConvertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean calcOn = true;
        while (calcOn) {
            System.out.println("Currency Converter \n Rates from XE.com \n 9/30/2022");
            System.out.println("Operator Menu:\n0. Exit\n1. USD to Euro\n2. USD to Canadian Dollar\n3. USD to Yen\n4. USD to Pound Sterling\n5. USD to Australian Dollar\n6. Euro to USD\n7. Canadian Dollar to USD\n8. Yen to USD\n9. Pound Sterling to USD\n10. Australian Dollar to USD");
            // \n will have it print on a new line, sout to have print out to user
            int choice = input.nextInt(); //scans for input of user
            if (choice == 0) {
                break; // 0 will make it exit the program closing the loop.
            } else if (choice == 1) { //if the input is one it will carry out the following below until the end of the curly brace x10
                System.out.println("What is your amount of money in USD?");
                double USD = input.nextDouble(); //input amount of money in dictated currency to convert it to the selected currency 
                double Money = USD * 1.021445;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
//multiplies the starter amount of money by what ever the conversion factor from 1 to the selected currency is (ex. 1 USD is 1.021445 Euros) x10
                System.out.println("Your amount of money in Euros is €" + Money); //will print out money w/ symbol x10
                System.out.println("Do not forget to round to proper amount."); //reminds you that you should round to the proper amount since this is an accurate convertor, it will give you extra decimals x10
            } else if (choice == 2) {
                System.out.println("What is your amount of money in USD?");
                double USD = input.nextDouble();
                double Money = USD * 1.3799586;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in Canadian Dollars is $" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 3) {
                System.out.println("What is your amount of money in USD?");
                double USD = input.nextDouble();
                Double Money = USD * 144.71657;
                  Money = 100 * Money;
		Money = (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in Yen is ¥" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 4) {
                System.out.println("What is your amount of money in USD?");
                double USD = input.nextDouble();
                double Money = USD * 0.89733867;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in British Pound is £" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 5) {
                System.out.println("What is your amount of money in USD?");
                double USD = input.nextDouble();
                double Money = USD * 1.5571656;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in Australian Dollar is AU$" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 6) {
                System.out.println("What is your amount of money in Euro?");
                double Euro = input.nextDouble();
                double Money = Euro * 0.97934511;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in USD is $" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 7) {
                System.out.println("What is your amount of money in Canadian Dollar?");
                double Canadian = input.nextDouble();
                double Money = Canadian * 0.72465966;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in USD is $" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 8) {
                System.out.println("What is your amount of money in Yen?");
                double Yen = input.nextDouble();
                double Money = Yen * 0.0069103579;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in USD is $" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 9) {
                System.out.println("What is your amount of money in Pound Sterling?");
                double Pound = input.nextDouble();
                double Money = Pound * 1.1144529;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in USD is $" + Money);
                System.out.println("Do not forget to round to proper amount.");
            } else if (choice == 10) {
                System.out.println("What is your amount of money in Australian Dollar?");
                double Australian = input.nextDouble();
                double Money = Australian * 0.64213221;
                Money = 100 * Money;
		Money = (int) (Money + .5);
		Money = Money/100; 
                System.out.println("Your amount of money in USD is $" + Money);
                System.out.println("Do not forget to round to proper amount.");
            }
            System.out.println("Would you like to stop?\n1. Yes\n2. No");
            int cont = input.nextInt();
            calcOn = (cont != 1);

        }
        input.close();
    }
}
