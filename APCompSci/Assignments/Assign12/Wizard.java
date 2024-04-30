package APCompSci.Assignments.Assign12;

public class Wizard extends Character {
    public Wizard(String name){
        super(name, 10, 10, 180, 1, 0);

    }   
    @Override
    public void action(){
        System.out.println(this.name + " casts fireball");
    }
    @Override
    public String getName(){
        return this.name;
    }
}
