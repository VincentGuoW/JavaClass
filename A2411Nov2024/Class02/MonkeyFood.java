package A2411Nov2024.Class02;

public class MonkeyFood {
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
        int day = 10;
        int[] arr = new int[day];
        arr[day-1]=1;
        for (int i = day-2; i >=0; i--) {
            arr[i]=(arr[i+1]+1)*2;
        }
        System.out.println(arr[0]);
    }
}
