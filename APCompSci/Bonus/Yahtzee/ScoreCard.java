package APCompSci.Bonus.Yahtzee;
public class ScoreCard {

    private int scoreTotal = 0;
    private String name;
    private int topScore = 0;
    private int roundScore = 0;
    private boolean bonus = false;
    private static int[] scores = new int[13];
    private static int[] diceValues = new int[5];
    private static int[] diceCounts = new int[5];

    public ScoreCard(String n) {
        name = n;
    }

    public boolean[] lowSecCheck() {
        boolean[] canScore = new boolean[7];    // 0 = 3 of a kind 1 = 4 of a kind 2 2 = full house 3= low straight 4 = big stragitht 5 =yhatzee 6 = chance 
        int straightCount = 0;
        int threeDie = -1;
        for (int i = 0; i < 5; i++) {
            if (diceCounts[i] != 0) {
                straightCount++;
            }

            if (diceCounts[i] >= 3) {   // 3 of a kind
                canScore[0] = true;
                threeDie = i;
            }
            if (diceCounts[i] >= 4) { // 4 of a kind
                canScore[1] = true;
            }
            if (diceCounts[i] >= 2 && threeDie != i) { // full house
                canScore[2] = true;
            }
            if (straightCount == 4) {// small straight 
                canScore[3] = true;
            }
            if (straightCount == 5) {// big straighjt
                canScore[4] = true;
            }
            if (diceCounts[i] == 5) {  //YHATZEE
                canScore[5] = true;
            }
        }
        canScore[6] = true;
        return canScore;
    }

    public void DVSetter(int[] DV) {
        for (int i = 0; i < 4; i++) {
            diceValues[i] = DV[i];
            diceCounts[DV[i]-1]++;          
        }
        lowSecCheck();
    }

    public void Score(int tableSpot) {
        roundScore = 0;
        int diceTotal = 0;
        for (int i = 0; i < 5; i++) {
            diceTotal += diceValues[i];
        }
        tableSpot--;
        boolean[] canLow = lowSecCheck();
        switch (tableSpot) {               // same order as yhaztee score table
            case 0 -> {
                roundScore = diceCounts[0];
                scoreTotal += diceCounts[0];
                scoreTotal += diceCounts[0];
            }
            case 1 -> {
                roundScore = diceCounts[1] * 2;
                scoreTotal += diceCounts[1] * 2;
                topScore += diceCounts[1] * 2;
            }
            case 2 -> {
                roundScore = diceCounts[2] * 3;
                scoreTotal += diceCounts[2] * 3;
                topScore += diceCounts[2] * 3;
            }
            case 3 -> {
                roundScore = diceCounts[3] * 4;
                scoreTotal += diceCounts[3] * 4;
                topScore += diceCounts[3] * 4;
            }
            case 4 -> {
                roundScore = diceCounts[4] * 5;
                scoreTotal += diceCounts[4] * 5;
                topScore += diceCounts[4] * 5;
            }
            case 5 -> {
                roundScore = diceCounts[5] * 6;
                scoreTotal += diceCounts[5] * 6;
                topScore += diceCounts[5] * 6;
            }
            case 6 -> {
                if (canLow[0]) {
                    roundScore = diceTotal;
                    scoreTotal += diceTotal;
                }
            }
            case 7 -> {
                if (canLow[1]) {
                    roundScore = diceTotal;
                    scoreTotal += diceTotal;
                }
            }
            case 8 -> {
                if (canLow[2]) {
                    roundScore = 25;
                    scoreTotal += 25;
                }
            }
            case 9 -> {
                if (canLow[3]) {
                    roundScore = 30;
                    scoreTotal += 30;
                }
            }
            case 10 -> {
                if (canLow[4]) {
                    roundScore = 40;
                    scoreTotal += 40;
                }
            }
            case 11 -> {
                if (canLow[5]) {
                    roundScore = 50;
                    scoreTotal += 50;
                }
            }
            case 12 -> {
                roundScore = diceTotal;
                scoreTotal += diceTotal;
            }
            default -> {
            }

        }
        if (topScore >= 63 && bonus == false) {
            topScore += 35;
            scoreTotal += 35;
            bonus = !bonus;
        }
        CheckOrZero(tableSpot);
    }

    public void CheckOrZero(int tableSpot) {
        scores[tableSpot] = roundScore;
    }

    public int getScoreTable(int tableSpot) {
        tableSpot--;
        return scores[tableSpot];
    }

    public int getTopScore() {
        return topScore;
    }
        public boolean getBonus() {
        return bonus;
    }
        public int getScore(){
            return scoreTotal;
        }
        public String getName(){
            return name;
        }
}
