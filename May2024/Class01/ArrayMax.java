package May2024.Class01;

public class ArrayMax {
    public static void main(String[] args) {
        int sampleArray[] = {33,5,22,44,55};
        int output=sampleArray[0];//best use the array number!!!
        for (int i = 0; i < sampleArray.length; i++) {
            if(sampleArray[i]<output){
                output=sampleArray[i];
            }
        }
        System.out.println(output);
    }
}
