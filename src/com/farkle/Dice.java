package com.farkle;

import java.util.ArrayList;
import java.util.HashMap;

public class Dice {
//    public static final Dice die = new Dice(MAX_NUMBER_SIDES);
//    private String type;
    private int faceValue;
    private boolean isSelected;


    public Dice() {
        int faceValue;
        boolean isSelected;
    }

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
        System.out.println("your dice values are " + faceValue);;
    }


//    public Dice (Integer faceValue, boolean isSelected){
//        this.faceValue = faceValue;
//        this.isSelected = isSelected;
//    }
//  Rolls dice
//     public Dice(Player player, ArrayList<Integer>diceFaceValue){
//         HashMap<Integer, ArrayList<Integer>> rollDice = new HashMap<>();
//         if (diceFaceValue.containsAll(diceFaceValue)){
//             System.out.println("Roll again");
//         }
//         else if (diceFaceValue.isEmpty()){
//             System.out.println("Farkle");
//         }return ;
//    }

    private void rollDice(Player player, ArrayList<Integer> diceFaceValue) {
    }


    public boolean isSelected() {

        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
    //    endTurn() return totalScore += turnScore; begin turn() for next player
////    public Dice(String type, Integer totalAmout, ArrayList<Integer> diceFaceValue){
////        this.type = type;
////        this.points = totalAmout;
////        this.diceFaceValue = diceFaceValue;
////    }
//
//}
////    ArrayList<Integer> timesRolled = new ArrayList<>();
////        for (int continueTurn = 0; continueTurn < timesRolled.; continueTurn++)
////            if (continueTurn = faceValue || allDiceHaveValue == true){
////        System.out.println("Your numbers are " + faceValue);
////
////    }
////        else if (continueTurn =  || allDiceHaveValue == true){
////        System.out.println("Farkle, Farkle, Farkle");
////    }