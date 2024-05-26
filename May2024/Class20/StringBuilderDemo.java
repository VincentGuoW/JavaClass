package May2024.Class20;

public class StringBuilderDemo {
    public static void main(String[] args) {
        /*
        StringBuilder append()
        StringBuilder reverse()
        length()
        toString()
         */

        String sample="";
        for ( int i = 0; i <100000; i++) {
            sample=sample+i+",";//Take for ever! cus each time they have to build a new string
        }
        System.out.println(sample);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
            sb.append(",");//Only adjust it on the same string.
        }
        System.out.println(sb);

      
    }   
}
