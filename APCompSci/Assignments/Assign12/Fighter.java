package APCompSci.Assignments.Assign12;

public class Fighter extends Character{
    public Fighter(String name, int hp){
        super(name, hp);
    }
    @Override
    public void action(){
        System.out.println("Fighter slices with their sword");
    }
}
