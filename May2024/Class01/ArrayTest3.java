package May2024.Class01;

public class ArrayTest3 {
    public static void main(String[] args) {
        // ONE LOOP DO ONE JOB!! DONT COMBINE JOBS TOGETHER!!!
        int [] testArray ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < testArray.length; i++) {
            if(testArray[i]%2!=0){
                testArray[i]=testArray[i]*2;
            }
            else{
                testArray[i]=testArray[i]/2;
            } 
        }

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }

    }
}
