package April2024.Class18;

import java.util.Scanner;

public class loopTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input int number inside: ");
        int inputNubmer = sc.nextInt();
        
        if(inputNubmer<0||inputNubmer%10==0){
            System.out.println(false);
        }
        else{
            int inputLeft=0;//can't be empty.
            int inputRight=inputNubmer;
           
            while(inputLeft<inputRight){
                inputLeft=inputLeft* 10+(inputRight%10);
                inputRight=inputRight/10;
                
            }
            if (inputLeft==inputRight || inputLeft/10==inputRight) {
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            
        }
        
    }
}
