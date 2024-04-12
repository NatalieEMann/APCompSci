package APCompSci.ClassWork.Inheritance;

public class Person {
    private String name;
    private int birthYear;
    public Person(String n,int y){
        name = n;
        birthYear = y;
    }
    @Override
    public String toString(){
       return name +":" + birthYear; 
    }
}
