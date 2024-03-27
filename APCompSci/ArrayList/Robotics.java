package APCompSci.ArrayList;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Robotics implements Comparable {
    public int teamNumber;
    public String teamName;
    public String teamCountryOrState;
    public String teamHighSchool;
    public int teamRookieYear;

    // public static ArrayList<Robotics> team = new ArrayList<>();

    /**
     * Constructor that clears all the arrays
     */
    // Robotics(){
    //     team.clear();
    // }

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
                this.teamNumber = tNu;
                this.teamName = tN;
                this.teamCountryOrState = tCS;
                this.teamHighSchool = tHS;
                this.teamRookieYear = rY;
    }

    @Override
    public int compareTo(Object other) {
            Robotics t = (Robotics)other;
            if(this.teamName.compareTo(t.teamName)<0) {
                return -1; 
        } else if(this.teamName.compareTo(t.teamName)>0){
            return 0;
        }
        return 1;
    }
}