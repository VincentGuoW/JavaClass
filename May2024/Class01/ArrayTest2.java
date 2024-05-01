package May2024.Class01;

public class ArrayTest2 {
    public static void main(String[] args) {
        int [] testArray ={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i < testArray.length; i++) {
            if(testArray[i]%3==0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
