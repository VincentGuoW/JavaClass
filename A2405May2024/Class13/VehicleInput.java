package May2024.Class13;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Please input your vehicle information below: ");
        boolean moreVehicle = true;
        int inputVehicleAmount = 0;
        ArrayList<VehicleInfo> vehicleArrayList = new ArrayList<>();
        while(moreVehicle){
            VehicleInfo vInfo = new VehicleInfo();
            System.out.println("Vehicle brand: ");
            vInfo.setBrand(sc.next());

            System.out.println("Vehicle price: ");
            vInfo.setPrice(sc.nextDouble());

            System.out.println("Vehicle color: ");
            vInfo.setColor(sc.next());
            //vehicleArray[1][inputVehicleAmount]=vInfo;
            vehicleArrayList.add(vInfo);
            inputVehicleAmount++;

            System.out.println("Is that all? ");
            String input = sc.next();
            if(input.equalsIgnoreCase("YES")|| input.equalsIgnoreCase("Y")){
                moreVehicle=false;
            }
            
        }
        System.out.println("You have inputted "+ inputVehicleAmount
                        +" vehicles; And here's vehicle detials: ");
        for (VehicleInfo i : vehicleArrayList) {
            int j=1;
            System.out.println();
            System.out.println("Vehicle Input "+j+" :");
            System.out.print("Vehicle Brand : "+i.getBrand()+" || ");
            System.out.print("Vehicle Price : $"+i.getPrice()+" || ");
            System.out.print("Vehicle Color : "+i.getColor());
            System.out.println();
            System.out.println("=================");

        }
        System.out.println("Done");
    }
}
