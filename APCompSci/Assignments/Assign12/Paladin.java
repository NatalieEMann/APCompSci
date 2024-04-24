package APCompSci.Assignments.Assign12;

public class Paladin extends Character{
    public Paladin(String name, int hp){
        super(name, hp);
    }
    
    @Override
    public void action(){
        System.out.println("The Paladin summons divine power");
    }
}
