/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APCompSci.HW;

/**
 *
 * @author 25mannnata
 */
// the size is 
// 1 = 12345 54321
// 2 = 1234567890 0987654321
// +-----------+
// |12345 54321|
// +-----------+
import java.util.Scanner;

public class NumberBox {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter in a size for the number box. (-1 to quit)");
            int input = keyboard.nextInt();
            if (input == -1) {
                System.exit(0);
            }
//            if(input%2 == 0){
//                input+=input;
//            }
            int a = 1;
            System.out.println("Do you want *'s inbetween the numbers or not? 1 = Yes, 2 = No");
            int answer = keyboard.nextInt();
            if (answer == 1) {
                //finish
                System.out.print("\n+");
                for (int i = 0; i < input * 20 + 1; i++) {
                    System.out.print("-");
                }
                System.out.print("+");
                System.out.print("\n|");
                for (int i = 0; i < input * 5; i++) {
                    System.out.print(a+"*");
                    a++;
                    if(a==10)
                        a=0;
                    
                }
                System.out.print(" ");
                a=0;
                if(input%2==1){
                   a=5;
                }
                for (int i = 0; i < input*5; i++) {
                    System.out.print(a+"*");
                    a--;
                    if(a==-1)
                        a=9;
                }
                System.out.print("|");
                System.out.print("\n+");
                for (int i = 0; i < input * 20 + 1; i++) {
                    System.out.print("-");
                }
                System.out.print("+");
            } else if (answer == 2) {
                System.out.print("\n+");
                for (int i = 0; i < input * 10 + 1; i++) {
                    System.out.print("-");
                }
                System.out.print("+");
                System.out.print("\n|");
                for (int i = 0; i < input * 5; i++) {
                    System.out.print(a);
                    a++;
                    if(a==10)
                        a=0;
                    
                }
                System.out.print(" ");
                a=0;
                if(input%2==1){
                   a=5;
                }
                for (int i = 0; i < input*5; i++) {
                    System.out.print(a);
                    a--;
                    if(a==-1)
                        a=9;
                }
                System.out.print("|");
                System.out.print("\n+");
                for (int i = 0; i < input * 10 + 1; i++) {
                    System.out.print("-");
                }
                System.out.print("+");
            }
        }
    }
}
