package SyntaxBasics;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int dice = random.nextInt(1, 7);
        double number = random.nextDouble();
        boolean bool = random.nextBoolean();

        System.out.println(dice);
        System.out.println(number);

        if (bool) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
