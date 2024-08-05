package April2024.Class20;

public class test3 {
    public static void main(String[] args) {
        int inputNumber = 233;
        boolean result = true;
        for (int i = 1; i <= inputNumber; i++) {

            if (inputNumber % i == 0 && i != 1 && i != inputNumber) {
                //0 can not be divide

                result = false;

                break;

            }

        }
        if (result) {
            System.out.println("This is prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
