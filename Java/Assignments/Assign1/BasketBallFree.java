/*
Name: Natalie Mann
Date: Wednesday September 14th 2022
Block: 4 B/D
 */

import java.util.Scanner;

public class BasketBallFree {
     public static void main(String[] args) {   
                boolean calcOn=true;
                while(calcOn){
             Scanner input = new Scanner(System.in);
             System.out.println("I will calculate the percentage of successful free throw");
             System.out.println("Was your first free throw success or a fail.  (Press 1 for Success, press 0 if you missed.)");
             int ft1 = input.nextInt();
             System.out.println("Was your second free throw success or a fail.  (Press 1 for Success, press 0 if you missed.)");
             int ft2 = input.nextInt();
             System.out.println("Was your third free throw a success or a fail.  (Press 1 for Success, press 0 if you missed.)");
             int ft3 = input.nextInt();
             System.out.println("Was your fourth free throw success or a fail.  (Press 1 for Success, press 0 if you missed.)");
             int ft4 = input.nextInt();
             System.out.println("Was your fifth free throw success or a fail.  (Press 1 for Success, press 0 if you missed.)");
             int ft5 = input.nextInt();
             System.out.println("Now I will calculate your percentage of successful throws...");
             double ans = ((ft1 + ft2 + ft3 + ft4 + ft5)*20);
             System.out.println("Your percentage of successful free throws is " + ans +"%");
                           
               System.out.println("Would you like to stop?\n1. Yes\n2. No");
               int cont=input.nextInt();
               calcOn=(1!=cont);
               int end=input.nextInt();
               calcOn=(end!=2);  
             
                input.close();      
             }
        }
}
        