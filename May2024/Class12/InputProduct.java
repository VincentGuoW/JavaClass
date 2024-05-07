package May2024.Class12;

import java.util.Scanner;

public class InputProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] productArray= {"id","name","price","stock"};
        
        System.out.println("Please input product info:");
        boolean finish=false;
        int productCount=1;
        while(!finish){
            ProductInfo productInfo = new ProductInfo();
            System.out.println("Please input product ID:");
            int id = sc.nextInt();
            productInfo.setId(id); 
            System.out.println("Please input product NAME:");
            String name = sc.next();
            productInfo.setId(id); 
            System.out.println("Please input product PRICE:");
            int price = sc.nextInt();
            productInfo.setId(price); 
            System.out.println("Please input product STOCK:");
            int stock = sc.nextInt();
            productInfo.setId(stock); 
            System.out.println("Done?:");
            if(sc.next()=="NO"||sc.next()=="no"){
                productCount++;
            }else{
                finish=true;
            }
        };
        System.out.println("You insert "+productCount+" products" );
        for (int i = 0; i < productCount; i++) {
            System.out.println();
            System.out.print(productInfo.getName);
        }
       
    }
}
