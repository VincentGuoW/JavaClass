package May2024.Class01;

public class ArrayStart {
    public static void main(String[] args) {
        //if I want put three int inside array

        int [] sampleIntArray = new int[] {123,223,323};
        //Fast way to went through all "fori"
        double [] sampleDoubleArray ={1.23,2.23,3.23}; //simple way to write it.
        
        System.out.println(sampleIntArray); //This is array location!   =>  "[I@372f7a8d"
        /*[I@372f7a8d
            [ => Means this is an array.
            I => This array is int(E.g. D for double)
            @ => Standard way to say at.
            372f7a8d => location code.(16)

        */
        System.out.println(sampleIntArray[0]); //This will be the first one in array.
        System.out.println(sampleDoubleArray[0]);

       for (int i = 0; i < sampleDoubleArray.length; i++) {
            System.out.println(sampleDoubleArray[i]);
       }
    }
}
