package APCompSci.Bonus.PNZ;

import java.util.Scanner;

public class PNZ {
    public PNZ(){
        startNewGame();
    }
    public static char randomDigit() {
        return (char) ('0' + Math.random() * 10);
    }
    static String randomString() {
        String finalNumber = "\0\0\0";
        char num;
        for (int i = 0; i < 3; i++) {
            do {
                num = randomDigit();
                if ((finalNumber.charAt(0) != num) && (finalNumber.charAt(1) != num)
                        && (finalNumber.charAt(2) != num)) {
                    finalNumber = num + finalNumber;
                } else {
                    num = '=';
                }

            } while (num == '-');
        }
        return finalNumber.substring(0, 3);
    }

    static String evaluateGuess(String target, String result) {
        int pNum = 0;
        int nNum = 0;
        String feedback = "";
        for (int i = 0; i < 3; i++){
            if (target.charAt(i) == result.charAt(i))
                pNum++;
            if ((target.charAt(0) == result.charAt(i))
                    || (target.charAt(1) == result.charAt(i))
                    || (target.charAt(2) == result.charAt(i)))
                nNum++; 
        }
        for (int i = 0; i < pNum; i++)
            feedback += 'P';
        for (int i = pNum; i < nNum; i++)
            feedback += 'N'; 
        if (nNum == 0)
            feedback = "Z";
        return feedback;
    }
    public static void displayResults(String guess, String result){
        // GUI stuff
        System.out.println("Guess:" + guess + " | Actual:" + result);
    }
    public void startNewGame(){
        // GUI stuff
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guess = "\0";
        String actual = randomString();
        do {
        System.out.println("Guess.");
        guess = input.nextLine();
        System.out.println(evaluateGuess(guess, actual));
        
        } while(!actual.equals(guess));
        displayResults(guess, actual);
        input.close();
    }
}
