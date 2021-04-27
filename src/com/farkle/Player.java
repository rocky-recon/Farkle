package com.farkle;

import java.util.Scanner;

public class Player {

    public static void main(String[] args) {
        startGame();
        turnPrintEvents();
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

    private static void turnPrintEvents(){
        System.out.println("Current Player: " /*+*/);
        System.out.println("Dice Roll: " /*+ diceFaceValue*/);
        int die;
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Dice 1-6: ");
            die = in.nextInt();
        }while(die != 0);
    }


    private static void endGame() {



    }

}




