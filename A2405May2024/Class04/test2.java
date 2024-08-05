package May2024.Class04;

public class test2 {
    // how many prime number between 101~200

    public static void main(String[] args) {
        int primeNumberTotal1=0;
        int primeNumberTotal2=0;
        int way1 = 0;
        int way2 =0;

        for (int i = 101; i <=200; i++) {
            boolean isPrime1=true;
            boolean isPrime2=true;
            for (int j = 2; j < i; j ++) {
                    if (i % j == 0) {
                        isPrime1 = false;
                        break;
                    }
                way1++;
            }
             
            
            for (int k = 2; k <= Math.sqrt(i); k++) {// equal to the sqrt(i) E.g. 10=sqrt(100), need to consider 10;
                if (i % k == 0) {
                    isPrime2 = false;
                    break;
                }
                way2++;
            }
            
            if(isPrime1){
                primeNumberTotal1++;
            }
            if(isPrime2){
                primeNumberTotal2++;
            }
        }
        System.out.println("primeNumberTotal1: "+primeNumberTotal1);
        System.out.println("primeNumberTotal2: "+primeNumberTotal2);
        System.out.println("way1: "+way1);
        System.out.println("way2: "+way2);
    }
}
