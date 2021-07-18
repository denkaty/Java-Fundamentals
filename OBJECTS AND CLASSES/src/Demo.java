public class Demo {

    public static void main(String[] args) {
        Dice dice = new Dice(20);
        Dice d2 = new Dice();

        System.out.println(dice.roll());

        System.out.println(dice.getSides());   //prints 0

        dice.setSides(6);                      //sides are 6
        System.out.println(dice.getSides());   //prints 6

        d2.setSides(15);                       //sides are 15
        System.out.println(d2.getSides());     //prints 15

        System.out.println(dice.roll());       //prints random
        System.out.println(d2.roll());         //prints random
    }
}

