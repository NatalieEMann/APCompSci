package APCompSci.ArrayList;

import java.util.ArrayList;

public class Robotics {
    public static ArrayList<Integer> teamNumber = new ArrayList<>();
    public static ArrayList<String> teamName = new ArrayList<>();
    public static ArrayList<String> teamCountryOrState = new ArrayList<>();
    public static ArrayList<String> teamHighSchool = new ArrayList<>();
    public static ArrayList<Integer> teamRookieYear = new ArrayList<>();

    public static ArrayList<Robotics> team = new ArrayList<>();

    /**
     * Constructor that clears all the arrays
     */
    Robotics(){
        teamNumber.clear();
        teamName.clear();
        teamCountryOrState.clear();
        teamHighSchool.clear();
        teamRookieYear.clear();
    }

    /**
     * Takes in a bunch of elements about the team and sets it into the array
     * 
     * @param tNu The Team Number
     * @param tN  The Name of the Team
     * @param tCS The country or (if from the US) state of the team
     * @param tHS The Highschool the team represents
     * @param rY  The teams rookie year
     */
    Robotics(int tNu, String tN, String tCS, String tHS,
            int rY) {
                teamNumber.add(tNu);
                teamName.add(tN);
                teamCountryOrState.add(tCS);
                teamHighSchool.add(tHS);
                teamRookieYear.add(rY);
    }
    // public static ArrayList<Integer> getTeamNumber(){
    //     return teamNumber;
    // }
    // public static ArrayList<String> getTeamName() {
    //     return teamName;
    // }
    // public static ArrayList<String> getTeamCountryOrState() {
    //     return teamCountryOrState;
    // }
    // public static ArrayList<String> getTeamHighSchool() {
    //     return teamHighSchool;
    // }
    // public static ArrayList<Integer> getTeamRookieYear() {
    //     return teamRookieYear;
    // }
}