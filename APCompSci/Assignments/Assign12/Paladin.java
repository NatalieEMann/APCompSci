package APCompSci.Assignments.Assign12;

public class Paladin extends Character{
    public Paladin(String name){
        super(name, 12, 10, 180, 1, 0);
    }
    
    @Override
    public void action(){
        System.out.println(this.name + " summons divine power");
    }
    @Override
    public String getName(){
        return this.name;
    }
}
