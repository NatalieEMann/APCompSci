package APCompSci.Assignments.Assign12;

public class Warlock extends Character {
    public Warlock(String name, int hp){
        super(name, hp);
    }
    
    @Override
    public void action(){
        System.out.println("The Warlock summons the gift of their patron and uses eldritch blast");
    }
}
