package A2410Oct2024.Class01;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        System.out.println();
        //Basic search find if something exist
        //{131,127,147,81,103,23,7,79}
        int[]arr = {131,127,147,81,103,23,7,79};
        boolean result = basicSearch(arr, 181);
        System.out.println(result);
    }

    public static boolean basicSearch(int[]arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
