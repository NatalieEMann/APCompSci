package APCompSci.Assignments.Assign5;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.Clip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 25mannnata
 */
public class IntVerifier {

    //Global Variables
    private Scanner keyboard;
    private int low, high;
    private boolean highInc, lowInc;
    private Clip errorSnd;
    //This is a constructor

    public IntVerifier(Scanner sc, int lo, boolean loInc, int hi, boolean hiInc, Clip eSnd) {
        keyboard = sc;
        low = lo;
        high = hi;
        highInc = hiInc;
        lowInc = loInc;
        errorSnd = eSnd;
    }

    public int readAndVerify() {
        while (true) {
            System.out.println("Insert a Value");
            int inVal = 0;
            try {
                inVal = keyboard.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("    Bad Character    ");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@");
                errorSnd.setFramePosition(0);
                errorSnd.start();
            } finally {
                keyboard.nextLine();
            }
            if (inVal > low && inVal < high && !lowInc && !highInc) { //intVer4
                return inVal;
            } else if (inVal > low && inVal <= high && !lowInc && highInc) { //intVer2
                return inVal;
            } else if (inVal>=low && inVal<high &&lowInc && !highInc){ // intVer3
                return inVal;
            } else if (inVal>=low && inVal<=high &&lowInc && highInc){ // intVer1
                return inVal;
            }
    }
}
}