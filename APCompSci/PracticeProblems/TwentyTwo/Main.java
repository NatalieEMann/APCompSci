package APCompSci.PracticeProblems.TwentyTwo;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new AudioBook(100, 300, "The Jungle");
        books[1] = new Book(400, "Captains Courageous");
        // System.out.println(books[0].pagesPerMinute()); // THE WRONG LINE
        
        System.out.println(books[0].toString());
        System.out.println(books[0].length());
        System.out.println(books[1].toString());
    }
}
