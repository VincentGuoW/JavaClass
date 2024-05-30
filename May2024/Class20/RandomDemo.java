package May2024.Class20;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(123));//46
        System.out.println(random.nextInt(123));//39
        System.out.println(random.nextInt(123));//72

        // this will get random at each time!
    }
}
