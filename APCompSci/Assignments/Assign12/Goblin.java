package APCompSci.Assignments.Assign12;

public class Goblin extends Character{
    public Goblin(String name){
        super(name, 15, 10, 180, 1, 0);
    }
    
    @Override
    public void action(){
        System.out.println(this.name + " wacks you with a stick");
    }
}
