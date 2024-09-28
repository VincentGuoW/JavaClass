package A2409Sep2024.Class09;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        Random r = new Random();

        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        if (d1.getTime()>d2.getTime()){
            System.out.println("D1>D2");
            System.out.println(d1);
            System.out.println(d2);

        }else if(d1.getTime()<d2.getTime()){
            System.out.println("D1<D2");
            System.out.println(d1);
            System.out.println(d2);
            

        }else{
            System.out.println("Equal");
        }

    }
}
