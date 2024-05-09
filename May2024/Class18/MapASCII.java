package May2024.Class18;

public class MapASCII {
    public static void main(String[] args) {
        System.out.println();

        byte [] arr1 = {'1','2','3','4','5'};
        String s1 = new String(arr1);
        System.out.println("S1: ==> "+s1);

        char[] arr2 = {48,49,50,51,52};
        String s2 = new String(arr2);
        System.out.println("S2: ==> "+s2);
        
       
        String s3 = s1+s2;
        System.out.println("S3: ==> "+s3);
        
        /* When the array is string, must can't just add string array together use fori=>
        String [] arr3 = {"1","2","3","4","5"};
        String s3 = new String(arr3);
        System.out.println(arr3);
        */

    }
}
