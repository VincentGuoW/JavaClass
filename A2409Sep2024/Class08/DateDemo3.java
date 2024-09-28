package A2409Sep2024.Class08;

import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        System.out.println();
        //1 year after the epoch time
        Date d =new Date(0L);
        System.out.println("d1 "+ d);
        d.setTime(1000L*60*60*24*365);
        System.out.println("d1 "+ d);

        Date d2 = new Date();
        System.out.println("d2 "+ d2);
        d2.setTime(1000L);
        System.out.println("d2 "+ d2);

        long d2Time = d2.getTime();
        System.out.println("d2 "+ d2Time);


        //1000 * 60 * 60 * 24 * 365  =  31,536,000,000  
        //int max = 2^31 - 1 =   2,147,483,647
        //So use long to get accurate result (add L after the number)
        System.out.println(1000L*60*60*24*365);//long type
        System.out.println(1000*60*60*24*365);//int type
        
        System.out.println(System.currentTimeMillis());
    
    }
}
