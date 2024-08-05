package April2024.Class13;

import java.util.*;
public class practice {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("input number plz");
            int number = sc.nextInt();
            int number1 = number % 10;
            int number2 = number/10 % 10;
            int number3 = number/100 % 10;
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);
            System.out.println(123/10);
            System.out.println(123/100);
        }
    }
    
}
