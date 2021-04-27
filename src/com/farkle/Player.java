package com.farkle;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {


    public static void main(String[] args) {
        ArrayList<Integer> RollingDice = new ArrayList<>(6);
        RollingDice.add(1);
        RollingDice.add(2);
        RollingDice.add(3);
        RollingDice.add(4);
        RollingDice.add(5);
        RollingDice.add(6);
        ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
        ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
        int turn = 1;
        ArrayList<Integer> previousDiceSet1 = new ArrayList<>();
        ArrayList<Integer> previousDiceSet2 = new ArrayList<>();
        startGame();
        turnPrintEvents( RollingDice, CurrentDiceValues, previousDiceSet1, previousDiceSet2, turn);
    }
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
        String name = in.nextLine();
        System.out.println("com.farkle.Player name is: " + name);
    }
    //if two player mode is selected this is called
    private static void twoPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first player's name: ");
        String name = in.nextLine();
        System.out.print("Enter second player's name: ");
        String nameTwo = in.nextLine();
        System.out.println("Players are : " + name + " and "+ nameTwo);
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

    private static void turnPrintEvents(ArrayList<Integer> RollingDice, ArrayList<Integer> CurrentDiceValues, ArrayList<Integer> previousDiceSet1, ArrayList<Integer> previousDiceSet2, int turn){

        System.out.println("Current Player: " /*+*/);
        System.out.println("Dice Roll: " /*+ diceFaceValue*/);
        int die;
        do{
            System.out.println("Input a Die you want to keep. To not take any Die, type 0.");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Dice 1-6: ");
            die = in.nextInt();
            for(int i = 0; i<RollingDice.size(); i++){
                int RollingIndex = RollingDice.get(i);
                if(die == RollingIndex){
                    CurrentDiceValues.add(RollingDice.get(i));
                    RollingDice.remove(i);
                    System.out.println(RollingDice);
                    System.out.println(CurrentDiceValues);
                }
            }
        }while(die != 0);
        //calculate score
        if(turn == 1){
            for(int i =0; i<CurrentDiceValues.size(); i++){
                previousDiceSet1.add(CurrentDiceValues.get(i));
            }
            CurrentDiceValues.clear();
        }else if(turn == 2){
            for(int i =0; i<CurrentDiceValues.size(); i++){
                previousDiceSet2.add(CurrentDiceValues.get(i));
            }
            CurrentDiceValues.clear();
        }
        System.out.println("Previous Dice set 1: " + previousDiceSet1);
        System.out.println("Previous Dice set 2: " + previousDiceSet2);
        System.out.println("Current Dice set: " + CurrentDiceValues);
    }


    private static void endGame() {



    }

}




