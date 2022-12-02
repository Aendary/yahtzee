public class Dice
{
    public int value; 

    Dice die1;
    Dice die2;
    Dice die3;
    Dice die4;
    Dice die5;
    Dice die6;
    public Dice() {
        die1 = new Dice();
        die2 = new Dice();
        die3 = new Dice();
        die4 = new Dice();
        die5 = new Dice();
        die6 = new Dice();
    }  
    public int[] arr = new int[6];
    public void roll() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 6) + 1;
        }   
    }   

    public void rollDieNumber(int dieNumber) {
        arr[dieNumber - 1] = (int)(Math.random() * 6) + 1;
    }
}