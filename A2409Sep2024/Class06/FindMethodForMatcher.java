package A2409Sep2024.Class06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethodForMatcher {
    public static void main(String[] args) {
        String info = "JxxxxxxxxxxJ";
     
        Pattern p = Pattern.compile("xx");

        //Use m to read though info with the p regularExpression rules
        //But it won't start read the whole thing right away
        //m.find() will push it to read one by one
        Matcher m = p.matcher(info);
        //m.find()==> boolean 
        m.find();
        System.out.println(m.group());
        m.find();
        System.out.println(m.group());
        m.find();
        System.out.println(m.group());
        m.find();
        System.out.println(m.group());
        m.find();
        System.out.println(m.group());
        m.find();
        System.out.println(m.group());//last one will retrun fault cus we only have 5 xx;

        //while (m.find()) {
        //    String s = m.group();
        //    System.out.println(s);
        //}

        //xx xx xx xx xx
        //So the macher will record the cursor, after find one, the next search will
        //start from the last time ending setion
    }
        
    
}
