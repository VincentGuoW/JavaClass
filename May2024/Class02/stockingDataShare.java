package May2024.Class02;

public class stockingDataShare {
    public static void main(String[] args) {
        int[] arr1 = {33,44,55};
        int[] arr2 = arr1; // arr2 and arr1 will share address AKA use same data.
        int[] arr3 = arr1.clone();  //arr3 and arr1 have same data, but it's a copy one different address！
        
        //manually way to do arr3
        int[] arr4 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        //arr4 == arr3; so arr3 is simple and better!


        arr2[0]=1001;

        System.out.println(arr1 + " : " +arr1[0]);
        System.out.println(arr2 + " : " +arr2[0]);
        System.out.println(arr3 + " : " +arr3[0]);
    }
}
