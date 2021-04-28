package com.farkle;

import java.util.ArrayList;
import java.util.Random;

public class Turn {

    public static void main(String[] args) {
        ArrayList<Integer> rollingDice = new ArrayList<>();
        Random die = new Random();
        int die1 = die.nextInt(6);
        int die2 = die.nextInt(6);
        int die3 = die.nextInt(6);
        int die4 = die.nextInt(6);
        int die5 = die.nextInt(6);
        int die6 = die.nextInt(6);

        rollingDice.add(die1);
        rollingDice.add(die2);
        rollingDice.add(die3);
        rollingDice.add(die4);
        rollingDice.add(die5);
        rollingDice.add(die5);


        ArrayList<Integer> turn = new ArrayList<>();
    int MAX_ROLLS = 3;
    boolean hasRoll = false;
    for (int roll = 0; roll < MAX_ROLLS; roll++){
          if(hasRoll = false)
        System.out.println("Your Turn has ended. Please roll again " + roll);
        else
            System.out.println("Please roll again " + roll + rollingDice);}

    }
        }

