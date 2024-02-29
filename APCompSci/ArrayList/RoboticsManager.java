package APCompSci.ArrayList;

import java.util.Scanner;

public class RoboticsManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        new Robotics(20, "Rocketeers", "NY", "Shenendehowa", 1992);
        new Robotics(2791, "Shaker Robotics", "NY", "Shaker High School", 2009);
        System.out.flush();
        while (true) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------\nHello and welcome to Natalie's shortened, ripped off version of thebluealliance.com\n----------------------------------------------------------------------------------------------------\n1. List All Teams\n2. Load in from Disk File\n3. Add another team\n4. Edit existing team\n5. Remove a team\n6. Sort the list\n7. Save the list to file\n8. Exit\n----------------------------------------------------------------------------------------------------");
            int menu = input.nextInt();
            switch (menu) {
                case 1: // View List
                    System.out.println(
                            " -------------------------------------------------------------------------------------------------------------------------- ");
                    System.out.printf("| %-5s | %6s | %-40s | %-18s | %-25s | %-11s | %n", " ", "Team #", "Team Name",
                            "Country or State", "High School", "Rookie Year");
                    System.out.println(
                            " -------------------------------------------------------------------------------------------------------------------------- ");
                    for (int i = 0; i < Robotics.teamNumber.size(); i++) {
                        System.out.printf("| %-5d | %-6d | %-40s | %-18s | %-25s | %-11d | %n", i,
                                Robotics.teamNumber.get(i), Robotics.teamName.get(i),
                                Robotics.teamCountryOrState.get(i),
                                Robotics.teamHighSchool.get(i), Robotics.teamRookieYear.get(i));
                    }
                    break;
                case 2: // Load in from disk file TODO
                    break;
                case 3: // Add new team
                    System.out.println("Team Number?");
                    int newTNu = input.nextInt();
                    input.nextLine();
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
                    System.out.println("What team do you want to edit - ID number NOT actual team number?");
                    int tempI = input.nextInt();
                    System.out.println(
                            "What element do you want to edit?\n1. Team Number\n2. Team Name\n3. Team Country or State\n4. Team High School\n5. Team Rookie Year");
                    int tempCh = input.nextInt();
                    input.nextLine();
                    switch (tempCh) {
                        case 1:
                            System.out.println("To what?");
                            int newTempNum = input.nextInt();
                            Robotics.teamNumber.set(tempI, newTempNum);
                            break;
                        case 2:
                            System.out.println("To what?");
                            String newTempName = input.nextLine();
                            Robotics.teamName.set(tempI, newTempName);
                            break;
                        case 3:
                            System.out.println("To what?");
                            String newTempPlace = input.nextLine();
                            Robotics.teamCountryOrState.set(tempI, newTempPlace);
                            break;
                        case 4:
                            System.out.println("To what?");
                            String newTempHS = input.nextLine();
                            Robotics.teamHighSchool.set(tempI, newTempHS);
                            break;
                        case 5:
                            System.out.println("To what?");
                            int newTempRY = input.nextInt();
                            Robotics.teamRookieYear.set(tempI, newTempRY);
                            break;
                    }
                    break;
                case 5: // Remove a team TODO
                    System.out.println("What team do you want to delete - ID number NOT actual team number?");
                    int tempA = input.nextInt();
                    Robotics.teamNumber.remove(tempA);
                    Robotics.teamName.remove(tempA);
                    Robotics.teamCountryOrState.remove(tempA);
                    Robotics.teamHighSchool.remove(tempA);
                    Robotics.teamRookieYear.remove(tempA);
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
}