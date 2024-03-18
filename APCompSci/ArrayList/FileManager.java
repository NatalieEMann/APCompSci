package APCompSci.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    public ArrayList<Robotics> team = new ArrayList<>();

    public void save(String toSave) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Team.txt"));
            writer.write(toSave);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String load(boolean isDefault) {
        if(!isDefault){
            try {
                BufferedReader reader = new BufferedReader(new FileReader("Team.txt"));
                String fileString = reader.readLine();
                reader.close();
                return fileString;
            } catch (IOException e) {
                e.printStackTrace();
            }
    } else {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("TeamDefault.txt"));
            String fileString = reader.readLine();
            reader.close();
            return fileString;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        return null;
    }
        
    }
