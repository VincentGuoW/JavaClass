package May2024.Class01;

public class twoArraySwithc {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        for (       int i = 0,  j = arr.length-1; //when stat i from the left & j from right
                    i < j; //condition fit, go inside; if not, stop before go inside.
                    i++,j--//need to do after finish each round before next round
            ) 
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            //if arr[i]=arr[j] it will replace the i value before arr[j]=arr[i]
            //so we need someplace to keep arr[i] temperally.
        }
    }
}
