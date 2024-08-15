package A2408Aug2024.Class12;


public class Test {
    public static void main(String[] args) {
       
        int[] num1 ={1,3};
        int[] num2 = {2,4};
        System.out.println();

        int numAmount = num1.length+num2.length;
        int[] merged = new int[numAmount];
        for (int i = 0; i < num1.length; i++) {
            merged[i]=num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < merged.length; j++) {
                if(merged[j]<=num2[i]){
                    int temp =merged[j+1];
                    merged[j+1]=num2[i];
                    merged[j+2]=temp;
                }
                else{
                    break;
                }
            }
        }

        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
        
       

    }
}
