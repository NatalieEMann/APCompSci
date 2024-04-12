package APCompSci.Assignments.Assign7;
/**
 * FILE: Planet.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:
 */
public class Planet {

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //++++++++++++++ S T A T I C V A R I A B L E S ++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static double daysAdd;
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S ---------
    //----------------------------------------------------------------
    private String name;
    private double days;
    private int numOrbits;
    private double daysTowardsNext;
    private double daysUntilNext;

    /////////////////////////////////////////////////////////////////
    //////////////////// C O N S T R U C T O R S ////////////////////
    /////////////////////////////////////////////////////////////////
    public Planet(String n, double d) {
        name = n;
        days = d;
    }

    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void addDays(double a) {
        try {
            if (a < 0) {
                throw new IllegalArgumentException("No");
            } else {
                daysAdd += a;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Tried to add negative days.");
            System.exit(0);
        }
    }

    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public int getNumOrbits() {
        numOrbits = (int) ((int) daysAdd / days);
        return (numOrbits); // number of times it can orbit 
    }

    public double getDaysTowardsNext() {
        daysTowardsNext = (days % daysAdd);
        return daysTowardsNext;
    }

    public double getDaysUntilNext() {
        if (daysAdd < days) {
            daysUntilNext = days - (days % daysAdd);
            return daysUntilNext;
        } else {
            daysUntilNext = days - (daysAdd % days);
            return daysUntilNext; // returns the remainder, which equals the days left
        }
    }

    @Override
    public String toString() {
        return name + " Progress: " + numOrbits + " orbits " + daysTowardsNext + " days towards next orbit";
    }

}
