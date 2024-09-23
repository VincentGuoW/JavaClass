package A2409Sep2024.Class07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
    public static void main(String[] args) {
        System.out.println();
        String input = " abc123abc b456b 123789123 &?!abc&?! abc123abd";

        String regex = "(.+)(.+)\\1";
        System.out.println("abc123abc".matches(regex));
        System.out.println("b456b".matches(regex));
        System.out.println("123789123".matches(regex));
        System.out.println("&?!abc&?!".matches(regex));
        System.out.println("abc123abd".matches(regex));

        System.out.println("-----------------------");

        String regex1 = "(.+?)(.+?)\\1"; // lazy match

        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println(m.group());
            System.out.println("--------");
        }
        System.out.println("-----------------------");

    }
}
