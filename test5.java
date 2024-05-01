import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        Random r = new Random();
        

        for (int i = 0; i < 100; i++) {
            int number= r.nextInt(1,11); 
            // int number = r.netInt(10)+1
            System.out.println(number);
        }
    }
}
