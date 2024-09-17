package A2409Sep2024.Class06;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WebScrawlerDemo {
    public static void main(String[] args) {
        // String info = "Java is a programming language f and" +
        //         "computing platform first released by Sun Microsystems in 1995. " +
        //         "It has evolved from humble beginnings to power a large share of today's " +
        //         " digital world, by providing the Java8 reliable platform upon which many" +
        //         "services Java11 and 123 applications are built. New, innovative products" +
        //         "and digital services designed for the future Java17 continue to rely" +
        //         " on Java, as Java17 well.";
        String info = "Java is a programming language f and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today's digital world, by providing the Java8 reliable platform upon which many services Java11 and applications are built. New, innovative products and digital services designed for the future Java17 continue to rely on Java, as Java17 well.";
        /*
        E.g.==> inputTxt.matches("Java\\w{0,2}")
         We need to save Regular Expression for reuse purpose
            ??? regularExpression == "Java\\w{0,2}"
            Same as
            String sample == "Sample"

            The thing that can save regular is called Pattern
            ==>
            Pattern p = Pattern.compile("Java\\w{0,2}");


            Then we need something to identiry as the whole (inputTxt.matches("Java\\w{0,2}"))
            Matcher xxx = Pattern.compile("Java\\w{0,2}").matcher(inputTxt);
            ==>
            Matcher xxx = p.matcher(inputTxt);
         */
        //Need Regular Expression
        Pattern p = Pattern.compile("Java\\w{0,2}");
        //Check input with Regular Expression rules
        Matcher m = p.matcher(info);
        

        //m.find()==> Java1(first time)
        //m.find()==> Java2(second time)
        //m.find()==> Java3(third time)
        //The trick it .find() will remember what been done last time, and 
        //keep going from there

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

    /*
     * String info = "JxxxxxxxxxxJ";
     
        Pattern p = Pattern.compile("xx");

        Matcher m = p.matcher(info);
        

        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
        //xx xx xx xx xx
        //So the macher will record the cursor, after find one, the next search will
        //start from the last time ending setion
     */
}
