package April2024.Class18;

public class demo3 {
    public static void main(String[] args) {
        int chushu=100;
        int beichushu=3;
        int shang=0;
        int yushu=beichushu+1;

        //num1 / num2 = num3 ....num4

        while(yushu>beichushu){
            chushu-=beichushu;
            yushu=chushu;
            shang++;
        }

        System.out.println("OutNumber "+shang);
        System.out.println("left "+yushu);
    }
}
