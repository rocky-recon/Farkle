package com.farkle;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Turn extends Dice {

    public Turn(int faceValue) {
        super(faceValue);
    }

    //    Roll Dice
    public static ArrayList<Integer> rollDice(Player player, int faceValue) {
        int MAX_ROLLS = 3;
        ArrayList<Integer> diceRoll = new ArrayList<Integer>();
        for (int roll = 0; roll < MAX_ROLLS; roll++)
            diceFaceValue.size();
        return diceRoll;
    }

    //    validating roll
    public static void validatingEachRoll(Player player, int faceValue) {
        ArrayList<Integer> diceRoll = rollDice(player, faceValue);
        validatingEachRoll(player, faceValue);
    }

    //    Roll again
    public static void reRoll(Player player) {
        int turnScore;
        int MAX_NUM_DICES = 6;
        for (int rollingDice = 0; rollingDice < MAX_NUM_DICES; rollingDice++) {
            diceFaceValue.size();
        }
        if (MAX_NUM_DICES > 0) {
            diceFaceValue.size();
        } else if (MAX_NUM_DICES < 0) {
            turnScore = scoreCalculater.values;
        }
    }
}
