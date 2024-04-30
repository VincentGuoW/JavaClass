package April2024.Class20;

public class test1 {
    public static void main(String[] args) {
        int playNumber =7;

        for (int i = 1; i <= 100; i++) {
            int firstDigit = i%10;
            int tenthDigit = (i/10)%10;
            int sevenTimes =0;
            if(i>=playNumber && i%7==0){
                sevenTimes=i;
            }
            

            if(firstDigit==7 || tenthDigit==7 || sevenTimes!=0){
                System.out.println("PASS!" + i);
                continue;
            }
        }
    }
}
