package May2024.Class12;

import java.util.Scanner;

public class InputProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductInfo [] arr= new ProductInfo[3];
        
        System.out.println("Please input product info:");
        for (int i = 0; i < arr.length; i++) {
            ProductInfo productInfo = new ProductInfo();
            arr[i]=productInfo;
            System.out.println("Please input product ID:");
            int id = sc.nextInt();
            productInfo.setId(id); 
            System.out.println("Please input product NAME:");
            String name = sc.next();
            productInfo.setName(name); 
            System.out.println("Please input product PRICE:");
            int price = sc.nextInt();
            productInfo.setId(price); 
            System.out.println("Please input product STOCK:");
            int stock = sc.nextInt();
            productInfo.setId(stock); 
        }
       
       
    }
}
