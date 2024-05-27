package May2024.Class20;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        System.out.println();
        int[]arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("The result is "+ intArrayToString(arr));
    }

    public static String intArrayToString (int[]arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==0){

                sb.append("[").append(arr[i]).append(", "); 
            }
            else if (i==arr.length-1){
                sb.append(arr[i]).append("]");
            }
            else{
                sb.append(arr[i]).append(", ");
            }
           
        }
        // String result = sb.toString();
        // return result; 
        return sb.toString();
        //simple way
    }
}
