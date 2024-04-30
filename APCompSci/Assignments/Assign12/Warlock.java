package APCompSci.Assignments.Assign12;

public class Warlock extends Character {
    public Warlock(String name){
        super(name, 10, 10, 180, 1, 0);
    }
    
    @Override
    public void action(){
        System.out.println(this.name + " summons the gift of their patron and uses eldritch blast");
    }
    @Override
    public String getName(){
        return this.name;
    }
}
