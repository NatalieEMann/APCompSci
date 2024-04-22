package APCompSci.Assignments.Assign12;

public abstract class Character {
    // CLASSES USED: Barbarian, Cleric, Fighter, Paladin, Rogue, Warlock, Wizard
    // character class has level, hp, hpmax, etc 

    // PROTECTED USED SO THAT IT IS POSSIBLE TO OVERRIDE

    // Variables
    protected String className;
    protected int level;
    protected int xp;
    protected int toNextLevel;
    protected int hitPoints;
    protected int hitPointsMax;
    protected int healthPotionsCount;
    protected int lockpickingCount;
    protected int trapDisarmCount;
    protected double weight;
    protected int weightLimit; 

    // Getters
    protected final int getLevelCount(){
        return level;
    }
    protected final int getXP(){
        return xp;
    } 
    protected final int getHitPoints(){
        return hitPoints;
    } 
    protected final int getHitPointsMax(){
        return hitPointsMax;
    }  
    protected final int getHealthPotionCount(){
        return healthPotionsCount;
    } 
    protected final int getLockpickingCount(){
        return lockpickingCount;
    } 
    protected final int gettrapDisarmCount(){
        return trapDisarmCount;
    }

    // Leveling System
    protected final void levelUp(int level){
        level++;
    }
    protected final void addXP(int xpToAdd){
        xp = xp+xpToAdd;
        if(xp >= toNextLevel){
            levelUp(level);
            xp=xp-toNextLevel;
        }
    }

    // Health 
    protected final void damageTaken(int dmgTaken){
        hitPoints = hitPoints - dmgTaken;
    }
    protected final void addHealthPotion(int foundHealthPotions){
        healthPotionsCount = healthPotionsCount+foundHealthPotions;
    }

    // Tools
    protected final void addLockpickingKit(int foundLockpicks){
        lockpickingCount = lockpickingCount + foundLockpicks;
    }
    protected final void addTrapDisarmKit(int foundTrapDisarm){
        trapDisarmCount = trapDisarmCount + foundTrapDisarm;
    }

    
}

