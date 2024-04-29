package APCompSci.Assignments.Assign12;

public class Barbarian extends Character {
    public Barbarian(String name){
       super(name, 15, 10, 210, 1, 0);

    }
    
    @Override
    public void action(){
        System.out.println(this.name + " enters rage");
    }
}
