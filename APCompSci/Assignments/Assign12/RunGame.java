package APCompSci.Assignments.Assign12;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Enemy goblin = new Enemy("Gob");

        System.out.println(
                "Who to play as? \n1. Barbarian\n2. Cleric\n3. Fighter\n4. Paladin\n5. Rogue\n6. Warlock\n7. Wizard");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Barbarian barbarian = new Barbarian("Karlach");
                while (barbarian.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                barbarian.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            barbarian.damageTaken(100000, barbarian);
                            break;
                    }
                }
                break;
            case 2:
                Cleric cleric = new Cleric("Shadowheart");
                while (cleric.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                cleric.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            cleric.damageTaken(100000, cleric);
                            break;
                    }
                }
                break;
            case 3:
                Fighter fighter = new Fighter("Lae'zel");
                while (fighter.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                fighter.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            fighter.damageTaken(100000, fighter);
                            break;
                    }
                }
                break;
            case 4:
                Paladin paladin = new Paladin("Minthara");
                while (paladin.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                paladin.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            paladin.damageTaken(100000, paladin);
                            break;
                    }
                }
                break;
            case 5:
                Rogue rogue = new Rogue("Astarion");
                while (rogue.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                rogue.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            rogue.damageTaken(100000, rogue);
                            break;
                    }
                }
                break;
            case 6:
                Warlock warlock = new Warlock("Will");
                while (warlock.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                warlock.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            warlock.damageTaken(100000, warlock);
                            break;
                    }
                }
                break;
            case 7:
                Wizard wizard = new Wizard("Gale");
                while (wizard.hitPoints != 0 && goblin.hitPoints != 0) {
                    System.out.println("An enemy appeared!  \n1. Fight\n2. Run Away?");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            if(goblin.hitPoints != 0){
                                wizard.attack(goblin);
                                System.out.println("You attacked!");
                            }
                            if(goblin.hitPoints == 0){
                                System.out.println("There are no enemies left!");
                            }
                            break;
                        case 2:
                            System.out.println("You tried to run away, and died...");
                            wizard.damageTaken(100000, wizard);
                            break;
                    }
                }
                break;
        }
    }
}
