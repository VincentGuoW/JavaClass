package April2024.Class19;

public class skipDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if(i==3){
                continue;
                //!!    Continue    !!   means skip this section(i=3 skip)
                //!!      Break     !!   means skip this loop(for... done)
            }

            System.out.println("This is number: "+ i +" .");
           
        }
    }
}
