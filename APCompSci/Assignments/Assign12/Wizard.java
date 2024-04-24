package APCompSci.Assignments.Assign12;

public class Wizard extends Character {
    public Wizard(String name, int hp){
        super(name, hp);
    }
    
    @Override
    public void action(){
        System.out.println("The Wizard casts fireball");
    }
}
