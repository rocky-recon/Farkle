package com.farkle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        ArrayList<Integer> rollingDice = new ArrayList<>();
        Random die = new Random();
        int die1 = die.nextInt(6);
        int die2 = die.nextInt(6);
        int die3 = die.nextInt(6);
        int die4 = die.nextInt(6);
        int die5 = die.nextInt(6);
        int die6 = die.nextInt(6);

        RollingDice.add(die1);
        RollingDice.add(die2);
        RollingDice.add(die3);
        RollingDice.add(die4);
        RollingDice.add(die5);
        RollingDice.add(die5);
        System.out.println("Your dice values are " + rollingDice);
    }
}
