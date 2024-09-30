package A2409Sep2024.Class10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest2 {
    public static void main(String[] args) throws ParseException {
        System.out.println();
        /*
         * Ticket purches:
         * Start date 2023 Year 11 Month 11Day 00:00:00
         * End date 2023 Year 11 Month 11Day 00:10:00
         * 
         * Player 1 purches time 2023 Year 11 Month 11Day 00:05:00
         * Player 2 purches time 2023 Year 11 Month 11Day 00:11:00
         * Player 3 purches time 2023 Year 11 Month 10Day 00:05:00
         * 
         * who got the ticket?
         */

        String startTime = "2023 Year 11 Month 11Day 00:00:00";
        String endTime   = "2023 Year 11 Month 11Day 00:10:00";
        String player1   = "2023 Year 11 Month 11Day 00:10:00";
        String player2   = "2023 Year 11 Month 11Day 00:11:00";
        String player3   = "2023 Year 11 Month 10Day 00:05:00";


        Long startTimeLong = getTime(startTime);
        Long endTimeLong = getTime(endTime);
        Long player1Long = getTime(player1);
        Long player2Long = getTime(player2);
        Long player3Long = getTime(player3);
        System.out.println(player3Long);

        if(player1Long>=startTimeLong && player1Long<=endTimeLong){
            System.out.println("player1 got the ticket");
        }else if(player2Long>=startTimeLong && player2Long<=endTimeLong){
            System.out.println("player2 got the ticket");
        }else if(player3Long>=startTimeLong && player3Long<=endTimeLong){
            System.out.println("player3 got the ticket");
        }
        else{
            System.out.println("No one got the ticket");
        }

    }

    private static long getTime(String inputtime) throws ParseException {
        String dateFormat = "yyyy 'Year' MM 'Month' dd'Day' HH:mm:ss";
        SimpleDateFormat startDateFormat = new SimpleDateFormat(dateFormat);
        Date outputDate = startDateFormat.parse(inputtime);
        return outputDate.getTime();
    }
}
