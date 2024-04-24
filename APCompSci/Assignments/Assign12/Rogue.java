package APCompSci.Assignments.Assign12;

public class Rogue extends Character {
    public Rogue(String name, int hp){
        super(name, hp);
    }
    
    @Override
    public void action(){
        System.out.println("The Rogue sneakily stabs the enemy");
    }
}
