package May2024.Class14;

import java.util.ArrayList;
import java.util.Scanner;

import April2024.Class17.doubleEqual;

public class PhoneAvgPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhoneInfo> phoneArrayList = new ArrayList<>();
        boolean finish=false;
        int phoneAmount=0;
        while (!finish) {
            PhoneInfo pInfo = new PhoneInfo();
            System.out.println("Brand?");
            pInfo.setBrand(sc.next());
            System.out.println("Price?");
            pInfo.setPrice(sc.nextDouble());
            System.out.println("Color?");
            pInfo.setColor(sc.next());
            phoneArrayList.add(pInfo);
            phoneAmount++;
            System.out.println("Finished?");
            String finishSentence = sc.next();
            if(finishSentence.equals("YES")||finishSentence.equals("Y")){
                finish=true;
            }
        }
        double totalPrice = 0;
        for (PhoneInfo i : phoneArrayList) {
            totalPrice+=i.getPrice();
        }
        double avePrice = totalPrice/phoneAmount;
        System.out.println();
        System.out.println("You input total "+phoneAmount+" phones, avg price is "+avePrice+".");
    }
}
