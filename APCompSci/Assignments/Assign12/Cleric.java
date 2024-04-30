package APCompSci.Assignments.Assign12;

public class Cleric extends Character{
    public Cleric(String name){
        super(name, 11, 10, 120, 1, 0);
    }
    
    @Override
    public void action(){
        System.out.println(this.name + " heals the lowest character");
    }
    @Override
    public String getName(){
        return this.name;
    }
}
