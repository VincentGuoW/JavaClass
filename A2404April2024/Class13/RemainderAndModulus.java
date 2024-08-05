package April2024.Class13;

public class RemainderAndModulus {
    public static void main(String[] args) {
        //  10 / -3  = -3 ..  1 (remainder)
        //  10 / -3  = -4 .. -2 (modulus  )  cuz it's more close to negative infinity
        System.out.println(10 / -3);//-3
        System.out.println(10 % -3);//1
        System.out.println(Math.floorMod(10, -3));//-2



        //  -10 / -3  = 3 .. -1   (modulus also remainder) cuz it's more close to negative infinity
        //  -10 / -3  = 4 ..  2   
        System.out.println(-10 / -3);//3
        System.out.println(-10 % -3);//-1
        System.out.println(Math.floorMod(-10, -3));//-1

    }
}
