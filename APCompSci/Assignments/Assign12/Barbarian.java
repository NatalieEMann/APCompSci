package APCompSci.Assignments.Assign12;

public class Barbarian extends Character {
    public Barbarian(String name, int hp){
        super(name, hp);
    }
    
    @Override
    public void action(){
        System.out.println("Barbarian enters rage");
    }
}
