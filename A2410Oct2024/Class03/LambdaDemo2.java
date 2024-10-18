package A2410Oct2024.Class03;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        String[] arr = { "a", "aaaa", "aaa", "aa" };

        // Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        Arrays.sort(arr, (String o1, String o2) -> {
            return o2.length() - o1.length();
        });

        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());

        System.out.println(Arrays.toString(arr));

    }
}
