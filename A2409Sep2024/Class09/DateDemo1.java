package A2409Sep2024.Class09;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        System.out.println();
        Date d1 = new Date(0L);
        long d1Time = d1.getTime();

        Date d2 = new Date(0L);
        long d2Time = d2.getTime();
        d2Time=d2Time + 1000L*60*60*24*365;
        System.out.println("D2 time: "+d2);
        d2.setTime(d2Time);
        System.out.println("D2 time: " + d2);


        Date d3 = new Date(0L);
        long d3Time = d3.getTime();
        d3Time=d3Time + 1000L*60*60*24*365*3;
        System.out.println("D3 time: "+  d3);
        d3.setTime(d3Time);
        System.out.println("D3 time: " + d3);

        long resultTime = d3Time-d2Time;
        System.out.println(resultTime);
    }
}
