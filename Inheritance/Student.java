package Inheritance;

public class Student extends Person {

    private String major;

    public Student(String n, int y, String m) {
        super(n, y);
        major = m;
    }
    @Override
    public String toString(){
        return super.toString() + ":" + major;
    }
}
