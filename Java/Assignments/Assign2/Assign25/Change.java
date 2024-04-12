/*------------------------------------------------
File: Change.java
Date: Oct 7, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose:
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;

class Change{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		System.out.println("Cost of item?");
		double Cost = input.nextDouble();
		//asks and waits for input of the money

		double Change = (20 - Cost);
		Change = 100 * Change;
		Change = (int) (Change + .5);
		Change = Change/100;
		System.out.println("Change: " + Change);
		
		//math
		int Hundreds = (int)Change/100;

		Change = Change % 100;

		int Fifty = (int) Change / 50; //(int) is because it gives the error of a "lossy conversion", so I am making the program aware
		Change = Change % 50;

		int Twenty = (int) Change / 20;
		Change = Change % 20;

		int Tens = (int) Change / 10;
		Change = Change % 10;

		int Fives = (int) Change / 5;
		Change = Change % 5;

		int Ones = (int) Change / 1;
		Change = Change % 1;
		
		double Quarters = Change/.25;
		Change = Change%.25;

		double Dimes = Change/.10;
		Change = Change%0.10;

		double Nickels = Change/.05;
		Change = Change%0.05;

		double Pennies = Change/.01;
		Change = 100 * Change;
		Change = (int) (Change + .5);
		Change = Change/100;
		Change = Change%0.01;

		System.out.println("You can exchange this into: ");
    System.out.println(Math.floor(Hundreds) + " hundred dollar bill(s)");
    System.out.println(Math.floor(Fifty) + " fifty dollar bill(s)");
    System.out.println(Math.floor(Twenty) + " twenty dollar bill(s)");
    System.out.println(Math.floor(Tens) + " ten dollar bill(s)");
		System.out.println(Math.floor(Fives) + " five dollar bill(s)");
		System.out.println(Math.floor(Ones) + " one dollar bill(s)");		
		System.out.println(Math.floor(Quarters) + " quarter(s)");
		System.out.println(Math.floor(Dimes) + " dime(s)");
		System.out.println(Math.floor(Nickels) + " nickel(s)");
		System.out.println(Math.floor(Pennies) + " penny(pennies)");
  }
}