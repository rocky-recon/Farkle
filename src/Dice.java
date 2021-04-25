public class Dice {
    private double diceNumber;
    private Integer [] diceValue;


    public Dice(double diceNumber, Integer[] diceValue) {
        this.diceNumber = diceNumber;
        this.diceValue = diceValue;
    }

    public double getDiceNumber() {
        return diceNumber;
    }

    public void setDiceNumber(double diceNumber) {
        this.diceNumber = diceNumber;
    }

    public Integer[] getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(Integer[] diceValue) {
        this.diceValue = diceValue;
    }

//    endTurn() return totalScore += turnScore; begin turn() for next player
}
