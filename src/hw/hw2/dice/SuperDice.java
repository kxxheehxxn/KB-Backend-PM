package hw.hw2.dice;

public class SuperDice extends Dice {
    int min;
    int max;

    public SuperDice(){
        min = 1;
        max = 10;
    }

    @Override
    public int getNumber() {
        int result = (int)(Math.random() * max) + min;
        return result;
    }
}
