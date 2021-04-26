package com.farkle;

import java.util.ArrayList;
import java.util.HashSet;

public class Score {
    //variables/fields

    //diceValues [], ArrayList?
    public int[] CurrentDiceValues= {1, 1, 1, 1, 1, 1};
    public int turnScore = 0;
    ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();


    //getters and setters

    //methods

    //must add all arrayLists for a turn in order to properly calculate 1 and 2 dice Arraylists



    public int scoreCalculator(int[] CurrentDiceValues){
        //if receiving an Arraylist, break into separate arrays (?)
        HashSet<Integer> setForSix = new HashSet<Integer>();
        HashSet<Integer> setForFive = new HashSet<Integer>();

        if(CurrentDiceValues.length == 1){
            //Array of One must be an Add On to a previous set of Three Dice, A One for 100, or a Five for 50.
            if(PreviousDiceSets.size()>0){
                for(ArrayList i: PreviousDiceSets){
                    if(i.size() == 3){
                        int j = (int) i.get(0);
                        if( j == CurrentDiceValues[0]){
                            if(CurrentDiceValues[0] == 1){
                                turnScore+= 300;
                            }else{
                                turnScore+= CurrentDiceValues[0]*100;
                            }
                        }else if(CurrentDiceValues[0]== 1){
                            turnScore+= 100;
                        }else if(CurrentDiceValues[0]== 5){
                            turnScore+= 50;
                        }
                    }else if(CurrentDiceValues[0]== 1){
                        turnScore+= 100;
                    }else if(CurrentDiceValues[0]== 5){
                        turnScore+= 50;
                    }else{
                        return 0;
                    }
                }
            }else if(CurrentDiceValues[0]== 1){
                turnScore+= 100;
            }else if(CurrentDiceValues[0]== 5){
                turnScore+= 50;
            }else{
                return 0;
            }


        }else if(CurrentDiceValues.length == 2){
            //Array of Two must be an Add On to a previous set of Three Dice, or a combination of Ones and Fives.
            if(PreviousDiceSets.size()>0){
                for(ArrayList i: PreviousDiceSets) {
                    if (i.size() == 3) {
                        int j = (int) i.get(0);
                        if (j == CurrentDiceValues[0]) {
                            if (CurrentDiceValues[0] == 1) {
                                turnScore += 600;
                            } else {
                                turnScore += CurrentDiceValues[0] * 2 * 100;
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



        }else if(CurrentDiceValues.length == 3){
            //Accounting for 3 Additional dice to a set of 3? Would need to check previous Array, see if dice values
            //were equal.
            //need to account for Ones and Fives.
                if(CurrentDiceValues[0] == 1){
                    turnScore+=300;
                }else{
                    turnScore+= CurrentDiceValues[0]*100;
                }

            }else if(CurrentDiceValues.length == 4){
                //four of a kind
                turnScore += 1000;

            }else if(CurrentDiceValues.length == 5){
                setForFive.add(CurrentDiceValues[0]);
                setForFive.add(CurrentDiceValues[1]);
                setForFive.add(CurrentDiceValues[2]);
                setForFive.add(CurrentDiceValues[3]);
                setForFive.add(CurrentDiceValues[4]);

                if(setForFive.size() == 1){
                    //five of a kind
                    turnScore+= 4000;
                }else{
                    //if (setForFive.size() == 2)
                    //Full house
                    turnScore+= 1000;
                }


            }else if(CurrentDiceValues.length == 6){
                //convert into hashset
                setForSix.add(CurrentDiceValues[0]);
                setForSix.add(CurrentDiceValues[1]);
                setForSix.add(CurrentDiceValues[2]);
                setForSix.add(CurrentDiceValues[3]);
                setForSix.add(CurrentDiceValues[4]);
                setForSix.add(CurrentDiceValues[5]);

                if(setForSix.size() == 1){
                    //six of a kind
                    turnScore+= 6000;
                }else if(setForSix.size() == 3){
                    //three pair
                    turnScore+= 1500;
                }else if(setForSix.size() == 6){
                    //1-6 straight
                    turnScore+= 1500;
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
