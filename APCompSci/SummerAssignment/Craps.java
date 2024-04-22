/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APCompSci.SummerAssignment;
/**
 *
 * @author mysti
 */
/*
Craps:
if first roll is a 7 or 11 - INSTANT WIN (round over)
if first roll is 2, 3, or 12 - INSTANT LOSS (round over)
if none of the above are rolled they roll continiously until 1 of 2 things happen
- the player rolls the initial number - WINS
- the player rolls a 7 - LOSE

Start with 100 chips
Make a wager before each game
when user is out of chips -> Game over
When game is won or lost subtract or add chips then display them
  
 */
import java.util.Random;
import java.util.Scanner;

public class Craps {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int point, sum, bet, dice1, dice2; // variables to use
        int chips = 100; // starter chips 

        Random random = new Random(); // makes a random object
        Scanner input = new Scanner(System.in); // makes a scanner object

        while(chips>0){ // while you still have money (chips)
        System.out.println("How much would you like to bet.  Current chips are: " + chips);
        bet = input.nextInt(); // places the amount of chips bet into a variable
        System.out.println("Press 'r' to roll.");
        char roll = input.next().charAt(0);
        if (roll == 'r') {
            sum = (random.nextInt(6) + 1) + (random.nextInt(6) + 1); // sum of 2 "dice" that are randomly rolled
            System.out.println("You rolled a: " + sum); 
            switch (sum) { // use a switch case for each sum
                case 7:
                case 11:
                    System.out.println("You win!");
                    chips = chips + bet;
                    break;
                case 2:
                case 3:
                case 12:
                    System.out.println("You lose.");
                    chips = chips - bet;
                    break;
                default: // if none of the above are rolled
                    point = sum;
                    while(sum != 7 || sum != point){ // repeats the rolls until won or lost
                    System.out.println("Press 'r' to roll again."); 
                    roll = input.next().charAt(0);
                    if (roll == 'r') {
                        sum = (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
                        System.out.println("You rolled a: " + sum);
                        if (sum == point) {
                            chips = chips + bet;
                            System.out.println("You win! You have " + chips + " chips.");
                            break;
                        } else if(sum == 7){
                            chips = chips - bet;
                            System.out.println("You crapped out... You have " + chips + " chips.");
                            break;
                        }
                        }
                    }
            }
        }
    }
        if(chips == 0){ // if you are broke, the game is over
            System.out.println("------------------------ Game Over ------------------------");
        }
        input.close();
    }
}


