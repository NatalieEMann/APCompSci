package APCompSci.Assignments.Assign12;

public class RunGame {
    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Karlach", 15);
        Cleric cleric = new Cleric("Shadowheart", 11);
        Fighter fighter = new Fighter("Lae'zel", 13);
        Paladin paladin = new Paladin("Minthara", 12);
        Rogue rogue = new Rogue("Astarion", 10);
        Warlock warlock = new Warlock("Will", 10);
        Wizard wizard = new Wizard("Gale", 8);

        barbarian.action();
        cleric.action();
        fighter.action();
        paladin.action();
        rogue.action();
        warlock.action();
        wizard.action();
    }
}
