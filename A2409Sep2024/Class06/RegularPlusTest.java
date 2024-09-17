package A2409Sep2024.Class06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPlusTest {
    public static void main(String[] args) {
        // multiple regularExpression
        System.out.println();
        
        String info ="Java is a 12programming language f and 1Java12";

        String rule1 = "\\d{0,4}";
        String rule2 = "(Java\\d{0,2})";
        String rule3 = "(a[a-z]{0,3})";

        //String mainRule = "("+rule1+"|"+rule2+"|"+rule3+")";
        String mainRule = "[a]";


        Pattern p = Pattern.compile(mainRule);
        Matcher m = p.matcher(info);
        while (m.find()) {
            System.out.print(m.group() + " , ");   
        }
    }
}
