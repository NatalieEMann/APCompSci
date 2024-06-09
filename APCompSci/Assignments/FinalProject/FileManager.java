package APCompSci.Assignments.FinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    
    public ArrayList<Integer> load(int game) {
        ArrayList<Integer> temp = new ArrayList<>();
        if (game == 1) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\NatalieStuff\\APCompSci\\Assignments\\FinalProject\\TextFiles\\game1.txt"));
                String line = reader.readLine();
                while(line != null){
                    temp.add(Integer.valueOf(line));
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("You suck");
            }
        } else if (game == 2) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\NatalieStuff\\APCompSci\\Assignments\\FinalProject\\TextFiles\\game2.txt"));
                String line = reader.readLine();
                while(line != null){
                    temp.add(Integer.valueOf(line));
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("You suck");
            } 
        } else if (game == 3) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\NatalieStuff\\APCompSci\\Assignments\\FinalProject\\TextFiles\\game3.txt"));
                String line = reader.readLine();
                while(line != null){
                    temp.add(Integer.valueOf(line));
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("You suck");
            }
        }
        return temp;
    }
}

