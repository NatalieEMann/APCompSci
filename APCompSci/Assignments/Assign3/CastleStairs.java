package APCompSci.Assignments.Assign3;

import java.util.Scanner;

public class CastleStairs {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a menu option.\n1. Regular \n2. Stadium");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Type in an integer 1 - 100: ");
            int num = input.nextInt();
//            System.out.println("Type in a phrase.");
//            input.skip("\n");
//            String phrase = input.nextLine();
//            int phraseNum = phrase.length();
            for (int a = 0; a < num; a++) {  
                for (int d = 0; d < num - a - 1; d++) {
                    System.out.print("    ");
                }
                System.out.print("+");
                for (int c = 0; c < a + 1; c++) {
                    System.out.print("---+");
                }
                System.out.println();
                for (int d = 0; d < num - a - 1; d++) {
                    System.out.print("    ");
                }
                
//                for (int e = 0; e <a+1; e++) {
//                    if(e<phraseNum){
//                        System.out.print("| " + phrase.charAt(0) + " ");
//                        phrase = phrase.substring(1);
//                    } else 
//                    System.out.print("|   ");
//                   e++;
//                }
                for (int i = 0; i < a + 1; i++) {
                    System.out.print("|   ");
                }
                System.out.println("|");
            }
            System.out.print("+");
            for (int f = 1; f < num * 2 - 4; f++) {
                System.out.print("---+");
            }
        } else if (choice == 2) {
            System.out.println("Type in an integer 1 - 100 to create a stadium.");
        }
        input.close();
    }
}


