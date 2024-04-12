package APCompSci.SummerAssignment;

import java.util.Scanner;

public class PerfectNumberDecider {

    public static int divisorSum(int num) {
        int sum = 1;
        for (int divisor = 2; divisor < num; divisor++) { // goes through all numbers up until divisor = num (to keep out 1, since already counted)
            if (isDivisor(num, divisor) == true) { //if returns true adds the divisor to the sum
                sum += divisor;
            }
        }
        return sum; 

    }

    public static boolean isDivisor(int num, int divisor) { // takes in 2 integers, and will return true if 'divisor' is a divisor of 'num'
        if (num % divisor == 0) { // if the num can be divided with no remainder it is a divisor
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a positive integer to check if it is a perfect number.");
        int num = input.nextInt(); // takes in input
        divisorSum(num);
        int sum = divisorSum(num); // stores the return value as the sum
        if (num == sum) { // set of if statements decides whether the number is perfect, abundant, or deficient based on the sum
            System.out.println(num + " is a perfect number.");
            // factors
        } else if (sum > num) {
            System.out.println(num + " is abundant.");
        } else if (sum < num) {
            System.out.println(num + " is deficient");
        }
    }
}


