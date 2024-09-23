package A2409Sep2024.Class07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println();
        //Find the first letter is the same as the last.
        String input1 = "a123a b456b 178971 &poiuy& a123d";
        // (\\x)==> means the value in unit x.
        /*
         * Greedy Matching issue!!!!
         *      String regex1 = "(.)(.+)\\1";
         * (.+)will stop at the last one they match not the first one
         * So we need (.)(.+?)\\1 lazy matching to find the first opintion 
         * 
        */
        String regex1 = "(.)(.+?)\\1";


        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(input1);

        while (m.find()) {
            System.out.println(m.group());
            System.out.println("------------------");
        }
        





    }
}
