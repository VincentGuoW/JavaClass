package April2024.Class13;

import java.util.*;

public class leetCode9 {
    public static boolean isPalindrome(int x) {
        if (x < 0 || x%10==0) {
            System.out.println("something wrong");
            return false;
        }
        int half = 0;
        while (x > half) {
            half = (half*10)+x%10;
            x = x /10;
        }
        if(x==half || x == half/10){
            return true;
        }
        else{
            return false;
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number test for palindrome:");
        int inputNumber = sc.nextInt();
        boolean output = leetCode9.isPalindrome(inputNumber);
        System.out.println(output);
    }

}
