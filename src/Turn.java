import java.util.HashMap;
import java.util.Map;

public class Turn {
    private int turnScore;
    private Turn (){

    }

    public static void main(String[] args) {
        Map<Integer, Integer> diceNumberSelection = new HashMap<Integer, Integer>();
//        Iterating over key only
        for (Integer key : diceNumberSelection.keySet()){
            System.out.println("Dice number = " + key);
        }
//        Iterating over values only
        for (Integer value : diceNumberSelection.values()){
            System.out.println("Dice value = " + value);
        }
    }

//    Dice selection


//    endTurn
}
