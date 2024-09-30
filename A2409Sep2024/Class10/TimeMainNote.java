package A2409Sep2024.Class10;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class TimeMainNote {
    public static void main(String[] args) {
        /*
        Date    ==>     EEE MMM dd HH:mm:ss zzz yyyy
        */
        Date date = new Date();
        //After date get value can use SimpleDateFormat to get the form we want;
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        /*
        LocanlDateTime ==> form ==>yyyy-MM-ddTHH:mm:ss.nnn
        Only have time but no location info
        */
        LocalDateTime xxx= LocalDateTime.now();

        /*
        Calendar==> old, mistake alot deal with year,month,hour, min, zone....
                    But it have everything we need.[xxx,xxxx,xx,xxx,xxx....]
                    Unable to creat new(); only use getInstance();
        */
        Calendar c = Calendar.getInstance();
        /*
        ZoneId  ==> zone id only(where? the location)
         */
        ZoneId z = ZoneId.systemDefault();//current zone
        ZoneId z2 = ZoneId.of("Asia/Shanghai");//pick zone

        /*
        LocalDateTime ==> time for current location only.
         */
        LocalDateTime ldt = LocalDateTime.now();

        /*
        ZoneDateTime ==> LocalDateTime + ZoneId (locaiton with time, make it able to do time adjust between area)
        yyyy-MM-ddTHH:mm:ss.nnn±offset[zone code]
        
        */
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        
        /*
        Instant   ==>  Instant for accurate time, no location
        yyyy-MM-ddTHH:mm:ss.nnnZ
         */
        Instant i = Instant.now();



        /*
        what does they looks like:
        LocalDateTime       ==>   yyyy-MM-ddTHH:mm:ss.nnn
        ZonedDateTime       ==>   yyyy-MM-ddTHH:mm:ss.nnn±offset["xxx/xxxxx"] (xxx will be )
        Date                ==>   EEE MMM dd HH:mm:ss zzz yyyy
        Instant             ==>   yyyy-MM-ddTHH:mm:ss.nnnZ
        SimpleDateFormat    ==>   yyyy-MM-dd HH:mm:ss 
        DateTimeFormatter   ==>   yyyy-MM-dd HH:mm:ss
         */

         /*
        what's their advantage:
        LocalDate           ==>   No time zone. No seconds. For only deal with days
        LocalDateTime       ==>   No time zone. With seconds Meeting/Clock
        ZonedDateTime       ==>   Have timezone. International airline
        Date                ==>   No time zone. Use SimpleDateFormat/ Calender to add timezone.
        Instant             ==>   For accurate time, NO NEED time zone. Whole world should be at the same time.
        SimpleDateFormat    ==>   Provide more function to Date
        DateTimeFormatter   ==>   best way to work on times
        Calendar            ==>   kind like SimpleDateFormat
         */


        /*
         Date:
               ZoneID               LocationZone
               Instant              Only use Greenwich time
               ZoneDateTime         Time with LocationZone
         */    
    
         /*    
         SimpleDateFormat:    
               DateTimeFormatter    Same as simledateformat
         */    
    
        /*    
         Calendar:    
               LocalDate            Year,Month,Day
               LocalTime            Hour,Min,Sec
               LocalDateTime        Year,Month,Day,Hour,Min,Sec
         */            
            
         /*    
         Tool:    
               Duration             Second,millsec
               Period               Year,Month,Day
               ChronoUnit           Time between
         */
    }
}
