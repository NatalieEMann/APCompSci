package APCompSci.Assignments.Assign5;

import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Assign5Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Global Sound Clips
        Clip bombSnd = null;//Clips to be played

        //Prepare an Audio File for the Verifiers, let's use the bomb sound
        //Load up bomb sound file
        File bombSndF = new File("G:/My Drive/_JAVA_/Explosion.wav");

        try {
            bombSnd = AudioSystem.getClip();
            bombSnd.open(AudioSystem.getAudioInputStream(bombSndF));
        } catch (Exception e) {
            System.out.println(e);
        }

        //Create the 8 verifiers
        IntVerifier intVer1 = new IntVerifier(input, 1, true, 10, true, bombSnd);
        IntVerifier intVer2 = new IntVerifier(input, -3, false, 10, true, bombSnd);
        IntVerifier intVer3 = new IntVerifier(input, 0, true, 10, false, bombSnd);
        IntVerifier intVer4 = new IntVerifier(input, 1, false, 100, false, bombSnd);

        DoubleVerifier doubleVer1 = new DoubleVerifier(input, 0, true, .1, true, bombSnd);
        DoubleVerifier doubleVer2 = new DoubleVerifier(input, 0, false, .1, true, bombSnd);
        DoubleVerifier doubleVer3 = new DoubleVerifier(input, 0, true, 1.7, false, bombSnd);
        DoubleVerifier doubleVer4 = new DoubleVerifier(input, -1.6, false, 198.2, false, bombSnd);

        while (true) {
            System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("Welcome to Assign 5 Tester");
            System.out.println("1 = Print Square Roots 1-100");
            System.out.println("2 = BoxPrint a Phrase");
            System.out.println("3 = Test Int Ver L inc H inc");
            System.out.println("4 = Test Int Ver L exc H inc");
            System.out.println("5 = Test Int Ver L inc H exc");
            System.out.println("6 = Test Int Ver L exc H exc");
            System.out.println("7 = Test Dbl Ver L inc H inc");
            System.out.println("8 = Test Dbl Ver L exc H inc");
            System.out.println("9 = Test Dbl Ver L inc H exc");
            System.out.println("10 = Test Dbl Ver L exc H exc");
            System.out.println("0 = I'm out");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

            int choice = input.nextInt();
            switch (choice) {
                case 1 -> NEMUtilities.outputSquareRoots();
                case 2 -> {
                    System.out.println("Please enter in a phrase to be box printed");
                    input.skip("\n");
                    String phrase = input.nextLine();
                    NEMUtilities.outputBoxStr(phrase);
                }
                case 3 -> {
                    System.out.println("Please type in # between 1 (inc) and 10 (inc)");
                    int value = intVer1.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 4 -> {
                    System.out.println("Please type in # between -3 (exc) and 10 (inc)");
                    int value = intVer2.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 5 -> {
                    System.out.println("Please type in # between 0 (inc) and 10 (exc)");
                    int value = intVer3.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 6 -> {
                    System.out.println("Please type in # between 1 (exc) and 100 (exc)");
                    int value = intVer4.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 7 -> {
                    System.out.println("Please type in # between 0 (inc) and .1 (inc)");
                    double value2 = doubleVer1.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 8 -> {
                    System.out.println("Please type in # between 0 (exc) and .1 (inc)");
                    double value2 = doubleVer2.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 9 -> {
                    System.out.println("Please type in # between 0 (inc) and 1.7 (exc)");
                    double value2 = doubleVer3.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 10 -> {
                    System.out.println("Please type in # between -1.6 (exc) and 198.2 (exc)");
                    double value2 = doubleVer4.readAndVerify();
                    System.out.println("GOLDEN");
                }
                case 0 -> {
                    System.exit(0);
                }
            }

        }
    }
}