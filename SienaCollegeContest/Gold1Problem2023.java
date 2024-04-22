package SienaCollegeContest;

import java.util.Scanner;

public class Gold1Problem2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a non negative integer less than 200.");
        int speed = input.nextInt();
        System.out.println("Give a unit (knots or mph)");
        input.nextLine();
        String unit = input.nextLine();

        int fjksdljfkls = 0;

        if (unit.equals("KNOTS")) {
            if (speed == 0) {
                fjksdljfkls = 0;
            } else if (speed >= 1 && speed <= 3) {
                fjksdljfkls = 1;
            } else if (speed >= 4 && speed <= 7) {
                fjksdljfkls = 2;
            } else if (speed >= 8 && speed <= 12) {
                fjksdljfkls = 3;
            } else if (speed >= 13 && speed <= 18) {
                fjksdljfkls = 4;
            } else if (speed >= 19 && speed <= 24) {
                fjksdljfkls = 5;
            } else if (speed >= 25 && speed <= 31) {
                fjksdljfkls = 6;
            } else if (speed >= 32 && speed <= 38) {
                fjksdljfkls = 7;
            } else if (speed >= 39 && speed <= 46) {
                fjksdljfkls = 8;
            } else if (speed >= 47 && speed <= 54) {
                fjksdljfkls = 9;
            } else if (speed >= 55 && speed <= 63) {
                fjksdljfkls = 10;
            } else if (speed >= 64 && speed <= 72) {
                fjksdljfkls = 11;
            } else if (speed >= 73) {
                fjksdljfkls = 12;
            }
        }

        if (unit.equals("MPH")) {
            if (speed == 0) {
                fjksdljfkls = 0;
            } else if (speed >= 1 && speed <= 3) {
                fjksdljfkls = 1;
            } else if (speed >= 4 && speed <= 6) {
                fjksdljfkls = 2;
            } else if (speed >= 7 && speed <= 10) {
                fjksdljfkls = 3;
            } else if (speed >= 11 && speed <= 16) {
                fjksdljfkls = 4;
            } else if (speed >= 17 && speed <= 21) {
                fjksdljfkls = 5;
            } else if (speed >= 22 && speed <= 27) {
                fjksdljfkls = 6;
            } else if (speed >= 28 && speed <= 33) {
                fjksdljfkls = 7;
            } else if (speed >= 34 && speed <= 40) {
                fjksdljfkls = 8;
            } else if (speed >= 41 && speed <= 47) {
                fjksdljfkls = 9;
            } else if (speed >= 48 && speed <= 55) {
                fjksdljfkls = 10;
            } else if (speed >= 56 && speed <= 63) {
                fjksdljfkls = 11;
            } else if (speed >= 64) {
                fjksdljfkls = 12;
            }
        }

        switch (fjksdljfkls) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        input.close();
    }
}
