package com.farkle;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    static private String playerOneName;
    static private String playerTwoName;
    static private int selectedScore;
    static int turnCount = 0;
    static int totalScore;
    static private int totalFarkleCount = 0;
    ArrayList<Integer> currentDiceValues = new ArrayList<>();
    ArrayList<Integer> rollingDice = new ArrayList<>(6);
    ArrayList<ArrayList<Integer>> previousDiceSets = new ArrayList<>();
    ArrayList<Integer> previousDiceSet1 = new ArrayList<>();
    ArrayList<Integer> previousDiceSet2 = new ArrayList<>();
    Score score = new Score(currentDiceValues, previousDiceSets);
    static int turnPrintEventScore = 0;

    public static void main(String[] args) {
        interact();
    }


    private static void interact(){
        //This is a placeholder ArrayList. Needs to be replaced with the Actual Random Dice ArrayList.

        ArrayList<ArrayList<Integer>> previousDiceSets = new ArrayList<>();
        ArrayList<Integer> currentDiceValues = new ArrayList<>();
        int turnCount = 0;
        int totalFarkleCount = 0;
        ArrayList<Integer> previousDiceSet1 = new ArrayList<>();
        ArrayList<Integer> previousDiceSet2 = new ArrayList<>();
        Score score = new Score(currentDiceValues, previousDiceSets);
        startGame();
        System.out.println(turnPrintEvents(score, rolledDice(), currentDiceValues, previousDiceSet1,
                previousDiceSet2, previousDiceSets, turnCount, totalFarkleCount, totalScore));
        //System.out.println("Turn Score: " + score.scoreCalculator(currentDiceValues, previousDiceSets));
        endGame();
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
        selectedScore = in.nextInt();
        if ( selectedScore == 1){
            int scoreChosen = 5000;
            System.out.println("You selected 5,000");
        } else if (selectedScore == 2){
            int scoreChosen = 10000;
            System.out.println("You selected 10,000");
        } else if (selectedScore == 3){
            int scoreChosen = 15000;
            System.out.println("You selected 15,000");
        }
}
    }
    private static ArrayList<Integer> rolledDice(){
        ArrayList<Integer> rollingDice = new ArrayList<>(6);
        rollingDice.add(1);
        rollingDice.add(1);
        rollingDice.add(1);
        rollingDice.add(4);
        rollingDice.add(5);
        rollingDice.add(6);
        return rollingDice;
    }

    private static int turnPrintEvents(Score score, ArrayList<Integer> rollingDice, ArrayList<Integer> currentDiceValues,
                                       ArrayList<Integer> previousDiceSet1, ArrayList<Integer> previousDiceSet2,
                                       ArrayList<ArrayList<Integer>> previousDiceSets, int turnCount, int totalFarkleCount, int totalScore){

        boolean noRepeat;
        do{
            Scanner rollIn = new Scanner(System.in);
            System.out.println("Roll the dice? Yes = 1, No = 2 : ");
            int r = rollIn.nextInt();
            noRepeat = true;
            if(r == 1){
                System.out.println("Current Player: " + playerOneName);
                System.out.println("Dice Roll: " + rollingDice);
                int die;
                do{
                    System.out.println("Input a Die you want to keep. To not take any Die, type 0.");
                    Scanner in = new Scanner(System.in);
                    System.out.print("Pick what dice number : ");
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
                int turnPrintEventScore = score.scoreCalculator(currentDiceValues, previousDiceSets);

                turnCount++;
                System.out.println("Turn Count is now: " + turnCount);

                if(turnCount == 1){
                    for(int i =0; i<currentDiceValues.size(); i++){
                        previousDiceSet1.add(currentDiceValues.get(i));
                        noRepeat = false;
                    }
                    currentDiceValues.clear();
                }else if(turnCount == 2){
                    for(int i =0; i<currentDiceValues.size(); i++){
                        previousDiceSet2.add(currentDiceValues.get(i));
                        noRepeat = false;
                    }
                    currentDiceValues.clear();
                }else if(turnCount == 3){
                    if(turnPrintEventScore == 0){
                        totalFarkleCount++;
                        System.out.println("You had 0 Points after three Rolls. You received a Farkle. Your Farkle count is now: " + totalFarkleCount);
                    }else if(rollingDice.size()==0){
                        turnCount = 0;
                        noRepeat = false;
                        //return to start of turnPrintEvents
                        //at start, empty all dice arraylists
                        //recreate Rolling dice
                    }else{
                        //System.out.println("Previous Dice set 1: " + previousDiceSet1);
                        //System.out.println("Previous Dice set 2: " + previousDiceSet2);
                        System.out.println("Current Dice set: " + currentDiceValues);
                        return turnPrintEventScore;
                    }
                }
                System.out.println("Previous Dice set 1: " + previousDiceSet1);
                System.out.println("Previous Dice set 2: " + previousDiceSet2);
                System.out.println("Current Dice set: " + currentDiceValues);
            }else{
                System.out.println("You have chosen not to roll again.");
                int turnPrintEventScore = score.scoreCalculator(currentDiceValues, previousDiceSets);
                System.out.print("Turned Ended. Turn points: " + String.valueOf(turnPrintEventScore));
            }






        }while(noRepeat == false);
        return turnPrintEventScore;
    }


    private static void endGame() {
        if (totalFarkleCount == 3) {
            System.out.println("You reached three Farkles. You lose.");
            Scanner in = new Scanner(System.in);
            System.out.print("Would you like to replay?: 1.Yes 2.No");
            int replay = in.nextInt();
            if (replay == 1) {
                interact();
            } else {
                System.out.println("Thank you for playing!");
            }
        }
    }




    }





