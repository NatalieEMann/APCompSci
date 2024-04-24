package APCompSci.Assignments.Assign12;

public class Cleric extends Character{
    public Cleric(String name, int hp){
        super(name, hp);
    }
    
    @Override
    public void action(){
        System.out.println("Cleric heals the lowest character");
    }
}
