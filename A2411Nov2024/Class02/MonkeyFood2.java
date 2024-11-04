package A2411Nov2024.Class02;

public class MonkeyFood2 {
    public static void main(String[] args) {
        /*
        Day 1 ==> Monkey take half of the food and one extra;
        Day 2 ==> Monkey take half of the left over and one extra
        ...
        Day 10 ==> only one left, before taking any food.
        ==
        What's the beginning amount?? 
         */
        System.out.println();
        System.out.println(getCount(1));
    }

    public static int getCount(int day){
        if(day<=0||day>=11){
            return -1;
        }
        if(day==10){
            return 1;
        }
        return (getCount(day+1)+1)*2;
    }
}
