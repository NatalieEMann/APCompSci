package APCompSci.ArrayList;

import java.util.Scanner;

public class RoboticsManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        new Robotics(20, "Rocketeers", "NY", "Shenendehowa", 1992);
        new Robotics(2791, "Shaker Robotics", "NY", "Shaker High School", 2009);
        System.out.println(
                "----------------------------------------------------------------------------------------------------\nHello and welcome to Natalie's shortened, ripped off version of thebluealliance.com\n----------------------------------------------------------------------------------------------------\n1. List All Teams\n2. Load in from Disk File\n3. Add another team\n4. Edit existing team\n5. Remove a team\n6. Sort the list\n7. Save the list to file\n8. Exit\n----------------------------------------------------------------------------------------------------");
        int menu = input.nextInt();
        switch (menu) {
            case 1: // View List
                System.out.println(" ------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %6s | %-40s | %-18s | %-25s | %-11s | %n", "Team #", "Team Name", "Country or State", "High School", "Rookie Year");
                System.out.println(" ------------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < Robotics.teamNumber.size(); i++) {
                    System.out.printf("| %-6d | %-40s | %-18s | %-25s | %-11d | %n", Robotics.teamNumber.get(i), Robotics.teamName.get(i), Robotics.teamCountryOrState.get(i), Robotics.teamHighSchool.get(i), Robotics.teamRookieYear.get(i));
                }
                break;
            case 2: // Load in from disk file TODO
                break;
            case 3: // Add new team
                System.out.println("Team Number?");
                int newTNu = input.nextInt();
                System.out.println("Team Name?");
                String newTN = input.nextLine();
                System.out.println("Team Country or State?");
                String newTCOS = input.nextLine();
                System.out.println("Team High School?");
                String newTHS = input.nextLine();
                System.out.println("Team Rookie Year?");
                int newTRY = input.nextInt();
                new Robotics(newTNu, newTN, newTCOS, newTHS, newTRY);
                break;
            case 4: // Edit existing team TODO
                break;
            case 5: // Remove a team TODO
                break;
            case 6: // Sort the list TODO
                break;
            case 7: // Save the list to a file TODO
                break;
            case 8: // Exit
                System.out.println("Rude.");
                System.exit(0);
        }
    }
}