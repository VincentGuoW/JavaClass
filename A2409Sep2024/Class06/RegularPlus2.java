package A2409Sep2024.Class06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPlus2 {
    public static void main(String[] args) {
        String info = "Java is a programming language f and" +
                "computing platform first released by Sun Microsystems in 1995. " +
                "It has evolved from humble beginnings to power a large share of today's " +
                " digital world, by providing the Java8 reliable platform upon which many" +
                "services Java11 and 123 applications are built. New, innovative products" +
                "and digital services designed for the future Java17 continue to rely" +
                " on Java, as Java17 well. jAva39 Javaaaaaaaaaaaaaaaaaaa";

        String regex1 = "((?i)Java)(?=8|11|17)";
        String regex2 = "((?i)Java)(?:8|11|17)";
        String regex3= "((?i)Java)(?!8|11|17)";
        String regex4 ="((?i)Java+)";
        String regex5 ="((?i)Java+?)";


        Pattern p = Pattern.compile(regex5);
        Matcher m = p.matcher(info);
        while (m.find()) {
            System.out.print(m.group()+ " ");
        }

    }
}
