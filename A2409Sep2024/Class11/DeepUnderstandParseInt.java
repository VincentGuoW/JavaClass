package A2409Sep2024.Class11;

public class DeepUnderstandParseInt {
    public static void main(String[] args) {
        //Use own method to do parseInt
        //1. only number 2.at list one digit, max 10 digt 3. cant start with zero

        String sample = "12345";
        //String regex2 = "(\\d&&[^0])\\d{0,9}"; must use ==> [...&&...]
        String regex = "[\\d&&[^0]]\\d{0,9}";
        int result = 0;
        if(sample.matches(regex)){
            for (int i = 0; i < sample.length(); i++) {
                char c = sample.charAt(i);
                System.out.println(c);
                //result = result*10+(c-48);
                result = result*10+('0');//better
                System.out.println("result== "+result);
            }
        }
        System.out.println(result);
        System.out.println(result+1);
    }
}
