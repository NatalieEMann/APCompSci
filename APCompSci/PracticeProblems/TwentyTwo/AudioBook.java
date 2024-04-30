package APCompSci.PracticeProblems.TwentyTwo;

public class AudioBook extends Book {
    private int numMinutes;
    public AudioBook(int minutes, int pages, String title){
        super(pages, title);
        numMinutes = minutes;
    }
    public int length(){
        return numMinutes;
    }
    public double pagesPerMinute(){
        return ((double) super.length()) / numMinutes;
    }
}
