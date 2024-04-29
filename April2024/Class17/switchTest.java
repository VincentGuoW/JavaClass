package April2024.Class17;

import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please put number 1-7 in: ");
        int inputNumber = sc.nextInt();

        switch (inputNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wens");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Frid");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Wrong answer");
                break;
        }
    }
}
