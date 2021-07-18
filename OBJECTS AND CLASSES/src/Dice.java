import java.util.Random;

public class Dice {
    private int sides;

    public Dice() {}

    public Dice(int number) {
        this.sides = number;
    }

    public int getSides() {
        return this.sides;
    }

    public void setSides(int number) {
        this.sides = number;
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(this.sides) + 1;
    }
}
