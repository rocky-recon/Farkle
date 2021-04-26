import java.util.ArrayList;
import java.util.HashSet;

public class Score {
    //variables/fields

    //diceValues [], ArrayList?
    int[] diceValues= {1, 1, 1, 1, 1, 1};
    int turnScore = 0;
    ArrayList<ArrayList<Integer>> diceSets = new ArrayList<>();


    //getters and setters

    //methods

    //must add all arrayLists for a turn in order to properly calculate 1 and 2 dice Arraylists



    public int scoreCalculator(int[] diceValues){
        //if receiving an Arraylist, break into separate arrays (?)
        HashSet<Integer> setForSix = new HashSet<Integer>();
        HashSet<Integer> setForFive = new HashSet<Integer>();

        if(diceValues.length == 1){
            //Array of One must be an Add On to a previous set of Three Dice.
            for(ArrayList i:diceSets){
                if(i.size() == 3){
                    int j = (int) i.get(0);
                    if( j == diceValues[0]){
                        if(diceValues[0] == 1){
                            turnScore+= 300;
                        }else{
                            turnScore+= diceValues[0]*100;
                        }
                    }
                }else{
                    return 0;
                }
            }

        }else if(diceValues.length == 2){
            //Array of Two must be an Add On to a previous set of Three Dice.
            for(ArrayList i:diceSets) {
                if (i.size() == 3) {
                    int j = (int) i.get(0);
                    if (j == diceValues[0]) {
                        if (diceValues[0] == 1) {
                            turnScore += 600;
                        } else {
                            turnScore += diceValues[0] * 2 * 100;
                        }
                    }
                } else {
                    return 0;
                }
            }

        }else if(diceValues.length == 3){
            //Accounting for 3 Additional dice to a set of 3? Would need to check previous Array, see if dice values
            //were equal.
                if(diceValues[0] == 1){
                    turnScore+=300;
                }else{
                    turnScore+= diceValues[0]*100;
                }

            }else if(diceValues.length == 4){
                //four of a kind
                turnScore += 1000;

            }else if(diceValues.length == 5){
                setForFive.add(diceValues[0]);
                setForFive.add(diceValues[1]);
                setForFive.add(diceValues[2]);
                setForFive.add(diceValues[3]);
                setForFive.add(diceValues[4]);

                if(setForFive.size() == 1){
                    //five of a kind
                    turnScore+= 4000;
                }else{
                    //if (setForFive.size() == 2)
                    //Full house
                    turnScore+= 1000;
                }


            }else if(diceValues.length == 6){
                //convert into hashset
                setForSix.add(diceValues[0]);
                setForSix.add(diceValues[1]);
                setForSix.add(diceValues[2]);
                setForSix.add(diceValues[3]);
                setForSix.add(diceValues[4]);
                setForSix.add(diceValues[5]);

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






        return 0;
    }
}
