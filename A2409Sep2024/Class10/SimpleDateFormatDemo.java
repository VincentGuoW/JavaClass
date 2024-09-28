package A2409Sep2024.Class10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d2 = new Date(0L);
        String str = sdf.format(d2);
        System.out.println(str);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd HH:mm:ss");
        Date da3 = new Date(0L);
        System.out.println(sdf2.format(da3));

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy 'Year' MM 'Month' dd 'Day' HH:mm:ss E");
        System.out.println(sdf3.format(da3));
        //better to use it with quotation mark for String' '
        //E = EEE will all get week
        //EEEE will get the full name of the week


        //How to read the time in string==>
        //Sample
        String str4 = "2023-11-11 11:11:11";
        //Wrtie he date format of the sample
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Use parse to change String into date
        Date date4 = sdf4.parse(str4);
        //Get date into long value for calculation
        System.out.println(date4.getTime());

    }
}
