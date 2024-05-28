package May2024.Class20;

import java.util.Scanner;
import java.util.StringJoiner;

public class RomanNumberDemo {
    /*
     * 1 I
     * 2 II
     * 3 III
     * 4 IV
     * 5 V
     * 6 VI
     * 7 VII
     * 8 VIII
     * 9 IX
     * 0 " "
     */
    public static void main(String[] args) {
        while(true){
        System.out.println("Please put number in less than 9 digits");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (inputNumberOnly(input) && input.length() <= 9) {
            System.out.println(romanNumberFunction(input));
            break;
        }
        else{
            System.out.println("Please retry your number.");
        }
        }
        

    }

    public static boolean inputNumberOnly(String input) {
        boolean result = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    public static String romanNumberFunction(String input){
        String [] arr = {" ","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringJoiner sj = new StringJoiner("-","[","]");
        for (int i = 0; i < input.length(); i++) {
            sj.add(arr[input.charAt(i)-48]);
        }
        return sj.toString();
    }


    public static boolean checkStr(String str){
        //better way, different return. All wrong options return false;
        //if no catch wrong options, return true.
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c  = str.charAt(i);
            if(c<'0'&&c>'9'){
                return false;
            }
        }
        return true;
    }
}
