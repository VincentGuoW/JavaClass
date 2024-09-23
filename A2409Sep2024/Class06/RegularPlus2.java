package A2409Sep2024.Class06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPlus2 {
    //Regular Expression == Regex
    public static void main(String[] args) {
        String info = "Java is jAvA123 a programming language f and" +
                "computing platform first released by Sun Microsystems in 1995. " +
                "It has evolved from humble beginnings to power a large share of today's " +
                " digital world, by providing the Java8 reliable platform upon which many" +
                "services Java11 and 123 applications are built. New, innovative products" +
                "and digital services designed for the future Java17 continue to rely" +
                " on Java, as Java17 well. jAva39 JAVaaaaaaaaAAAaaaa";


        //(?!)xxx ==> ignore upper or lower for xxx

        String regex1 = "((?i)Java)(?=8|11|17)";
                                    //xxx(?=y|z) after xxx, if they have y or z, return xxx only
        String regex2_1 = "((?i)Java)(8|11|17)";
        String regex2_2 = "((?i)Java)(?:8|11|17)";
                                    //works the same
                                    //xxx(y|z) after xxx, if they have something, return xxxy or xxxz
                                    //xxx(?:y|z) after xxx, if they have something, return xxxy or xxxz
        String regex3= "((?i)Java)(?!8|11|17)";
                                    //xxx(?!y|z) after xxx, if they have x or y, dont pick it.
                                    //E.g. java123 will return java couse even it has number 123 in it, but since
                                    //It doesn't match with 8 or 11 or 17 it still count for return
        String regex4 ="((?i)Java*)";
        //a.count()>=0
        String regex5 ="((?i)Java+)";
        //a.count()>=1
        String regex6 ="((?i)Java+?)";


        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(info);
        while (m.find()) {
            System.out.print(m.group()+ " ");
        }

    }
}
