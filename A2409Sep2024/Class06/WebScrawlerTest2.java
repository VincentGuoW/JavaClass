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

public class WebScrawlerTest2 {
    public static void main(String[] args) throws  URISyntaxException, MalformedURLException,IOException {
        URI uri = new URI("https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html");
        URL url = uri.toURL();
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line;

        while((line=br.readLine()) != null){
            //System.out.println(line);
            Pattern p = Pattern.compile("\\d{0,2}");
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.print(m.group() + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
