package April2024.Class16;

import java.util.Scanner;

public class twoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two digit numbers:");
        int input = sc.nextInt();
        System.out.println(input);
        boolean result = input%10==6 || input/10%10==6;
        System.out.println(result);
    }
}
