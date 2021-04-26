import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private String type;
    private Integer points;
    private ArrayList<Integer> scoreVariant;
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

    public void rollDice () {
       Integer randomInteger = 1 + dieSR.nextInt(faceValue);
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
    public Dice(String type, Integer totalAmout, ArrayList<Integer> scoreVariant){
        this.type = type;
        this.points = totalAmout;
        this.scoreVariant = scoreVariant;
    }

}
