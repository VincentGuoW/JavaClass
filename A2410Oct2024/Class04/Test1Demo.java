package A2410Oct2024.Class04;

import java.util.Arrays;
import java.util.Comparator;

public class Test1Demo {
    public static void main(String[] args) {
        //Build girlfiends Array to save girlfriends 
        System.out.println();
        Girlfriend g1 = new Girlfriend("AAAAAA", 22, 180);
        Girlfriend g2 = new Girlfriend("BBBBBB", 33, 170);
        Girlfriend g3 = new Girlfriend("CCCCCC", 24, 160);
        Girlfriend g4 = new Girlfriend("DDDDDD", 19, 150);
        Girlfriend g5 = new Girlfriend("DD", 19, 150);
        Girlfriend g6 = new Girlfriend("DDDDDD", 19, 160);

        Girlfriend[] arr= {g1,g2,g3,g4,g5,g6};
        Arrays.sort(arr, new Comparator<Girlfriend>() {
            @Override
            public int compare(Girlfriend o1, Girlfriend o2) {
                double temp = o2.getAge()-o1.getAge();
                temp = temp==0?o2.getHeight()-o1.getHeight():temp;
                temp = temp==0?o2.getName().length()-o1.getName().length():temp;

                if (temp>0){
                    return 1;
                }else if (temp < 0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

       System.out.println(Arrays.toString(arr));

    }

}
