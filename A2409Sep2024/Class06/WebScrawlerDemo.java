package A2409Sep2024.Class06;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WebScrawlerDemo {
    public static void main(String[] args) {
        String info = "Java is a programming language f and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today's digital world, by providing the Java8 reliable platform upon which many services Java11 and applications are built. New, innovative products and digital services designed for the future Java17 continue to rely on Java, as Java17 well.";
    
        Pattern p = Pattern.compile("Java\\w{0,2}");
        Matcher m = p.matcher(info);
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    
    }

    private static void method1(String info) {
        Pattern p = Pattern.compile("Java\\w{0,2}");
        Matcher m = p.matcher(info);
        boolean b = m.find();

        String s1 = m.group();
        System.out.println(s1);

        b=m.find();
        String s2 = m.group();
        System.out.println(s2);
    }
}
