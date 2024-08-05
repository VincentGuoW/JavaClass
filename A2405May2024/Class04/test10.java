package May2024.Class04;

public class test10 {
    public static void main(String[] args) {
        //int [][] multiDimensionalArrays =new int[][] {{},{},{}};
        //int [][] multiDimensionalArrays = {{1,2,3},{1,2,3,4,5,6,7,8},{1}};
        //Best way to do it:
        int [][] multiDimensionalArrays = {
            {1,2,3},
            {1,2,3,4,5,6,7,8},
            {1}
        };
        System.out.println(multiDimensionalArrays[1]);//[I@372f7a8d
        System.out.println(multiDimensionalArrays[1][4]);//5

        int [][] multiDimensionalArrays2 = new int[2][3];//{{1,2,3},{1,2,3}} if number must same size
        int [][] multiDimensionalArrays3 = new int[2][];//{{1,2,3},{1,2,3,4,5,6}} if no number can adjust size.
    }
}
