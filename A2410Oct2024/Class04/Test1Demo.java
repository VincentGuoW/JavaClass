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

        Girlfriend[] arr= {g1,g2,g3,g4};
        Arrays.sort(arr, new Comparator<Girlfriend>() {
            @Override
            public int compare(Girlfriend o1, Girlfriend o2) {
                
                return (int) (o2.getAge()-o1.getAge());
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
    }

}
