
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Scanner;

public class Copying {

    Scanner input = new Scanner(System.in);

    static final char ur = '\u2557';
    static final char ul = '\u2554';
    static final char top = '\u2550';
    static final char side = '\u2551';
    static final char sideTL = '\u2560';
    static final char sideRL = '\u2563';
    static final char bl = '\u255A';
    static final char br = '\u255D';
    static final char one = '\u2776';
    static final char two = '\u2777';
    static final char thr = '\u2778';
    static final char fou = '\u2779';
    static final char fiv = '\u277A';
    static final char six = '\u277B';
    static final char sev = '\u277C';
    static final char eig = '\u277D';

    final int SIZE = 15;
    String[] tryList = new String[SIZE];
    String[] tried = new String[SIZE];
    String[] no = new String[SIZE];

    public static void main(String[] args) {
        Copying c = new Copying();
    }

    public String padding(String text, int totalLength) {
        int difference = totalLength - text.length();
        if (difference > 0) {

            for (int i = 0; i < difference; i++) {
                text += " ";
            }
        }
        return text;
    }

    public Copying() {
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        System.setOut(out);
        menu();
    }

    public void menu() {

        while (true) {
            Date now = new Date();
            System.out.print("\t\t" + ul);
            for (int i = 0; i < 50; i++) {
                System.out.print(top);
            }
            System.out.println(ur);
            System.out.println("\t\t" + side + "     ***    Array Copying Menu    ***    " + side);
            System.out.print("\t\t" + sideTL);

            for (int i = 0; i < 50; i++) {
                System.out.print(top);
            }
            System.out.println(sideRL);
            System.out.println("\t\t" + side + "        " + one + " = Display Lists                " + side);
            System.out.println("\t\t" + side + "        " + two + " = Move from First List to 2nd  " + side);
            System.out.println("\t\t" + side + "        " + thr + " = Move from First List to 3rd  " + side);
            System.out.println("\t\t" + side + "        " + fou + " = Consolidate                  " + side);
            System.out.println("\t\t" + side + "        " + fiv + " = Initialize                   " + side);
            System.out.println("\t\t" + side + "        " + six + " = Clear Tried List             " + side);
            System.out.println("\t\t" + side + "        " + sev + " = Add to Try List              " + side);
            System.out.println("\t\t" + side + "        " + eig + " = Exit                         " + side);
            System.out.println("\t\t" + side + "             Your Selection?             " + side);
            System.out.print("\t\t" + bl);
            for (int i = 0; i < 50; i++) {
                System.out.print(top);
            }
            System.out.println(br);

            int choice = input.nextInt();
            switch (choice) {
                case 1 ->
                    display();
                case 2 ->
                    moveFromTryToEct(2);
                case 3 ->
                    moveFromTryToEct(3);
                case 4 ->
                    consolidate();
                case 5 ->
                    initialize();
                case 6 ->
                    clearTried();
                case 7 ->
                    addTryList();
                case 8 ->
                    System.exit(0);
            }
        }
    }

    public void display() {
        System.out.println("\tInterested----------Tried----------------Not going there!-----");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + "\t");

            if (tryList[i] == null || tryList[i].equals("")) {
                System.out.print(padding("{EMPTY}", 20));
            } else {
                System.out.print(padding(tryList[i], 20));
            }

            if (tried[i] == null || tried[i].equals("")) {
                System.out.print(padding("{EMPTY}", 20));
            } else {
                System.out.print(padding(tried[i], 20));
            }
            if (no[i] == null || no[i].equals("")) {
                System.out.print(padding("{EMPTY}", 20));
            } else {
                System.out.print(padding(no[i], 20));
            }
            System.out.println("");
        }
    }

    public void initialize() {
        tryList = new String[]{"Fish Eyes", "Frog Legs", "Alligator", "Sushi", "Buffalo", "Cow Tongue", "Shark", "Scrapple", "Cheese Steak", "Seaweed", "Vegeratian Korma", "Deep Fried Oreo", "ChickBacRanch Pizza", "Caviar", ""};
        tried = new String[]{"Rice and Beans", "Liver", "Paella", "Chicken", "Pizza", "", "", "", "", "", "", "", "", "", ""};
        no = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    }

    public void clearTried() {
        for (int i = 0; i < SIZE; i++) {
            tried[i] = "";
        }
    }

    public void moveFromTryToEct(int which) {
        System.out.println("Starting with which item?");
        int start = input.nextInt();
        System.out.println("Ending with which item?");
        int end = input.nextInt();
        int newVlaues = (end - start) + 1;
        String[] temp = new String[newVlaues];
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (start <= i && i <= end) {
                temp[counter] = tryList[i];
                tryList[i] = "";
                counter++;
            }
        }
        if (which == 2) {
            for (int i = 0; i < SIZE; i++) {
                if (tried[i].equals("")) {
                    for (int x = 0; x < newVlaues; x++) {
                        if (temp[x].equals("")) {
                        } else {
                            tried[i] = temp[x];
                            temp[x] = "";
                            break;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < SIZE; i++) {
                if (no[i].equals("")) {
                    for (int x = 0; x < newVlaues; x++) {
                        if (temp[x].equals("")) {
                        } else {
                            no[i] = temp[x];
                            temp[x] = "";
                            break;
                        }
                    }
                }
            }
        }
    }

    public void addTryList() {
        System.out.println("Please consolidate first");
        System.out.println("OK, what food to add");
        input.nextLine();
        String word = input.nextLine();
        for (int i = 0; i < SIZE; i++) {
            if (tryList[i].equals("")) {
                tryList[i] = word;
                break;
            }
        }
    }

    private void consolidate() {
        for (int i = 1; i < SIZE; i++) {
            if (tryList[i].equals("")) {
                for (int x = i; x < SIZE; x++) {
                    if (tryList[x].equals("")) {
                    } else {
                        tryList[i] = tryList[x];
                        tryList[x] = "";
                        break;
                    }
                }
            }
        }
    }
}
