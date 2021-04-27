package com.farkle;

import java.util.ArrayList;
import java.util.HashSet;

public class Score {
    //variables/fields

    //diceValues [], ArrayList?
    public ArrayList<Integer> CurrentDiceValues= new ArrayList<>();
    public static int turnScore = 0;
    ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();


    Score(ArrayList<Integer> currentDiceValues, ArrayList<ArrayList<Integer>> PreviousDiceSets){
        this.CurrentDiceValues = currentDiceValues;
        this.PreviousDiceSets = PreviousDiceSets;

    }

//    Score(int[] currentDiceValues){
//        this.PreviousDiceSets = PreviousDiceSets;
//    }
    //getters and setters


    public ArrayList<Integer> getCurrentDiceValues() {
        return CurrentDiceValues;
    }

    public void setCurrentDiceValues(ArrayList<Integer> currentDiceValues) {
        this.CurrentDiceValues = currentDiceValues;
    }

    public int getTurnScore() {
        return turnScore;
    }

    public void setTurnScore(int turnScore) {
        this.turnScore = turnScore;
    }

    public ArrayList<ArrayList<Integer>> getPreviousDiceSets() {
        return PreviousDiceSets;
    }

    public void setPreviousDiceSets(ArrayList<ArrayList<Integer>> PreviousDiceSets) {
        this.PreviousDiceSets = PreviousDiceSets;
    }

    //methods

    //must add all arrayLists for a turn in order to properly calculate 1 and 2 dice Arraylists



    public int scoreCalculator(ArrayList<Integer> CurrentDiceValues, ArrayList<ArrayList<Integer>> PreviousDiceSets){
        //if receiving an Arraylist, break into separate arrays (?)
        HashSet<Integer> setForSix = new HashSet<Integer>();
        HashSet<Integer> setForFive = new HashSet<Integer>();

        if(CurrentDiceValues.size() == 1){
            //Array of One must be an Add On to a previous set of Three Dice, A One for 100, or a Five for 50.
            if(PreviousDiceSets.size()>0){
                for(ArrayList i: PreviousDiceSets){
                    if(i.size() == 3){
                        int j = (int) i.get(0);
                        if( j == CurrentDiceValues.get(0)){
                            if(CurrentDiceValues.get(0) == 1){
                                turnScore+= 300;
                            }else{
                                turnScore+= CurrentDiceValues.get(0)*100;
                            }
                        }else if(CurrentDiceValues.get(0)== 1){
                            turnScore+= 100;
                        }else if(CurrentDiceValues.get(0)== 5){
                            turnScore+= 50;
                        }
                    }else if(CurrentDiceValues.get(0)== 1){
                        turnScore+= 100;
                    }else if(CurrentDiceValues.get(0)== 5){
                        turnScore+= 50;
                    }else{
                        return 0;
                    }
                }
            }else if(CurrentDiceValues.get(0)== 1){
                turnScore+= 100;
            }else if(CurrentDiceValues.get(0)== 5){
                turnScore+= 50;
            }else{
                return 0;
            }


        }else if(CurrentDiceValues.size() == 2){
            //Array of Two must be an Add On to a previous set of Three Dice, or a combination of Ones and Fives.
            //Array of an add on and a One or Five do not score correctly.
            if(PreviousDiceSets.size()>0){
                for(ArrayList i: PreviousDiceSets) {
                    if (i.size() == 3) {
                        int j = (int) i.get(0);
                        if (j == CurrentDiceValues.get(0)) {
                            if (CurrentDiceValues.get(0) == 1) {
                                turnScore += 600;
                            } else {
                                turnScore += CurrentDiceValues.get(0) * 2 * 100;
                            }
                        }else{
                            for(Integer k:CurrentDiceValues){
                                if(k ==1){
                                    turnScore+=100;
                                }else if(k==5){
                                    turnScore+=50;
                                }
                            }
                        }
                    } else for(Integer y:CurrentDiceValues) {
                        if (y == 1) {
                            turnScore += 100;
                        } else if (y == 5) {
                            turnScore += 50;
                        }
                    }
//                else {
//                    return 0;
//                }
                }
            }else{
                for(Integer y:CurrentDiceValues) {
                    if (y == 1) {
                        turnScore += 100;
                    } else if (y == 5) {
                        turnScore += 50;
                    }
                }
            }



        }else if(CurrentDiceValues.size() == 3){
            //Accounting for 3 Additional dice to a set of 3? Would need to check previous Array, see if dice values
            //were equal.
            //need to account for Ones and Fives.
            if(CurrentDiceValues.get(0) == 1){
                turnScore+=300;
            }else{
                turnScore+= CurrentDiceValues.get(0)*100;
            }

        }else if(CurrentDiceValues.size() == 4){
            //four of a kind
            turnScore += 1000;

        }else if(CurrentDiceValues.size() == 5){
            setForFive.add(CurrentDiceValues.get(0));
            setForFive.add(CurrentDiceValues.get(1));
            setForFive.add(CurrentDiceValues.get(2));
            setForFive.add(CurrentDiceValues.get(3));
            setForFive.add(CurrentDiceValues.get(4));

            if(setForFive.size() == 1){
                //five of a kind
                turnScore+= 4000;
            }else{
                //if (setForFive.size() == 2)
                //Full house
                turnScore+= 1000;
            }


        }else if(CurrentDiceValues.size() == 6){
            //convert into hashset
            setForSix.add(CurrentDiceValues.get(0));
            setForSix.add(CurrentDiceValues.get(1));
            setForSix.add(CurrentDiceValues.get(2));
            setForSix.add(CurrentDiceValues.get(3));
            setForSix.add(CurrentDiceValues.get(4));
            setForSix.add(CurrentDiceValues.get(5));

            if(setForSix.size() == 1){
                //six of a kind
                turnScore+= 6000;
            }else if(setForSix.size() == 3){
                //three pair
                turnScore+= 1500;
            }else if(setForSix.size() == 6){
                //1-6 straight
                turnScore+= 3000;
            }else{
                //if(arrayOfSix.size() == 2)
                //two three-of-a-kind
                for(Integer i:setForSix){
                    turnScore += i*100;
                }
            }

        }
        return turnScore;
    }

}
