package May2024.Class20;

import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    // random print info

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your strings:");
        String input = sc.nextLine();
        System.out.println("The mixed result is : " + randomInputString(input));

    }

    public static String randomInputString(String input) {
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(arr.length);
            char temp = arr[randomNumber];
            arr[randomNumber] = arr[i];
            arr[i] = temp;
        }
        // String result = "";
        // for (int i = 0; i < arr.length; i++) {
        //     result = result + arr[i];
        // }
        String result = new String(arr);
        return result;
    }
}
