package May2024.Class04;

import java.util.Scanner;

import April2024.Class17.doubleEqual;

public class test1 {
    public static void main(String[] args) {
        // busy session 5-10 => first class 90% business 85%
        // non busy 11-4 => first class 70% business 65%

        Scanner sc = new Scanner(System.in);
        System.out.println("Original Price:");
        double originalPrice = sc.nextDouble();
        System.out.println("Month:");
        int month = sc.nextInt();
        System.out.println("First Class or Business (F/B):");
        String flightClass = sc.next();


        double price = priceCalulater(originalPrice, month, flightClass);
        System.out.println("The discount price will be: " + price);

    }

    public static double priceCalulater(double originalPrice, int month, String flightClass) {
        double price = 0;
        if (flightClass.equals("F")) {
            price = price(originalPrice, month,90,85);
        } else if (flightClass.equals("B")) {
            price = price(originalPrice, month,70,65);
        } else {
            System.out.println("Wrong flight class input");
        }

        return price;
    }

    public static double price(double originalPrice, int month, int busyMonth, int otherMonth) {
        double price = 0;
        if (month >= 5 && month <= 10) {
            price = originalPrice * busyMonth / 100;
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            price = originalPrice * otherMonth / 100;
        } else {
            System.out.println("Wrong month input");
        }

        return price;
    }

  

    
}
