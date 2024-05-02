package May2024.Class02;

public class stockingData {
    public static void main(String[] args) {
        int[] arr = new int[2];

        //catch data
        System.out.println(arr);// arr will only record the address code [I@372f7a8d
        System.out.println(arr[0]); //arr data will be same into different location arr[0]
        System.out.println(arr[1]); //go address and find the data;
        
        //input value in
        arr[0]=11;
        arr[1]=22;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println("--------------------------");

        int[] arr2 = {33,44,55};
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        /*int a = 10;
        int b = 10;
        int c = a + b;

        System.out.println(c);*/
    }

    
}
