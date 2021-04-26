import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private static final int MAX_NUMBER_SIDES = 6;
    public static final Dice die = new Dice(MAX_NUMBER_SIDES);
    private String type;
    private Integer points;
    public ArrayList<Integer> diceFaceValue;
    private Integer faceValue;
    private SecureRandom dieSR = new SecureRandom();
    private boolean isSelected;


    public Dice() {
        int faceValue;
        boolean isSelected;
    }

    public Dice (Integer faceValue, boolean isSelected){
        this.faceValue = faceValue;
        this.isSelected = isSelected;
    }

    public Dice(int maxNumberSides) {
    }

    public Integer rollDice () {
       Integer randomInteger = 1 + dieSR.nextInt(faceValue);
       return randomInteger;
    }

    public Integer getFaceValue() {
        return faceValue;
    }

     public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
    //    endTurn() return totalScore += turnScore; begin turn() for next player
    public Dice(String type, Integer totalAmout, ArrayList<Integer> diceFaceValue){
        this.type = type;
        this.points = totalAmout;
        this.diceFaceValue = diceFaceValue;
    }

}
