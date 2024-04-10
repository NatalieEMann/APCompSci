package HW;

public class Instructor extends Person{

    private double salary;

    public Instructor(String n, int y, double s) {
        super(n, y);
        salary = s;
    }    
    @Override
    public String toString() {
        return super.toString() + ":" + salary;
    }
}
