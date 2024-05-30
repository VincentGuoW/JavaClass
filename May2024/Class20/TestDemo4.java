package May2024.Class20;

import java.util.Scanner;

public class TestDemo4 {
    //String sentence  only record the last string and get the length.
    //Only vocabulary and space.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:  ");
        String input = sc.nextLine();
        StringBuilder sbTemp = new StringBuilder();
        char[] inputCharArr = input.toCharArray();

        for (int i = inputCharArr.length-1; i >=0; i--) {
            
            if(inputCharArr[i]==32 && sbTemp.length()==0){

                continue;
            }
            else if(inputCharArr[i]==32 && sbTemp.length()!=0){

                break;
            }
            else{
                sbTemp.append(inputCharArr[i]);

            }
        }
        System.out.println(sbTemp.toString());
    }

    // char==32 the samle with char ==' '
    // stringBuilder never null, new sb the length is zero, but not null.


}
