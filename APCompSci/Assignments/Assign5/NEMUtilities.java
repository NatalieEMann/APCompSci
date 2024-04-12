package APCompSci.Assignments.Assign5;

/**
 * File: NEMUtilities.java
 * Date: 10/20/23
 * Purpose: To print out a message within a box and the square roots of all positive integers up to 1000.
 * @author 25mannnata Block 1 AC 
 * Sauce Code: 11
 */
public class NEMUtilities {
    public static void outputSquareRoots(){
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i+"\t"+Math.sqrt(i)); 
        } 
    }

    public static void outputBoxStr(String message) {
        int msg = message.length();
        for (int i = 0; i < msg + 6; i++) {
            System.out.print("@");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("@@");
            if (i == 1) {
                System.out.print(" " + message + " ");
            } else {
                for (int j = 0; j < msg + 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("@@");
        }
        for (int i = 0; i < msg + 6; i++) {
            System.out.print("@");
        }
    }
}