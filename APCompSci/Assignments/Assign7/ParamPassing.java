package APCompSci.Assignments.Assign7;
/**
 * FILE: ParamPassing.java
 * DATE: Nov 20, 2023
 * AUTHOR: Natalie Mann
 * VERSION: 1.0
 * PURPOSE:  
 */

public class ParamPassing {
    public void changeCar(Car c){
        if(c.getName().contains("Beemer")||c.getName().contains("Mercedes")|| c.getName().contains("Hyundai")){
            c.setName("***" + c.getName());
        }
    }
}