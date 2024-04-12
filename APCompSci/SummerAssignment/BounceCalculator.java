package APCompSci.SummerAssignment;

import java.util.Scanner;

public class BounceCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert the initial height, in feet."); // taking the inputs
        double height = input.nextDouble();
        System.out.println("Insert Index (0.1 -> 0.9)");
        double index = input.nextDouble();
        if (index < 0.1 || index > 0.9) {
            System.out.println("Try again (0.1 -> 0.9)");
            System.exit(0);
        }
        System.out.println("How many times does the ball bounce?");
        int bounce = input.nextInt();
        
        double totalDistance = height; // the height of the drop (so it will be counted (not as a bounce))

        double distance = height * index; // the first index calculation to see how much distance was traveled
        
        int i;
        while(distance > 0.001){  // threshold
            for(i = 1; i<bounce;i++){
                totalDistance += (distance*2); // down and up
                distance = distance * index; // calculation for the next distance again
            } if(i==bounce || distance <= 0.001){
                totalDistance += distance; // the final up
                System.out.println("The total distance is " + totalDistance);
                System.exit(0);
            }
        }
    }
}


