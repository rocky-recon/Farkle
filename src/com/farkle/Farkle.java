package com.farkle;

import java.util.HashMap;
import java.util.Map;

public class Farkle {
    public static void main(String[] args) {
        int totalScore;
        boolean farkle;
        int totalFarkleCount;
        int rollsLeft;
        String playerName;
        Map<String, Integer> diceHeldPerTurn = new HashMap<String, Integer>();
        {
            diceHeldPerTurn.put("Die One", 1);
            diceHeldPerTurn.put("Die Two", 2);
            diceHeldPerTurn.put("Die Three", 3);
            diceHeldPerTurn.put("Die Four", 4);
            diceHeldPerTurn.put("Die Five", 5);
            diceHeldPerTurn.put("Die Six", 6);
            System.out.println(diceHeldPerTurn);

        }



    }
}
