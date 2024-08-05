package April2024.Class15;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("My number: ");
        int myNumber = sc.nextInt();
        while (myNumber>=10) {
            System.out.println("My number(under10): ");
            myNumber = sc.nextInt();
        }


        System.out.println("My date's number: ");
        int herNumber = sc.nextInt();

        boolean result;

        // if(myNumber>=herNumber){
        //     result = true;
        // }
        // else{
        //     result = false;
        // }

        result = myNumber>herNumber;
        //!!boolean straight use it, no need for extra if else.

        System.out.println(result);

    }
}
