/*------------------------------------------------
File: Practice.java
Date: Nov 14, 2022
Block: 4 B/D
Author: Natalie E Mann
Purpose:
Sauce Code: 3
------------------ team20.com ------------------*/
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:\n1. Practice 7\n2. Practice 8\n3. Practice 9\n4. Practice 10\n5. Practice 11\n6. Practice 12\n0. Exit");
            int choice = input.nextInt();
            if (choice == 0) {
                System.exit(0);
            }
            if (choice == 1) {
                int r = 0;
                while (r < 3) {
                    int c = 0;
                    while (c < 4) {
                        System.out.print("*");
                        c++;
                    }
                    System.out.println();
                    r++;
                }
            }
            if (choice == 2) {
                int r = 0;
                while (r < 6) {
                    int c = 0;
                    while (c < 4) {
                        if (r % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print("^");
                        }
                        c++;
                    }
                    r++;
                    System.out.println();
                }
            }
            if (choice == 3) {
                System.out.println("Enter the size of the box please. ");
                int size = input.nextInt();
                int r = 0;
                while (r < size) {
                    int c = 0;
                    while (c < size) {
                        if (r == 0 || r == size - 1 || c == 0 || c == size - 1) {
                            System.out.print("&");
                        } else {
                            System.out.print(" ");
                        }
                        c++;
                    }
                    r++;
                    System.out.println();
                }

            }
            if (choice == 4) {
                int[][] maze = new int[10][10];
                final int WALL = 1;
                final int DOOR = 2;
                maze[2][3] = WALL;
                maze[2][4] = WALL;
                maze[2][5] = WALL;
                maze[2][6] = DOOR;
                maze[3][3] = WALL;
                maze[4][3] = WALL;
                int r = 0;
                while (r < 10) {
                    int c = 0;
                    while (c < 10) {
                        System.out.print(maze[r][c]);
                        c++;
                    }
                    r++;
                    System.out.println();
                }
            }
            if (choice == 5) {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(i);
                    if (i % 10 == 0) {
                        System.out.println("*");
                    }
                }
            }
            if (choice == 6) {
                for (long i = 1, sum = 1; i <= 50; i++) {
                    System.out.println(sum);
                    sum = sum * 2;
                }
            }
            input.close();
        }
    }
}
