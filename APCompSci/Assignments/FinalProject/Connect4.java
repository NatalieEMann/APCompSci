package APCompSci.Assignments.FinalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Connect4 {
    public static int playerTurn = 1; // Player 1 = 1, player 2 = 2
    static int[][] board = new int[6][7];
    static int turnCount = 0;
    static boolean draw;
    static boolean win;
    public static Scanner input = new Scanner(System.in);
    public static FileManager fileManager = new FileManager();
    public static ArrayList<Integer> gameFile;
    public static void main(String[] args) {
        System.out.println("================================\n" + //
                        "| 0. Normal Play\n" + //
                        "| 1. Upload File and Play\n" + //
                        "| 2. Quit\n" + //
                        "================================");
        int choice = input.nextInt();
        if(choice == 0){
            playGame();
        } else if(choice == 1){
            // File Manager One
            System.out.println("================================\n" + //
                                "| 0. Game 1\n" + //
                                "| 1. Game 2\n" + //
                                "| 2. Game 3\n" + //
                                "================================");
            int ch = input.nextInt();
            if(ch == 0){
                gameFile = fileManager.load(1);
                // System.out.println(gameFile);
                readerMove();
            } else if(ch == 1){
                gameFile = fileManager.load(2);
                // System.out.println(gameFile);
                readerMove();
            } else if(ch == 2){
                gameFile = fileManager.load(3);
                // System.out.println(gameFile);
                readerMove();
            }
        } else if(choice == 2){
            System.exit(0);
        }
    }

    public static void playGame(){
        while (true) {
            System.out.println("it's Player " + playerTurn + "'s turn");
            printBoard();
            int placeChoice = input.nextInt();
            move(placeChoice, playerTurn);
            if (win) {
                System.out.println("Player " + playerTurn + " has won");
                break;
            }
            if (draw) {
                System.out.println("Somehow you managed to draw, nobody won");
                break;
            }
        }
    }

    public static void printBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] != 0) {
                    System.out.print("| " + board[r][c] + " ");
                } else {
                    System.out.print("|   "); 
                }
                if(c == board[0].length - 1){
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
    }

    public static void readerMove(){
        printBoard();
        while (true) {
            int play = gameFile.get(0);
            System.out.println("it's Player " + playerTurn + "'s turn");
            move(play, playerTurn);
            System.out.println("");
            printBoard();
            if (win) {
                System.out.println("Player " + playerTurn + " has won");
                break;
            }
            if (draw) {
                System.out.println("Somehow you managed to draw, nobody won");
                break;
            }
            gameFile.remove(0);
        }
    }

    public static boolean move(int col, int player){
        if(col >=0 && col < board[0].length){
            if(board[0][col] != 0){ // CHECKING FOR IF IT IS FULL
                System.out.println("Column is Full, go somewhere else"); 
            } else {
                int emptySpace = 0;
                for(int i = 0; i<board.length; i++){
                    if (board[i][col] == 0) {
                        emptySpace = i;
                    }
                }
                board[emptySpace][col] = player;
                if(checkWin()){
                    win = true;
                } else if(turnCount == 41){ // draw in connect 4 when turn is 41
                    draw = true;
                } else {
                    turnCount++;
                    if(playerTurn == 1){
                        playerTurn++;
                    } else {
                        playerTurn--;
                    }
                }
            }
        } else {
            System.out.println("Input a different number, between 0 and 6 please");
        }
        return checkWin();
    }
    public static boolean checkWin(){
        return checkVeritcal() || checkAcross() || checkDiagonal();
    }
    public static boolean checkVeritcal(){
        for(int r = 3; r < 6; r++){
            for(int c = 0; c < 7; c++){
                if(board[r][c] == playerTurn && board[r-1][c] == playerTurn && board[r-2][c] == playerTurn && board[r-3][c] == playerTurn){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkAcross(){
        for(int r = 0; r < 6; r++){
            for(int c = 0; c < 4; c++){
                if(board[r][c] == playerTurn && board[r][c+1] == playerTurn && board[r][c+2] == playerTurn && board[r][c+3] == playerTurn){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkDiagonal(){
        for(int r = 3; r < 6; r++){
            for(int c = 3; c < 7; c++){
                if(board[r][c] == playerTurn && board[r - 1][c - 1] == playerTurn && board[r - 2][c - 2] == playerTurn && board[r - 3][c - 3] == playerTurn){
                    return true;
                } 
            }
        }
        for(int r = 3; r < 6; r++){
            for(int c = 0; c < 4; c++){
                if(board[r][c] == playerTurn && board[r - 1][c + 1] == playerTurn && board[r - 2][c + 2] == playerTurn && board[r - 3][c + 3] == playerTurn) {
                    return true;
                }
            }
        }
        return false;
    }
}
