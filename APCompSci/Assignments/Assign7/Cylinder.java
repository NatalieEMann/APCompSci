package APCompSci.Assignments.Assign7;
/**
 * FILE: Cylinder.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:  
 */

public class Cylinder {
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //++++++++++++++ S T A T I C V A R I A B L E S ++++++++++++++++++
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static double totalVol = 0;
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S ---------
    //----------------------------------------------------------------
    private double volume;
    private double radius;
    private double length;
    /////////////////////////////////////////////////////////////////
    //////////////////// C O N S T R U C T O R S ////////////////////
    /////////////////////////////////////////////////////////////////
    
    public Cylinder(double r, double l){
        radius = r;
        length = l;
    }
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void setRadius(double x){
        try {
            if(x<0){
                throw new IllegalArgumentException("No");
            } else {
            x += radius;
            }
        } catch (IllegalArgumentException e) {
                System.out.println("Tried to add negative radius.");
                System.exit(0);
        }
    }
    public void setLength(double x){
        length = x;
    }
    public void setVolume(double x){
        volume = x;
        totalVol += x;
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    
    public double getRadius(){
        return radius;
    }
    public double getLength(){
        return length;
    }
    public double getVolume(){ // uses volume formula
        volume = (volume = Math.PI * (Math.pow(radius, 2)) * length);
        totalVol += volume;
        return volume;
    }
    public double getLenFromVol(){ // rerouting of the volume formula to solve for length
        return (length = (volume/((Math.PI * (Math.pow(radius, 2))))));
    }
    @Override
    public String toString(){
        return "Radius: " + radius + "\nLength: " + length + "\nVolume: " + volume + "\nTotal Volume: " + totalVol;
    }
}
