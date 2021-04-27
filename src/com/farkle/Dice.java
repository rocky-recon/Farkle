package com.farkle;

import java.util.ArrayList;
import java.util.HashMap;

public class Dice {
    ArrayList<Integer> currentDiceValues = new ArrayList<>();
    private int[] faceValue;

    public static ArrayList<Integer> diceFaceValue = new ArrayList<>();

    {
        boolean allDiceHaveValues = false;
        int die1;
        int die2;
        int die3;
        int die4;
        int die5;
        int die6;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        die3 = (int) (Math.random() * 6) + 1;
        die4 = (int) (Math.random() * 6) + 1;
        die5 = (int) (Math.random() * 6) + 1;
        die6 = (int) (Math.random() * 6) + 1;
        int[] faceValue = new int[]{die1, die2, die3, die4, die5, die6};
        if (allDiceHaveValues) {
            System.out.println("your dice values are " + faceValue);
        } else if (!allDiceHaveValues) {
            System.out.println("Please roll again");
        }
        ArrayList<Integer> diceFaceValue = new ArrayList<Integer>(faceValue.length);

    }


    public Dice(ArrayList<Integer> currentDiceValues, int[] faceValue) {
        this.currentDiceValues = diceFaceValue;
        this.faceValue = faceValue;
    }

    public ArrayList<Integer> getCurrentDiceValues() {
        return currentDiceValues;
    }

    public void setCurrentDiceValues(ArrayList<Integer> currentDiceValues) {
        currentDiceValues = diceFaceValue;
    }

    public int[] getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int[] faceValue) {
        this.faceValue = faceValue;
    }

    public static ArrayList<Integer> getDiceFaceValue() {
        return diceFaceValue;
    }

    public static void setDiceFaceValue(ArrayList<Integer> diceFaceValue) {
        Dice.diceFaceValue = diceFaceValue;
    }
}
