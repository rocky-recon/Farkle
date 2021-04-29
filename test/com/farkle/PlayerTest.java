package com.farkle;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

    public class PlayerTest {
        //    Establish total score to call it later.
        static int totalScore;
        //    Establish scoreToAdd to call it later.
        static int scoreToAdd;


        @Test
        public void oneDiceValueOfOne(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(1);
            Player.addToScore(CurrentDiceValues);
            int expectedValue = 100;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for one dice value of one is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void oneDiceValueOfFive(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(5);
            Player.addToScore(CurrentDiceValues);
            int expectedValue = 50;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for one dice value of one is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void threeOfOnes(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(1);
            CurrentDiceValues.add(1);
            CurrentDiceValues.add(1);
            int expectedValue = 1000;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for three one's is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void threeOfTwos(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(2);
            CurrentDiceValues.add(2);
            CurrentDiceValues.add(2);
            int expectedValue = 200;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for three two's is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void threeOfThrees(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(3);
            CurrentDiceValues.add(3);
            CurrentDiceValues.add(3);
            int expectedValue = 300;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for three three's is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void threeOfFours(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(4);
            CurrentDiceValues.add(4);
            CurrentDiceValues.add(4);
            scoreToAdd = totalScore;
            int expectedValue = 400;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for three four's is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void threeOfFives(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(5);
            CurrentDiceValues.add(5);
            CurrentDiceValues.add(5);
            int expectedValue = 500;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for three five's is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
        @Test
        public void threeOfSixes(){
            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
            CurrentDiceValues.add(6);
            CurrentDiceValues.add(6);
            CurrentDiceValues.add(6);
            int expectedValue = 600;
            int actualValue = Player.addToScore(CurrentDiceValues);
            System.out.println("Score for three sixes is: " + actualValue);
            assertEquals(expectedValue, actualValue, .0001);
        }
    }

