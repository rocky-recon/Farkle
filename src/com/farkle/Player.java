package com.farkle;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player {
//    Establish player so user can input name.
    static private String playerOneName;
//    Establish turn count in order to call it later.
    static int turnCount = 0;
//    Establish total score to call it later.
    static int totalScore;
//    Establish scoreToAdd to call it later.
    static int scoreToAdd;
//    Establish totalFarkleCount to call it later.
    static private int totalFarkleCount = 0;
//    Establish  turnPrintEventScore.
    static int turnPrintEventScore = 0;

 // To compile: javac Player.java
 // To run:     java Player.java

//  This will allow us to run Farkle. The interact method calls Arrays.
    public static void main(String[] args) {
        interact();
    }

    private static void interact(){

//         Variables.
        int turnCount = 0;
        int totalFarkleCount = 0;

//         Arrays.
        ArrayList<ArrayList<Integer>> previousDiceSets = new ArrayList<>();
        ArrayList<Integer> currentDiceValues = new ArrayList<>();
        ArrayList<Integer> previousDiceSet1 = new ArrayList<>();
        ArrayList<Integer> previousDiceSet2 = new ArrayList<>();

//         User Input: name.
        Scanner in = new Scanner(System.in);
        System.out.print("[  DEBUG ]: Enter your name: ");
        playerOneName = in.nextLine();
        System.out.println("[  DEBUG ]: Player name is: " + playerOneName);

//         User Input: score.
        Scanner user_score = new Scanner(System.in);
        System.out.print("[  DEBUG ]: Choose the score to try for: ");
        int chosenScore = user_score.nextInt();
        System.out.println("[  DEBUG ]: You chose: " + chosenScore);

//         Call the turnPrintEvents method.
        System.out.println(turnPrintEvents(
                currentDiceValues,
                previousDiceSet1,
                previousDiceSet2,
                previousDiceSets,
                turnCount,
                totalFarkleCount,
                totalScore,
                chosenScore));

//         End the game.
        endGame();

    }

//    Initiate rollTheDice Array for random numbers.
    private static ArrayList<Integer> rollTheDice(){

        ArrayList<Integer> rollingDice = new ArrayList<>();
        Random die = new Random();
        int die1 = die.nextInt(6)+1;
        int die2 = die.nextInt(6)+1;
        int die3 = die.nextInt(6)+1;
        int die4 = die.nextInt(6)+1;
        int die5 = die.nextInt(6)+1;
        int die6 = die.nextInt(6)+1;

        rollingDice.add(die1);
        rollingDice.add(die2);
        rollingDice.add(die3);
        rollingDice.add(die4);
        rollingDice.add(die5);
        rollingDice.add(die6);

        return rollingDice;
    }
//      turnPrintMethod calls all arrays in order to make the user take Turns, Collect Dice, and calculate Score's.
    private static int turnPrintEvents(
            ArrayList<Integer> currentDiceValues,
            ArrayList<Integer> previousDiceSet1,
            ArrayList<Integer> previousDiceSet2,
            ArrayList<ArrayList<Integer>> previousDiceSets,
            int turnCount,
            int totalFarkleCount,
            int totalScore,
            int chosenScore) {

//         Set noRepeat
        boolean noRepeat = false;

        do {

//             Initialize 'die'.
            Random die = new Random();

//             Get user input.
            Scanner userResponse = new Scanner(System.in);
            System.out.println("Roll the dice? Yes = 1, No = 2 : ");
            int response = userResponse.nextInt();

//             Check 'response'.
            if (response == 1) {

//                 Roll the dice.
                ArrayList<Integer> rollingDice = rollTheDice();
                System.out.println("Dice array rolled: " + rollingDice);

//                 Initialize 'dice'.
                int dice;

                do {

//                     Get user input.
                    System.out.println("Input a Die you want to keep. To not take any Die, type 0.");
                    Scanner in = new Scanner(System.in);

//                     Get user input.
                    System.out.print(  "Pick what dice number to add to our score: ");
                    dice = in.nextInt();
                    System.out.println("UserInput( 'dice' ): " + dice);

//                     Inspect the rollingDice array.
                    for (int i = 0; i < rollingDice.size(); i++) {
                        int RollingIndex = rollingDice.get(i);

                        if(dice == RollingIndex) {
//                             Set currentDiceValues.
                            currentDiceValues.add(rollingDice.get(i));
                        }
                    }

//                     Add score.
                    totalScore += addToScore(currentDiceValues);
                    System.out.println("Total Score: " + totalScore);
                    System.out.println("Chosen Score: " + chosenScore);
                    dice = 0;
                }

                while(dice != 0);

//                 Turn Count logic.
                turnCount++;

//                 TurnCount statement.
                System.out.println("Roll Count is now: " + turnCount);
//                  If loop for all 3 turns
                if(turnCount == 1) {
                    checkHighScore(totalScore, chosenScore);

                    for (int i = 0; i < currentDiceValues.size(); i++){
                        boolean add = previousDiceSet1.add(currentDiceValues.get(i));
                        noRepeat = false;
                    }
                    currentDiceValues.clear();

                } else if (turnCount == 2) {
                    checkHighScore(totalScore, chosenScore);

                    for (int i = 0; i < currentDiceValues.size(); i++){
                        previousDiceSet2.add(currentDiceValues.get(i));
                        noRepeat = false;
                    }
                    currentDiceValues.clear();

                } else if(turnCount == 3) {
                    checkHighScore(totalScore, chosenScore);

                    if (turnPrintEventScore == 0) {
                        totalFarkleCount++;
                        System.out.println("You have " + totalScore + " points after three Rolls. You received a Farkle. Your Farkle count is now: " + totalFarkleCount);
                        turnCount = 0;
                    } else if (rollingDice.size()==0) {
                        turnCount = 0;
                        noRepeat = false;
                    } else {
                        System.out.println("Current Dice set: " + currentDiceValues);
                        System.out.println("You had a score, but no rolls left. start a new turn. Turn score is set to 0.");
                        noRepeat = false;
                        turnPrintEventScore = 0;
                    }
                }

//                 Print out diceSets
                System.out.println("Dice Roll 1: " + previousDiceSet1);
                System.out.println("Dice Roll 2: " + previousDiceSet2);
                System.out.println("Dice Roll 3: " + currentDiceValues);

            } else {
//                 If the user gives up.
                System.out.println("You have chosen not to roll again.");
                System.out.println("Turned Ended. Turn points: " + String.valueOf(turnPrintEventScore));
            }

//             Print out totalFarkleCount
            System.out.println("Total Farkle Count: " + totalFarkleCount);
//             Check for three Farkles.
            if (totalFarkleCount == 3) {
                endGame();
            }

        } while(noRepeat == false);

        return turnPrintEventScore;
    }
//          Check if totalScore equals chosenScore
    private static void checkHighScore(int totalScore, int chosenScore) {
        if (totalScore == chosenScore) {
            winGame();
        }
    }
//          Add scores
    private static Integer addToScore(ArrayList<Integer> currentDiceValues) {
        for (int i = 0; i < currentDiceValues.size(); i++) {
            if (currentDiceValues.size() == 1) {

//                 1: 100 points
                if (currentDiceValues.get(0) == 1) {
                    scoreToAdd = 100;
                    break;
                }

//                 5: 50 points
                else if (currentDiceValues.get(0) == 5) {
                    scoreToAdd = 50;
                    break;
                }
            }

            else if (currentDiceValues.size() == 3){
//                 Three 1's: 1,000 points
                if (currentDiceValues.get(0) == 1) {
                    scoreToAdd = 1000;
                    break;
                }

//                 Three 2's: 200 points
                if (currentDiceValues.get(0) == 2) {
                    scoreToAdd = 200;
                    break;
                }

//                 Three 3's: 300 points
                if (currentDiceValues.get(0) == 3) {
                    scoreToAdd = 300;
                    break;
                }

//                 Three 4's: 400 points
                if (currentDiceValues.get(0) == 4) {
                    scoreToAdd = 400;
                    break;
                }

//                 Three 5's: 500 points
                if (currentDiceValues.get(0) == 5) {
                    scoreToAdd = 500;
                    break;
                }

//                 Three 6's: 600 points
                if (currentDiceValues.get(0) == 6) {
                    scoreToAdd = 600;
                    break;
                }
//                             1-2-3-4-5-6: 3000 points
                else if (currentDiceValues.get(0).equals(rollTheDice().get(0))){
                    scoreToAdd = 3000;
                }
            }

////             3 Pairs: 1500 points (including 4-of-a-kind and a pair)
//            else (currentDiceValues.get(0) == )
        }
        return scoreToAdd;
    }
//          Establish how to win game.
    private static void winGame() {
        System.out.println("[  DEBUG ]: Congratulations! You win!");
        System.out.println("[  DEBUG ]: Thank you for playing!");
        System.exit(0);
    }
//          Establish how to end game.
    private static void endGame() {
        System.out.println("[  DEBUG ]: You reached three Farkles. You lose.");
        System.out.println("[  DEBUG ]: Thank you for playing!");
        System.exit(1);
    }

}
