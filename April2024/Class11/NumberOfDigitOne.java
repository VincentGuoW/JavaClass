package April2024.Class11;

public class NumberOfDigitOne {

    public int countDigitOne(int n) {
        int countResult = 0;
        for(long i =1; i<=n; i*=10){
            long divisor = i*10;
            countResult += (n/divisor) * i + Math.min(Math.max(n % divisor - i + 1, 0L), i);
        }
        return countResult;
    }

    public static void main(String[] args) {
        
        NumberOfDigitOne equation = new NumberOfDigitOne();
        int result = equation.countDigitOne(13);
        System.out.println(result);

    }


    
}