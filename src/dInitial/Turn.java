package dInitial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turn {
    private int turnScore;
    private Turn (){

    }
//    This is to simulate rolling all 6 of dice rolling.
//    The number that comes up on each die is output,
//    followed by total of all dices
    public void startingTurn() {
        System.out.println("Welcome to Farkle. Please roll the dice.");
        boolean continueTurn = true;
        boolean allDiceHaveValue = false;
        int die1;
        int die2;
        int die3;
        int die4;
        int die5;
        int die6;
        int rollScore;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        die3 = (int) (Math.random() * 6) + 1;
        die4 = (int) (Math.random() * 6) + 1;
        die5 = (int) (Math.random() * 6) + 1;
        die6 = (int) (Math.random() * 6) + 1;
        roll = new int[]{die1 + die2 + die3 + die4 + die5 + die6};
    }




//    Dice selection


//    endTurn
}
