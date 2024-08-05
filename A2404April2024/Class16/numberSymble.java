package April2024.Class16;

public class numberSymble {
    public static void main(String[] args) {
        int a = 200;                    //0000 0000 0000 0000 0000 0000 1100 1000
        int b = 10;                     //0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(a & b);      //0000 0000 0000 0000 0000 0000 0000 1000
                                        //=>8
        System.out.println(a | b);      //0000 0000 0000 0000 0000 0000 1100 1010
                                        //=>202
        System.out.println(a <<2 );     //(-00)00 0000 0000 0000 0000 0000 1100 1000 (+00)
                                        //=>800==>(a*2^(2))
        System.out.println(a >>2 );     //(+00) 0000 0000 0000 0000 0000 0000 1100 10(-00)
                                        //=>50==>(a/2^(2))
    }
}
