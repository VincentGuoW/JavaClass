package May2024.Class19;

public class StringDemo3 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr ={1,2,3};
        int arrNumber = arr.length;
        String result="[";
        //Must write something here, String result; is wrong. it will be null all the time
        for (int i = 0; i < arrNumber; i++) {
            //Int and String can straight add together.
            //Int + String => String(Add and save everything as string.)
            result=result+arr[i];
            if(i<arrNumber-1){
                result=result+", ";
            }
        }
        result=result+']';
        System.out.println(result);
    }
}
