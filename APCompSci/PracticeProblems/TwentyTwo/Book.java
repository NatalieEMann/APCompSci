package APCompSci.PracticeProblems.TwentyTwo;

public class Book {
    private int numPages;
    private String bookTitle;

    public Book(int pages, String title){
        numPages = pages;
        bookTitle = title;
    }
    public String toString(){
        return bookTitle + " " + numPages;
    }
    public int length(){
        return numPages;
    }
}