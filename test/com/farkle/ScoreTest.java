package com.farkle;

import org.junit.Test;

public class ScoreTest {
    //  @Test
//        public void scoreCalculatorSixOfAKind() {
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 6000;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Six of a Kind is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorThreePair(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(3);
//            CurrentDiceValues.add(3);
//            CurrentDiceValues.add(6);
//            CurrentDiceValues.add(6);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 1500;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Three Pair is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorStraight(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(2);
//            CurrentDiceValues.add(3);
//            CurrentDiceValues.add(6);
//            CurrentDiceValues.add(4);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 3000;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Straight 1 through 6 is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorTwoThreeOfAKind(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(2);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(2);
//            CurrentDiceValues.add(2);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 700;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for two Three-of-a-kinds is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorFiveOfAKind(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 4000;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Five of a kind is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorFullHouse(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(2);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(2);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 1000;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Full House is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorFourOfAKind(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 1000;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Five of a kind is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorThreeOfAKind(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(3);
//            CurrentDiceValues.add(3);
//            CurrentDiceValues.add(3);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 300;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Three of a kind is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorThreeOnes(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            CurrentDiceValues.add(1);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 300;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Five of a kind is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorExtraOnes(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> set1 = new ArrayList<>(3);
//            set1.add(1);
//            set1.add(1);
//            set1.add(1);
//            PreviousDiceSets.add(set1);
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(1);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 300;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for Extra One is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorOneOne(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(1);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 100;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for One is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
//
//        @Test
//        public void scoreCalculatorTwoExtra(){
//            int turnScore = 0;
//            ArrayList<ArrayList<Integer>> PreviousDiceSets = new ArrayList<>();
//            ArrayList<Integer> set1 = new ArrayList<>(3);
//            set1.add(5);
//            set1.add(5);
//            set1.add(5);
//            PreviousDiceSets.add(set1);
//            ArrayList<Integer> CurrentDiceValues = new ArrayList<>();
//            CurrentDiceValues.add(5);
//            CurrentDiceValues.add(5);
//            Score run = new Score(CurrentDiceValues, PreviousDiceSets);
//            int expectedValue = 1000;
//            int actualValue = run.scoreCalculator(CurrentDiceValues, PreviousDiceSets);
//            System.out.println("Score for 500 plus two extra Fives is: " + actualValue);
//            assertEquals(expectedValue, actualValue, .0001);
//        }
}
