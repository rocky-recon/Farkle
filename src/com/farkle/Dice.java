package com.farkle;

import java.util.ArrayList;
import java.util.HashMap;

public class Dice {
//    public static final Dice die = new Dice(MAX_NUMBER_SIDES);
//    private String type;
    private int faceValue;

    public static ArrayList<Integer> diceFaceValue = new ArrayList<>();{
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
        faceValue = die1 + die2 + die3 + die4 + die5 + die6;
        if (allDiceHaveValues);
        System.out.println("your dice values are " + faceValue);
    }

    public Dice(int faceValue) {
        this.faceValue = faceValue;
    }
}
