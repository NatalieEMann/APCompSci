package APCompSci.Assignments.Assign7;

/**
 * FILE: Car.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:  
 */
public class Car {
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //++++++++++++++ S T A T I C V A R I A B L E S ++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static double totalMiles = 0;   
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S ---------
    //----------------------------------------------------------------
    private String name;
    private double gasLevel;
    private double mpg;
    // car go vroom, car lose gas, display gas level, stop at gas station 
    /////////////////////////////////////////////////////////////////
    //////////////////// C O N S T R U C T O R S ////////////////////
    /////////////////////////////////////////////////////////////////
    public Car(){
        mpg = 20; // default value
        gasLevel = 0;
    }
    public Car(double fuelEfficiency){
        mpg = fuelEfficiency;
    }
    public Car(String n, double fuelEfficiency){
        // take in miles per gallon 
        // fuel level = 0 at beginning
        name = n;
        mpg = fuelEfficiency;   
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public double getGas(){
        // returning fuel level
        return gasLevel;
    }
    public String getName(){
        return name;
    }
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void drive(double distance){
        // drives the car for a certain distance
        gasLevel = gasLevel - (distance/mpg);
        totalMiles += distance;
    }
    public void addGas(double gallons){
        try {
            if(gallons<0){
                throw new IllegalArgumentException("No");
            } else {
            gasLevel += gallons;
            }
        } catch (IllegalArgumentException e) {
                System.out.println("Tried to add negative gas.");
                System.exit(0);
        }
        // tank up
    }
    public void setName(String a){
       name = a;
    }
    @Override
    public String toString(){
       return "Name: " + name + "\nMPG: " + mpg + "\nGas Level: " + gasLevel + "\nTotal miles for all cars: " + totalMiles;
    }
}

