package April2024.Class16;

import java.util.Scanner;

public class twoTigerWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tiger 1 : ");
        int tigerWeight1 = sc.nextInt();
        System.out.println("Tiger 2 : ");
        int tigerWeight2 = sc.nextInt();
        int highestWeight = tigerWeight1>tigerWeight2 ? tigerWeight1:tigerWeight2;
        System.out.println("The highest weight between two tiger: " + highestWeight);
    }
}
