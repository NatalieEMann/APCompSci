package JavaClass.Assignments.Assign2.Assign25;

/*------------------------------------------------
File: ChangeCalc.java
Date: Oct 4, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose:
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;

public class ChangeCalc {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
		System.out.println("Cost of item?");
		double Cost = input.nextDouble();
		//asks and waits for input of the money

		double Change = 20-Cost;
		System.out.println("Change: " + Change);
		
		//math

		int Tens = (int) Math.round(Change / 10);
                Change = Change % 10;

		int Fives = (int) Math.round(Change / 5);
                Change = Change % 5;
                
		int Ones = (int) Math.round(Change / 1);
                Change = Change % 5;
		
		double Quarters = Math.round(Change/.25);
                Change = Change % 1;

		double Dimes = Math.round(Change/.10);
                Change = Change % 0.25;

		double Nickels = Math.round(Change/.05);
                Change = Change % 0.10;

		double Pennies = Math.round(Change/.01);

		System.out.println("You can exchange this into: ");
                System.out.println(Tens + " ten dollar bill(s)");
		System.out.println(Fives + " five dollar bill(s)");
		System.out.println(Ones + " one dollar bill(s)");		
		System.out.println(Quarters + " quarter(s)");
		System.out.println(Dimes + " dime(s)");
		System.out.println(Nickels + " nickel(s)");
		System.out.println(Pennies + " penny(pennies)");
		input.close();
  }
}   