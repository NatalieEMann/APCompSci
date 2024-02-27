package APCompSci.CoffeeTrader;

import java.util.Scanner;

public class CoffeeTrader {
    public static void main(String[] args) {
        // Constants here
        final double coffeeBagCost = 5.25;
        final int largeBox = 20;
        final int mediumBox = 10;
        final int smallBox = 5;
        final double largeBoxCost = 2;
        final double mediumBoxCost = 1;
        final double smallBoxCost = 0.5;
        // other variables
        double cost = 0;
        int largeBoxCount = 0;
        int mediumBoxCount = 0;
        int smallBoxCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "\n--------------------------------------------------\n--- $5.25 per bag, how many bags? (-1 to quit) ---\n--------------------------------------------------\n");
            int bags = scanner.nextInt();
            if (bags == -1) { // cancels
                System.exit(0);
            }

            cost = bags * coffeeBagCost;

            while (bags > 0) {
                if (bags >= largeBox) {
                    largeBoxCount++;
                    bags -= largeBox;
                    cost += largeBoxCost;
                } else if (bags >= mediumBox) {
                    mediumBoxCount++;
                    bags -= mediumBox;
                    cost += mediumBoxCost;
                } else {
                    smallBoxCount++;
                    bags -= smallBox;
                    cost += smallBoxCost;
                }
            }

            System.out.println("--------------------------------------------------\nLarge Boxes: " + largeBoxCount + "\nMedium Boxes: " + mediumBoxCount + "\nSmall Boxes: "
                    + smallBoxCount + "\nTotal Cost: $" + cost);
            largeBoxCount = 0;
            mediumBoxCount = 0;
            smallBoxCount = 0;
        }
    }
}