package May2024.Class01;

public class ArrayMotive {
    public static void main(String[] args) {
        //for array that has nothing in it but I know the total length

        int [] sampleArray = new int [3]; // number in side for total length E.g."3"
        System.out.println(sampleArray[0]); //==> "0" (if nothing inside)

        /*
        if array empty, auto fill:
            int     =>      0 
            double  =>      0.0
            char    =>      "/u0000"  (means space)
            boolean =>      false
            string  =>      null


            System.out.println(sampleArray[20])
                (only3 leagth array and I'm looking for 20th, outof range)
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
                => issue name "ArrayIndexOutOfBoundsException"
            Index 20 out of bounds for length 3
                => issue "Index 20 out of bounds for length 3"
            at May2024.Class01.ArrayMotive.main(ArrayMotive.java:8)
                => location of the issue
         */


        
    }
}
