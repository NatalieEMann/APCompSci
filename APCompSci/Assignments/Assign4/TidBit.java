package APCompSci.Assignments.Assign4;

import java.util.Scanner;

public class TidBit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // All of the inputs (plus a exit for a reset in case you put in a bad #
        System.out.print("What is the price of your computer? ");
        double price = input.nextDouble();
        if (!(price > 0) || !(price <= 12000)) {
            System.out.print("Not in range: (0<price<=12000) ");
            System.exit(0);
        }
        System.out.print("What is the annual interest rate? ");
        double percentInterest = input.nextDouble();
        if (!(percentInterest > 0) || !(percentInterest <= 20)) {
            System.out.print("Not in range: (0<Interest rate<=20) ");
            System.exit(0);
        }
        System.out.print("What is the % down payment? ");
        double percentDown = input.nextDouble();
        if (!(percentDown > 0) || !(percentDown <= 50)) {
            System.out.print("Not in range: (0<Down payment<=50) ");
            System.exit(0);
        }

        // Math
        double downPayment = (percentDown / 100) * price;
        System.out.println("Downpayment: " + downPayment); // Makes the downpayment percentage into a decimal then multiplies it by the price to find the percentage of the price that is the downpayment

        // The "Header"
        System.out.print("==========================================================================================\n\t\t\t\t    Payment Calculator\n==========================================================================================");
        System.out.print("\n|  Month  |   Balance Start   |  Principal  |  Interest  |   Payment   |   Balance End   |");

        // Math...lots of math
        percentInterest = percentInterest / 100;
        price = price - downPayment;

        double payment = price * 0.05; // THIS STAYS THE SAME (Constant)

        //variables that will be needed
        double principal, finalPrice , interest, finalInterest = 0;

        int month = 1;
        while (price != 0) { //CHANGE
            System.out.print("\n");
            interest = price * (percentInterest / 12); // THE MONTHLY INTEREST 
            if (price < payment) {
                principal = price;
                payment = price + interest;
            } else {
                principal = payment - interest;
            }
            finalPrice = price - principal;
            System.out.printf("| %7d | %,17.2f | %,11.2f | %,10.2f | %,11.2f | %,15.2f |", month, price, principal, interest, payment, finalPrice);
            price = finalPrice;
            month++;
            finalInterest = finalInterest + interest;
        }
        System.out.printf("\n==========================================================================================\nTotal Interest Paid: $%-,10.2f \n==========================================================================================", finalInterest);

    }
}


