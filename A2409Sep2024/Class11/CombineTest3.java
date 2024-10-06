package A2409Sep2024.Class11;

public class CombineTest3 {
    public static void main(String[] args) {
        //write your own method that can do toBinaryString
        // 100 ==> 1100100
        System.out.println();
        int sample = 100;
        int base = 8;
        System.out.println(adjustBaseString(sample,base));;
        System.out.println(Integer.toOctalString(sample));
       
    }

    public static String adjustBaseString(int number,int base){
        StringBuilder sb = new StringBuilder();
        while (true) {
            if(number==0){
                break;
            }
            int remainer = number%base;
            number = number/base;
            sb.insert(0, remainer);
        }
        
        
        return sb.toString();
    }
}
