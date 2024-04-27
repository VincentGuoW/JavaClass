package April2024.Class16;



public class shortCircuit {
    public static void main(String[] args) {
      
        int a = 10;
        int b = 10;

        boolean result = ++a>100 &&  ++b>100;

        System.out.println(result); //!! && is differnet than &  !!
        System.out.println(a); //++a  -->  11
        System.out.println(b); //++b  -->   got short circuit 
                                        //  never been use so it's still b, ++b never used.


        int c  = 10;
        int d  = 10;
        boolean result2 = ++c<100 ||  ++d<100; 
        System.out.println(result2);  
        System.out.println(c); 
        System.out.println(d);                              
                                        
    }
}
