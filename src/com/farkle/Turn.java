package com.farkle;

import java.util.ArrayList;

public class Turn<diceFaceValue> extends Dice {
    private int turnScore;
    private Turn (){

    }

//    Start a turn
    public ArrayList<diceFaceValue> startingTurn = new ArrayList<diceFaceValue>();{
    boolean initialRoll = true;
    int MAX_NUMBER = 6;
    int rollScore = Dice.diceFaceValue.size();
    if (!initialRoll){
                System.out.println("Your turn is about to begin");
        for (int initiateTurn = 0; initiateTurn < MAX_NUMBER; initiateTurn ++){
        int faceValue = Dice.diceFaceValue.get(initiateTurn);
//      need to add score into this section
        Integer turnScore = Dice.diceFaceValue.get(initiateTurn);

        System.out.println((rollScore + 1) + " . "  + faceValue + " " + turnScore + " points");
            }
        }
//    }
////    Roll Dice
//    public static ArrayList <Integer> rollDice
////    Dice selection
////    public static ArrayList<Integer> rollDice (Player player, int rollScore){
////        ArrayList<Integer> diceRolled = rollDice(player, rollScore);
////        for (initialRoll = 0, initialRoll < rollScore, initialRoll ++){
////
////        }
////    }
//
////    endTurn
//
}
