package com.farkle;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player {
    static private String playerOneName;
    static private String playerTwoName;
    public static void main(String[] args) {
        //This is a placeholder ArrayList. Needs to be replaced with the Actual Random Dice ArrayList.
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
//        System.out.println("Your dice values are " + rollingDice);

        ArrayList<ArrayList<Integer>> previousDiceSets = new ArrayList<>();
        ArrayList<Integer> currentDiceValues = new ArrayList<>();
        int [] turn = {1, 2, 3};
        ArrayList<Integer> previousDiceSet1 = new ArrayList<>();
        ArrayList<Integer> previousDiceSet2 = new ArrayList<>();
        startGame();
        turnPrintEvents( rollingDice, currentDiceValues, previousDiceSet1, previousDiceSet2, turn);
        System.out.println("Turn Score: " + Score.turnScore);}
    // this is called to have player enter game type, name, and score.
    private static void startGame() {
       Scanner in = new Scanner(System.in);
        System.out.print("Select game type: 1: One player 2: Two players 3: Survival mode");
        int gameType = in.nextInt();
        if ( gameType == 1){
            System.out.println("Game type is One com.farkle.Player");
            onePlayer();
            maxScore();
        } else if (gameType == 2){
            System.out.println("Game type is Two Players");
            twoPlayers();
            maxScore();
        } else if (gameType == 3){
            System.out.println("Game type is Survival mode");
            onePlayer();
            System.out.println("In survival mode you play until you get three Farkles");
        }
    }

    // if one player mode or survival is selected this is called
    private static void onePlayer() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        playerOneName = in.nextLine();
        System.out.println("Player name is: " + playerOneName);
    }

    //if two player mode is selected this is called
    private static void twoPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first player's name: ");
        playerOneName = in.nextLine();
        System.out.print("Enter second player's name: ");
        playerTwoName = in.nextLine();
        System.out.println("Players are : " + playerOneName + " and " + playerTwoName);
    }
    // player or players select score they must reach in order to win, survival mode has no score to reach in order to win.
    private static void maxScore() {
        Scanner in = new Scanner(System.in);
        System.out.print("Select points need to win: 1: 5,000 2: 10,000 3: 15,000");
        int score = in.nextInt();
        if ( score == 1){
            System.out.println("You selected 5,000");

        } else if (score == 2){
            System.out.println("You selected 10,000");
        } else if (score == 3){
            System.out.println("You selected 15,000");
        }
    }

    private static void turnPrintEvents(ArrayList<Integer> rollingDice, ArrayList<Integer> currentDiceValues,
                                        ArrayList<Integer> previousDiceSet1, ArrayList<Integer> previousDiceSet2,
                                       int [] turn){

        System.out.println("Current Player: " + playerOneName);
        System.out.println("Dice Roll: " + rollingDice);
        int die;
        do{
            System.out.println("Input a Die you want to keep. To not take any Die, type 0.");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Dice 1-6: ");
            die = in.nextInt();
            for(int i = 0; i<rollingDice.size(); i++){
                int RollingIndex = rollingDice.get(i);
                if(die == RollingIndex){
                    currentDiceValues.add(rollingDice.get(i));
                    rollingDice.remove(i);
                    System.out.println("Rolling Dice: " + rollingDice);
                    System.out.println("Current chosen Dice: " + currentDiceValues);
                }
            }
        }while(die != 0);
        //calculate score
        //System.out.println(Score.turnScore);
        if(turn.length == 1){
            for(int i =0; i<currentDiceValues.size(); i++){
                previousDiceSet1.add(currentDiceValues.get(i));
            }
            currentDiceValues.clear();
        }else if(turn.length == 2){
            for(int i =0; i<currentDiceValues.size(); i++){
                previousDiceSet2.add(currentDiceValues.get(i));
            }
            currentDiceValues.clear();
        }
        System.out.println("Previous Dice set 1: " + previousDiceSet1);
        System.out.println("Previous Dice set 2: " + previousDiceSet2);
        System.out.println("Current Dice set: " + currentDiceValues);
    }


    private static void endGame() {



    }

}
