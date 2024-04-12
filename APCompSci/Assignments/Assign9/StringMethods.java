package APCompSci.Assignments.Assign9; 
 
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *      FILE:       StringMethods.java
 *      DATE:       9/29/08 Original
 *      AUTHOR:     mr Hanley
 *      VERSION:    3.1
 *      PURPOSE:    String Methods to be completed by Student
 *                  1/5/2022: Added a second parameter to the password method
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
 */
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class StringMethods {

    /**
     * ***************************************************************
     * public String pascalsTri(int levels) { pre: levels >= 3 post: returns a
     * String consisting of Pascals' triangle with \t and \n as appropriate
     * example levels = 3 \t\t1\n \t1\t\t1\n 1\t\t2\t\t1\n
     *
     * @param levels levels of Pascal's triangle desired
     * @return endString a string that holds the number and format of the triangle
     *
     ****************************************************************
     */
    public String pascalsTri(int levels) {
        String endString = "";
        int[][] pasc = new int[levels][levels];
        for (int r = 0; r < levels; r++) { // the rows
            for (int i = 0; i < levels - 1 - r; i++) { // formating - a pain (goes below 1 level and then the amount of rows and adds a tab to the string
                endString += "\t";
            }
            for (int c = 0; c <= r; c++) { // the columns
                if (r == c || c == 0) {
                    pasc[r][c] = 1;
                } else {
                    pasc[r][c] = pasc[r - 1][c - 1] + pasc[r - 1][c]; // just going up and over to add together the previous parts of the triangle in order to get that number
                }
                if (r != levels && c != 0) { // if it is determined that it isn't the end then it will tab twice for formatting
                    endString += "\t\t";
                }
                endString += pasc[r][c]; // adds the # to the string
            }
            endString += "\n"; // end of the row 
        }
        return endString;
    }

    /**
     * ***************************************************************
     * public int numWords(String songTitle) { pre: Write in a song title 
     * post: the # of words
     * 
     * @param songTitle Takes in the name of a song
     * @return word returns the amount of words in the title
     *
     ****************************************************************
     */
    public int numWords(String songTitle) {
        String temp = songTitle; // temp to keep the songTitle in
        int word = 0; // # of words

        if (temp == null || temp.isEmpty()) { // if it doesn't have anything
            return word;
        }
        for (int i = 0; i < temp.length(); i++) { 
            if (temp.charAt(i) != ' ') { // if a character at #(i) does not equal a space ++ for words
                word++;
                while (temp.charAt(i) != ' ' && i < temp.length() - 1) { // while the previous condition is true and i is less than the length - 1 add to i
                    i++;
                }
            }
        }
        return word;
    }

    /**
     * ***************************************************************
     * public String findTitle(String html) pre: post:
     * 
     * @param html the html file inserted
     * @return returns the title found based on the "header"
     *
     ****************************************************************
     */
    public String findTitle(String html) {
        String title = html.substring(html.indexOf("<title>") + 7, html.indexOf("</title>")); // searches for the beginning <title> and end </title>
        return title;
    }

    /**
     * ***************************************************************
     * public String findLinks(String html) pre: an html file from a website 
     * post: the number of links as well as the actual link
     * 
     * @param html takes in the html file
     * @return links returns a string that is full of each of the links found
     * based on the "header"
     *
     ****************************************************************
     */
    public String[] findLinks(String html) {
        int start = 0;
        int end = 0;
        int where = 0;
        int count = 0;
        while (true) {
            where = html.indexOf("<a href=", start); // at the start where <a href=
            if (where == -1) { // if none, break the loop
                break;
            }
            count++;
            start = where + 1;
        }
        String[] links = new String[count]; // makes a new string with the amount of possible links
        start = 0;
        for (int i = 0; i < count; i++) {
            start = html.indexOf("<a href=", end);
            end = html.indexOf("\"", start + 9);
            links[i] = html.substring(start + 8, end); // puts what the link is after the start and end into the array
        }
        return links;
    }

    /* ***************************************************************
         public boolean passwordVerify(String text, int level) pre: pass in pw and
         which level to test post: true if password meets requirements for that
         level
         * @param text a string holding the text of the password
         * @param level the level for the password
         * @return temp a boolean that determines if the password meets all the needs
     */
    public boolean passwordVerify(String text, int level) {
        boolean temp = false;
        boolean symbol = false; // these are all of the possible needed things
        boolean digit = false;
        boolean upperCase = false;
        if (text.length() >= 6 && level == 1) {
            for (int i = 0; i < text.length(); i++) {
                if (!Character.isLetter(text.charAt(i))) {
                    return true;
                }
            }
        }
        if (text.length() >= 8 && level == 2) {
            for (int i = 0; i < text.length(); i++) {
                if (!Character.isLetterOrDigit(text.charAt(i))) { // this is just texting for each
                    symbol = true;
                } else if (Character.isDigit(text.charAt(i))) {
                    digit = true;
                } else if (Character.isUpperCase(text.charAt(i))) {
                    upperCase = true;
                }
                if (symbol && digit && upperCase) {
                    return true;
                }
            }
        }
        return temp;
    }

    /**
     * ***************************************************************
     * public String openURL(String url) props to Josh Komoroske pre: pass in a
     * url with http:// in front post: returns the page source if possible
     *
     ****************************************************************
     */
    public String openURL(String url) throws Exception {
        URL server = null;
        try {
            server = new URL(url); //connect to the target URL
        } catch (MalformedURLException m) {
            throw new Exception(m);
        }

        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(server.openStream())); //open a new stream buffer
        } catch (IOException ex) {
            throw new Exception(ex);
        }
        //Read in one line at at time and then add to pageSource
        String pageSource = "", sourceLine;
        try {
            while ((sourceLine = in.readLine()) != null) { //keep building the string until there is no more to read
                pageSource += sourceLine + "\n";
            }
            in.close();

        } catch (IOException ex) {
            throw new Exception(ex);
        }

        return pageSource;
    }
}
