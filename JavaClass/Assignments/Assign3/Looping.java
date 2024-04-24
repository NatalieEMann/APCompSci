package JavaClass.Assignments.Assign3;

/*------------------------------------------------
File: together.java
Date: Oct 18, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose:
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Random;
//imports

public class Looping {

    static Random r = new Random();

    public static void playSound() { //sound method to refrence later
        //to actually play the sounds, we need to set the frame position to the start

        alerted.setFramePosition(0);
        alerted.start();
        situation.setFramePosition(0);
        situation.start();
        gasp.setFramePosition(0);
        gasp.start();
        woob.setFramePosition(0);
        woob.start();
        remind.setFramePosition(0);
        remind.start();
    }

    static Clip alerted, situation, gasp, woob, remind; //"variables"

    public static void dispAuthor() {
        System.out.println("******************************\n* Loop Practice              *\n* 10/24/2022                 *\n* by Natalie Mann            *\n* Java 4B/D                  *\n******************************");
    } //beginning 

    public Looping() { //imported sounds from google drive
        InputStream instr
                = getClass().getClassLoader().getResourceAsStream("sounds/alerted.wav");
        InputStream instr2
                = getClass().getClassLoader().getResourceAsStream("sounds/gasp_ohhh.wav");
        InputStream instr3
                = getClass().getClassLoader().getResourceAsStream("sounds/remind_me3.wav");
        InputStream instr4
                = getClass().getClassLoader().getResourceAsStream("sounds/situation.wav");
        InputStream instr5
                = getClass().getClassLoader().getResourceAsStream("sounds/woob_woob2.wav");

        try {
            alerted = AudioSystem.getClip();
            alerted.open(AudioSystem.getAudioInputStream(instr));
            situation = AudioSystem.getClip();
            situation.open(AudioSystem.getAudioInputStream(instr2));                    //actual variables for each of the sounds
            gasp = AudioSystem.getClip();
            gasp.open(AudioSystem.getAudioInputStream(instr3));
            woob = AudioSystem.getClip();
            woob.open(AudioSystem.getAudioInputStream(instr4));
            remind = AudioSystem.getClip();
            remind.open(AudioSystem.getAudioInputStream(instr5));
        } catch (LineUnavailableException ex) {
            System.out.println(ex);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Looping();
        Scanner input = new Scanner(System.in);
        dispAuthor();
        int choice;
        while (true) {
            System.out.println("\nPlease enter in a choice, 0 to quit \n1. Numbers 1 \n2. Number 2 \n3. 500 Asterisks \n4. Input Asterisks \n5. Odd Numbers \n6. Average Calculator \n7. Plays a random sound \n8. Probability with dice \n9. Pyramid \n10. Multiplication table");
            choice = input.nextInt();
            //menu choices
            if (choice == 0) {
                break; //exits the loop
            }
            if (choice == 1) {
                int i = 1;
                while (i <= 16) {
                    System.out.println(i);
                    i = i + 3;
                }
            }
            //prints certain numbers (1 and 2)
            if (choice == 2) {
                int i = 20;
                while (i >= 5) {
                    System.out.println(i);
                    i = i - 5;
                }
            }
            if (choice == 3) {
                int i = 1;
                while (i == 1) {
                    System.out.println("******************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************** \n");
                    //on one line since it doesn't specify to use the other method since that is for the next one
                    i++;
                }
            }
            //prints 500 asterisks for absolutely no reason
            if (choice == 4) {
                System.out.println("What is the number of asterisks you would like to print? (Yes, it has to be a whole number.)");
                int num = input.nextInt();
                for (int i = 1; i <= num; i++) { //for loop allows for shorter time, basically does the same thing as a if/while
                    System.out.print("*");
                }
            }

            if (choice == 5) {
                System.out.println("What is the odd number?");  //will use modulus to print out numbers that are odd up to the inputed number
                int num = input.nextInt();
                for (int i = 1; i <= num; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }
            if (choice == 6) {
                double average;
                int far = 0;
                double num = 0;
                double i = 0;
                while (true) {
                    System.out.println("Input a number: \nInput -1 to calculate average.");
                    i = input.nextDouble();
                    if (i == -1) { //when -1 is inputted it will go through the calculations
                        average = num / far;
                        average = 100 * average;
                        average = (int) (average + .5);
                        average = average / 100;
                        System.out.println("Your Average is: " + average);
                        break;
                    }
                    num = i + num;
                    far++;
                    System.out.println("Sum so far: " + num + " Numbers so far: " + far + "\n");
                }
            }
            if (choice == 7) {
                int x = r.nextInt(5);
                System.out.println(x);
                if (x == 0) { //if the random number is 0(through 4) it will play a certain sound
                    alerted.setFramePosition(0);
                    alerted.start();
                }
                if (x == 1) {
                    situation.setFramePosition(0); //depending on what number it rolls it will carry out a specific command within another method(i believe) to play a sound
                    situation.start();
                }
                if (x == 2) {
                    gasp.setFramePosition(0);
                    gasp.start();
                }
                if (x == 3) {
                    woob.setFramePosition(0);
                    woob.start();
                }
                if (x == 4) {
                    remind.setFramePosition(0);
                    remind.start();
                }
            }
            if (choice == 8) {
                int freq2 = 0;
                int freq3 = 0;
                int freq4 = 0;
                int freq5 = 0; //freq variables
                int freq6 = 0;
                int freq7 = 0;
                int freq8 = 0;
                int freq9 = 0;
                int freq10 = 0;
                int freq11 = 0;
                int freq12 = 0;
                System.out.println("There are 2 dice, how many times do you want to roll them?");
                int roll = input.nextInt();
                for (int i = 0; i < roll; i++) { //i will count up until the amount of rolls rolling each dice each time.
                    int rD1 = r.nextInt(6) + 1; //through 6 for each dice
                    int rD2 = r.nextInt(6) + 1;
                    int total = rD1 + rD2;
                    if (total == 2) { //adds to each of the variables for every time this total is rolled
                        freq2++;
                    }
                    if (total == 3) { 
                        freq3++;
                    }
                    if (total == 4) {
                        freq4++;
                    }
                    if (total == 5) {
                        freq5++;
                    }
                    if (total == 6) {
                        freq6++;
                    }
                    if (total == 7) {
                        freq7++;
                    }
                    if (total == 8) {
                        freq8++;
                    }
                    if (total == 9) {
                        freq9++;
                    }
                    if (total == 10) {
                        freq10++;
                    }
                    if (total == 11) {
                        freq11++;
                    }
                    if (total == 12) {
                        freq12++;
                    }

                }
                System.out.println("\nRoll\t\tFreqency\n----\t\t--------");
                System.out.println("2\t\t" + freq2 + "\n3\t\t" + freq2 + "\n4\t\t" + freq3 + "\n5\t\t" + freq5 + "\n6\t\t" + freq6 + "\n7\t\t" + freq7 + "\n8\t\t" + freq8 + "\n9\t\t" + freq9 + "\n10\t\t" + freq10 + "\n11\t\t" + freq11 + "\n12\t\t" + freq12);
                //formats the frequency 
                System.out.println("--- Frequency Histogram ---");
                for (int i = 1; i < 12; i++) {
                    if (i < 9) {
                        System.out.print(i + 1 + " |"); //some wonderful formatting
                    } else {
                        System.out.print(i + 1 + "|");
                    }
                    if (i == 1) {
                        for (int z = 0; z < freq2; z++) { //for statements to add an "=" which is the "Histogram filled in box" does this for each time that the number is totaled for everyone
                            System.out.print("=");
                        }
                    }
                    if (i == 2) {
                        for (int z = 0; z < freq3; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 3) {
                        for (int z = 0; z < freq4; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 4) {
                        for (int z = 0; z < freq5; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 5) {
                        for (int z = 0; z < freq6; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 6) {
                        for (int z = 0; z < freq7; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 7) {
                        for (int z = 0; z < freq8; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 8) {
                        for (int z = 0; z < freq9; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 9) {
                        for (int z = 0; z < freq10; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 10) {
                        for (int z = 0; z < freq11; z++) {
                            System.out.print("=");
                        }
                    }
                    if (i == 11) {
                        for (int z = 0; z < freq12; z++) {
                            System.out.print("=");
                        }
                    }
                    System.out.print("\n"); //I do not remember why this is here, but I am sure it has a point
                }
            }
            if (choice == 9) {
                System.out.println("What would you like the height of the pyramid to be?");
                int Cap = input.nextInt(); //gives a cap
                for (int i = 1; i < (Cap + 1); i++) {
                    for (int x = 0; x < (Cap - i); x++) { //a space for everytime that x will be greater than Cap-i
                        System.out.print(" ");
                    }
                    for (int x = 0; x < (2 * i) - 1; x++) { //basically same thing with some change...this was so long ago
                        System.out.print("*"); 
                    }
                    System.out.println("");

                }
            }
            if (choice == 10) {
                System.out.println("What is the highest number you want the multplication table to go to (2 -> 20)");
                int Cap = input.nextInt();
                int r;
                int c;
                @SuppressWarnings("unused")
                int h;
                int i;
                System.out.print(" \t|");
                for (r = 1; r < (Cap + 1); r++) { //formating adding a line to seperate each of the rows or numbers
                    System.out.print("\t" + r);
                }
                System.out.println("");
                for (i = 0; i < (Cap + 1); i++) {
                    System.out.print("---------");
                }
                System.out.println("");
                for (c = 1; c < (Cap + 1); c++) {
                    System.out.print("\n"+ c + "\t|\t"); //same thing as before
                    for (i = 1; i < (Cap + 1); i++) {  //now it will do the numbers, below multiplying them as it goes up till it reaches the cap
                        System.out.print(i * c + "\t");
                    }
                    System.out.println("");
                }

            }

        }
        input.close();
    }
}
