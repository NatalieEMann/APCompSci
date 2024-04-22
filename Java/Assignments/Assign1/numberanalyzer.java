/*
Name: Natalie Mann
Date: Wednesday September 14th 2022
Block: 4 B/D
 */

import java.util.Scanner;

class numberanalyzer {
     public static void main(String[] args) {   
         Scanner input = new Scanner(System.in);
            
                    System.out.println("I will analyze your numbers."); 
                    System.out.println("Give me your first number.");
                    double num1 = input.nextDouble(); //assigns the variable "num1" to the input given from the user
                    System.out.println("Give me your second number.");
                    double num2 = input.nextDouble();
                    System.out.println("Give me your last number.");
                    double num3 = input.nextDouble();
                    double sum = num1 + num2 + num3; //does some math (sum)
                    double product = num1 * num2 * num3; //(product)
                    double formula = (3*num1)+(2/num2)+(num3-5);//formula    
                    double largest = Math.max(num1, num2); // using math.max you are able to find the largest number
                    double lar_gest = Math.max(num3, largest); 
                    double counter;
                    counter = Math.min(num1, num2); //finds the minimum of 2 of the numbers
                    counter = Math.min(num3, counter); //find the minimum of 1 number and the previous number
                    System.out.println("Your sum is " + sum);
                    System.out.println("Your product is " + product);
                    System.out.println("Your formula answer " + formula);
                    System.out.println("Your largest number is " + lar_gest);
                     //print out the answers
                    while(counter > 0){ //while something is true, carry out the following
                       if(num1 % counter==0){ //if num1 modulus counter = 0 ex. 8 % 2
                           if(num2 % counter==0){
                               if(num3 % counter==0){
                                   break;
                               }
               
                           }
                       }
                       counter=counter-1;
        }
                    System.out.println("Your GCF is "+ counter);
                    input.close();
}
}

