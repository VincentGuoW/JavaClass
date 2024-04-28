package April2024.Class16;

public class byteToInt {
    public static void main(String[] args) {
        // int a =300;//            0000 0001 0010 1100  ==> 300
        // byte b = (byte)a;//      ---- ---- 0010 1100  ==>  44
        // System.out.println(b);// ==>44

        int a =200;//            0000 0000 1100 1000  ==> 200
        byte b = (byte)a;//      ---- ---- 1100 1000  ==> -56        
        System.out.println(b);// ==>-56
    }
}
