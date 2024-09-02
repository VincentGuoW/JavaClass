package A2409Sep2024.Class01;

public class TimeMillis {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            if(isPrime1(i)){
            }
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("The method 1 time takes: " + (endTime1-startTime1));


        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            if(isPrime2(i)){
            }
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("The method 2 time takes: " + (endTime2-startTime2));




    }

    public static boolean isPrime1(int number){
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
