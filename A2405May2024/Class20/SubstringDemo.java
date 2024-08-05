package May2024.Class20;

public class SubstringDemo {
    //substring 
    public static void main(String[] args) {
        System.out.println(); 
        String phoneNumber = "13190298976";

        String startNumber= phoneNumber.substring(0,3);
        String endNumber = phoneNumber.substring(7);

        String result = startNumber + "****" + endNumber;

        System.out.println(result);
    }
}
