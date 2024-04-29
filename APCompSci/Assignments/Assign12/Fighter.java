package APCompSci.Assignments.Assign12;

public class Fighter extends Character{
    public Fighter(String name){
        super(name, 13, 10, 180, 1, 0);
    }
    @Override
    public void action(){
        System.out.println(this.name + " slices with their sword");
    }
}
