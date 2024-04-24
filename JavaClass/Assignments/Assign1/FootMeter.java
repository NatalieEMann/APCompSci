package JavaClass.Assignments.Assign1;

/*
Name: Natalie Mann
Date: Wednesday September 14th 2022
Block: 4 B/D
 */

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class FootMeter {
        public static void main(String[] args) {
        Date now = new Date();
        String display = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG).format(now);
        
        boolean calcOn=true;
        while(calcOn){
        System.out.println(display);
        Scanner input = new Scanner(System.in);
        double FootSquare;
        double MeterSquare;
        System.out.println("Give me the measurement (in square feet)");
        FootSquare = input.nextDouble();
        MeterSquare = FootSquare * 0.092903;
        System.out.println("The Area of your area in Square Meters is:"+ MeterSquare);
        
        System.out.println("Would you like to stop?\n1. Yes\n2. No");
        int cont=input.nextInt();
        calcOn=(1!=cont);
        int end=input.nextInt();
        calcOn=(end!=2);
        input.close();
        }   
}
}
