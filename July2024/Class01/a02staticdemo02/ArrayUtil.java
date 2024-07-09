package July2024.Class01.a02staticdemo02;

public class ArrayUtil {

    private  ArrayUtil(){}//make it private, makesure no ArrayUtil1 ArrayUtil2 ...

    public static String printArr(int[]arr){ //static for use it.
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]+"");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    } 

    public static double getAerage(double[]arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum / arr.length;
    }
}
