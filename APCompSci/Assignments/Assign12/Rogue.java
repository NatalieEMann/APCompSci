package APCompSci.Assignments.Assign12;

public class Rogue extends Character {
    public Rogue(String name){
        super(name, 10, 10, 180, 1, 0);
    }
    
    @Override
    public void action(){
        System.out.println(this.name + " sneakily stabs the enemy");
    }
}
