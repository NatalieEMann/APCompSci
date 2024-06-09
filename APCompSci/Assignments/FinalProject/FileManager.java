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
                BufferedReader reader = new BufferedReader(new FileReader("game1.txt"));
                String line = reader.readLine();
                while(line != null){
                    temp.add(Integer.valueOf(line));
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("You suck");
            }
        }
        // } else if (game == 2) {
        //     try {
        //         BufferedReader reader = new BufferedReader(new FileReader("game2.txt"));
        //         file = reader.readLine();
        //         reader.close();
        //     } catch (IOException e) {
        //     }
        // } else if (game == 3) {
        //     try {
        //         BufferedReader reader = new BufferedReader(new FileReader("game3.txt"));
        //         file = reader.readLine();
        //         reader.close();
        //     } catch (IOException e) {
        //     }
        // }
        
        // for (int i = 0; i < file.length(); i++) {
        //     String currentChar = file.substring(i, i + 1);
        //     if (currentChar.matches("[0-6]")) {
        //         temp.add(Integer.valueOf(currentChar));
        //     }
        // }
        return temp;
    }
}
