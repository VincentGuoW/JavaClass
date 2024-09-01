package A2409Sep2024.Class01;

public class MathStudy {
    public static void main(String[] args) {
        int inputNumber = 100;
        for (int i = 2; i < Math.sqrt(inputNumber)+1; i++) {
            if(inputNumber%i==0){
                System.out.println("True");
                break;
            }
        }
    }
}
