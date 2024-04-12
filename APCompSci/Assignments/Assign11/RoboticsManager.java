package APCompSci.Assignments.Assign11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RoboticsManager {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Scanner input = new Scanner(System.in);
        ArrayList<Robotics> team = new ArrayList<>();
        boolean useDefaultFile;
        System.out.println("Use Default File? (other # = yes, 2 = no)");
        if (input.nextInt() == 2) {
            useDefaultFile = false;
        } else {
            useDefaultFile = true;
        }
        // team.add(new Robotics(20, "Rocketeers", "NY", "Shenendehowa", 1992))
        // team.add(new Robotics(2791, "Shaker Robotics", "NY", "Shaker High School", 2009));
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
                    for (int i = 0; i < team.size(); i++) {
                        System.out.printf("| %-5d | %-6d | %-40s | %-18s | %-25s | %-11d | %n", i,
                                team.get(i).teamNumber, team.get(i).teamName,
                                team.get(i).teamCountryOrState,
                                team.get(i).teamHighSchool, team.get(i).teamRookieYear);
                    }
                    break;
                case 2: // Load in from disk file TODO works?
                    fileManager.load(useDefaultFile);
                    read(team);
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
                    team.add(new Robotics(newTNu, newTN, newTCOS, newTHS, newTRY));
                    break; 
                case 4: // Edit existing team
                    // print
                    System.out.println(
                            " -------------------------------------------------------------------------------------------------------------------------- ");
                    System.out.printf("| %-5s | %6s | %-40s | %-18s | %-25s | %-11s | %n", " ", "Team #", "Team Name",
                            "Country or State", "High School", "Rookie Year");
                    System.out.println(
                            " -------------------------------------------------------------------------------------------------------------------------- ");
                    for (int i = 0; i < team.size(); i++) {
                        System.out.printf("| %-5d | %-6d | %-40s | %-18s | %-25s | %-11d | %n", i,
                                team.get(i).teamNumber, team.get(i).teamName,
                                team.get(i).teamCountryOrState,
                                team.get(i).teamHighSchool, team.get(i).teamRookieYear);
                    }
                    // end of print
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
                            team.get(tempI).teamNumber = newTempNum;
                            break;
                        case 2:
                            System.out.println("To what?");
                            String newTempName = input.nextLine();
                            team.get(tempI).teamName = newTempName;
                            break;
                        case 3:
                            System.out.println("To what?");
                            String newTempPlace = input.nextLine();
                            team.get(tempI).teamCountryOrState = newTempPlace;
                            break;
                        case 4:
                            System.out.println("To what?");
                            String newTempHS = input.nextLine();
                            team.get(tempI).teamHighSchool = newTempHS;
                            break;
                        case 5:
                            System.out.println("To what?");
                            int newTempRY = input.nextInt();
                            team.get(tempI).teamRookieYear = newTempRY;
                            break;
                    }
                    break;
                case 5: // Remove a team
                    // print
                    System.out.println(
                            " -------------------------------------------------------------------------------------------------------------------------- ");
                    System.out.printf("| %-5s | %6s | %-40s | %-18s | %-25s | %-11s | %n", " ", "Team #", "Team Name",
                            "Country or State", "High School", "Rookie Year");
                    System.out.println(
                            " -------------------------------------------------------------------------------------------------------------------------- ");
                    for (int i = 0; i < team.size(); i++) {
                        System.out.printf("| %-5d | %-6d | %-40s | %-18s | %-25s | %-11d | %n", i,
                                team.get(i).teamNumber, team.get(i).teamName,
                                team.get(i).teamCountryOrState,
                                team.get(i).teamHighSchool, team.get(i).teamRookieYear);
                    } 
                    // print end  
                    System.out.println("What team do you want to delete - ID number NOT actual team number?");
                    int tempA = input.nextInt();
                    team.remove(tempA);
                    break;
                case 6: // Sort the list TODO
                    Collections.sort(team);
                    break;
                case 7: // Save the list to a file TODO
                    save(team, fileManager);
                    break;
                case 8: // Exit
                    save(team, fileManager);
                    System.out.println("Rude.");
                    System.exit(0);
            }
        }
    }

    public static void save(ArrayList<Robotics> team, FileManager fileManager) {
        String toSave = "";
        for (int i = 0; i < team.size(); i++) {
            // toSave += "New:";
            // toSave += "|" + team.get(i).teamNumber + "|";
            toSave += "|" + team.get(i).teamNumber;
            toSave += "|" + team.get(i).teamName;
            toSave += "|" + team.get(i).teamCountryOrState;
            toSave += "|" + team.get(i).teamHighSchool;
            toSave += "|" + team.get(i).teamRookieYear + "|\n";
        }
        fileManager.save(toSave);
    }
    public static void read(ArrayList<Robotics> tempTeamList){
        try{
            BufferedReader input = new BufferedReader(new FileReader("Team.txt"));

            String line; 
            line = input.readLine();
            while(line != null){
                StringTokenizer st = new StringTokenizer(line, "|");
                int tempNum = Integer.parseInt(st.nextToken());
                String tempName = st.nextToken();
                String tempCOS = st.nextToken();
                String tempHS = st.nextToken();
                int tempRY = Integer.parseInt(st.nextToken());

                tempTeamList.add(new Robotics(tempNum, tempName, tempCOS, tempHS, tempRY));  

                line = input.readLine();
            }
            input.close();
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}