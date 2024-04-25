
package April2024.Class12;

//Issue I faced the file name matched with Scanner, cus error.

import java.util.*;
//import java.util.Scanner;
   //Use * cus Scanner is part of the util

public class ScannerDemo {
   public static void main(String[] args) {
         
         try(Scanner sc = new Scanner(System.in)){
         /*
          Scanner       -->   imported from above java.util.* or java.util.Scanner
          System.in     -->   next input
          */

         System.out.println("Please put int number below:");
         
         String a = sc.next(); 
            // stop before the first space e.g. 12 14 15 it will take (12)only with no space after 12
         String b = sc.nextLine();
            // stop right after the return key. e.g. 12 14 15 when ever you click return key it will stop.

            //In this example, (12 14 15) then hit return key
            // a will be (12)
            // b will be ( 14 15)
         
         // int c = sc.nextInt();

         System.out.println("Your input integrial is:" + a);
         System.out.println("Your input integrial is:" + b);
         // System.out.println("Your input integrial is:" + c);
         }
   }
}
