package April2024.Class16;

import java.util.Scanner;

public class threeGuyHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("guy 1 : ");
        int guy1 = sc.nextInt();
        System.out.println("guy 2 : ");
        int guy2 = sc.nextInt();
        System.out.println("guy 3 : ");
        int guy3 = sc.nextInt();
        
        int guyOneTwo = guy1>guy2 ? guy1:guy2;
        int result = guy3>guyOneTwo ? guy3:guyOneTwo;

        System.out.println("The highest height: " + result);
    }
}
