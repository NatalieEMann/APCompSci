package Yahtzee;

/*structure of a round 
player 1 rolls 
player 1 either slects some to keep and rolls again or goes to score 
repeat above 
player 1 scores
player 2 does the above 
this goes back and forth till round 26 
 */
import java.util.Scanner;
import java.util.Random;

public class Controller {

    static ScoreCard[] players = new ScoreCard[2];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //VARS 
        int roundCount = 0;

        //HEADER
        System.out.println("----------------------------------------");
        System.out.println("-HELLO WELCOME TO MY QUICK YHATZEE GAME-");
        System.out.println("----------------------------------------");

        //Name INPUT
        System.out.println("what is player 1's name?");
        String nameOne = input.nextLine();
        System.out.println("what is player 2's name?");
        String nameTwo = input.nextLine();

        //Player DEC
        players[0] = new ScoreCard(nameOne);
        players[1] = new ScoreCard(nameTwo);

        // the game
        while (roundCount < 26) {
            turn(roundCount % 2);
            roundCount++;
        }

        // winner Dplay and Logic
        int oneFinal = players[0].getScore();
        int twoFinal = players[1].getScore();
        System.out.println(players[0].getName() + "'s final score: " + oneFinal);
        System.out.println(players[1].getName() + "'s final score: " + twoFinal);
        if (oneFinal - twoFinal > 0) {
            System.out.println(players[0].getName() + " WINS");
        } else if (oneFinal - twoFinal < 0) {
            System.out.println(players[1].getName() + " WINS");
        } else {
            System.out.println("ITS A TIE");
        }
    }

    public static void ScoreCardDplay(int player) {
        System.out.println("This is " + players[player].getName() + "'s scorecard");
        System.out.println("1\t Aces = 1  \t Add up Aces  \t" + players[player].getScoreTable(1));
        System.out.println("2\t Twos = 2  \t Add up Twos  \t" + players[player].getScoreTable(2));
        System.out.println("3\t Threes = 3\t Add up Threes\t" + players[player].getScoreTable(3));
        System.out.println("4\t Fours = 4 \t Add up Fours \t" + players[player].getScoreTable(4));
        System.out.println("5\t Fives = 5 \t Add up Fives \t" + players[player].getScoreTable(5));
        System.out.println("6\t Six = 6   \t Add up Sixes \t" + players[player].getScoreTable(6));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Top Total: " + players[player].getTopScore() + "\nhas top bonus: " + players[player].getBonus());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("7 \t 3 of a kind   \t Sum of Dice\t" + players[player].getScoreTable(7));
        System.out.println("8 \t 4 of a kind   \t Sum of Dice\t" + players[player].getScoreTable(8));
        System.out.println("9 \t Full House    \t 25P        \t" + players[player].getScoreTable(9));
        System.out.println("10\t Small Straight\t 30P        \t" + players[player].getScoreTable(10));
        System.out.println("11\t Large Straight\t 40P        \t" + players[player].getScoreTable(11));
        System.out.println("12\t YHATZEE       \t 50P        \t" + players[player].getScoreTable(12));
        System.out.println("13\t Chance        \t Sum of Dice\t" + players[player].getScoreTable(13));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Score total:" + players[player].getScore());
        System.out.println("------------------------------------------------------------------------------");

    }

    public static void turn(int player) {
        int rollCount = 0;
        int[] dice = new int[5];
        int[] newDice = new int[5];
        boolean[] savedDice = new boolean[5];
        System.out.println("it is " + players[player].getName() + "'s turn ");
        outer:
        while (rollCount < 3) {
            System.out.println("press 0 to roll the dice");
            while (true) {
                int choice = input.nextInt();
                if (choice == 0) {
                    newDice = rolling();
                    for (int i = 0; i < 5; i++) {
                        if (savedDice[i] == true) {
                            newDice[i] = dice[i];
                            savedDice[i] = false;

                        }
                    }
                    
                    dice = newDice;
                    break;
                }
            }
                        rollCount++;
            if(rollCount>2){
                break;
            }

            diceDP(dice);
            System.out.println("press -1 to submit these dice\npress 1 to select die for rerolling");
            oUter:
            while (true) {
                while (true) {
                    int h = input.nextInt();
                    if (h == -1) {
                        System.out.println("your rolls are");
                        diceDP(dice);
                        scoring(player, dice);
                        return;
                    }
                    if (h == 1) {
                        break;
                    }
                }
                diceDP(dice);
                System.out.println("pick the ones you want to keep -1 to stop picking");
                Puter:
                while (true) {
                    int t = input.nextInt();
                    if (t == -1) {
                        break oUter;
                    }
                    savedDice[t - 1] = true;
                }
            }

        }

        System.out.println("hope you got some good ones");
        diceDP(dice);
        scoring(player, dice);

    }

    public static int[] rolling() {
        Random r = new Random();
        int[] dice = new int[6];
        for (int i = 0; i < 5; i++) {
            dice[i] = r.nextInt(5) + 1;
        }
        return dice;
    }

    public static void diceDP(int[] dice) {
        int index = 1;
        System.out.println("---------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(index + " = " + dice[i]);
            index++;
        }
        System.out.println("---------------");
    }

    public static void scoring(int player, int[] dice) {
        players[player].DVSetter(dice);
        System.out.println("your rolls are");
        ScoreCardDplay(player);
        System.out.println("select the index of the score you're putting these rolls under");
        int choice = input.nextInt();
        players[player].Score(choice);
        ScoreCardDplay(player);
    }
}
