package May2024.Class01;

public class ArrayStartTest {
    // get sum of the array;
    public static void main(String[] args) {
        int [] testArray = {1,2,3,4,5};//= new int[]{1,2,3,4,5}
        int total=0;
        for (int i = 0; i < testArray.length; i++) {
            total+=testArray[i];
        }
        System.out.println(total);
    }
}
