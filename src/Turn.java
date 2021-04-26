import java.util.ArrayList;

public class Turn<diceFaceValue> extends Dice {
    private int turnScore;
    private Turn (){

    }
//    This is to simulate rolling all 6 of dice rolling.
//    The number that comes up on each die is output,
//    followed by total of all dices
    public int turnScore() {
        System.out.println("Welcome to Farkle. Please roll the dice.");
        boolean continueTurn = true;
        boolean allDiceHaveValue = false;
        int die1;
        int die2;
        int die3;
        int die4;
        int die5;
        int die6;
        int turnScore = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        die3 = (int) (Math.random() * 6) + 1;
        die4 = (int) (Math.random() * 6) + 1;
        die5 = (int) (Math.random() * 6) + 1;
        die6 = (int) (Math.random() * 6) + 1;
        turnScore = die1 + die2 + die3 + die4 + die5 + die6;
        return turnScore;
    }
//    Start a turn
    ArrayList<diceFaceValue> startingTurn = new ArrayList<diceFaceValue>();{
    boolean initialRoll = true;
    int MAX_NUMBER = 6;
    int rollScore = diceFaceValue.size();
    if (!initialRoll){
                System.out.println("Your turn is about to begin");
        for (int initiateTurn = 0; initiateTurn < MAX_NUMBER; initiateTurn ++){
        int faceValue = diceFaceValue.get(initiateTurn);
//      need to add score into this section
        Integer turnScore = diceFaceValue.get(initiateTurn);

        System.out.println((rollScore + 1) + " . "  + faceValue + " " + turnScore + " points");
            }
        }
    }
//    Dice selection
//    public static ArrayList<Integer> rollDice (Player player, int rollScore){
//        ArrayList<Integer> diceRolled = rollDice(player, rollScore);
//        for (initialRoll = 0, initialRoll < rollScore, initialRoll ++){
//
//        }
//    }

//    endTurn
}
