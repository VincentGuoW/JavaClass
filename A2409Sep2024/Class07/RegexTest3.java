package A2409Sep2024.Class07;

public class RegexTest3 {
    public static void main(String[] args) {
        System.out.println();
        String input = "aaa123aaa bbb456bbb 111789111 &&abc&& abc111abc";
        String regex = "((.)(\\2*?))(.+?)(\\1)";

        System.out.println("aaa123aaa".matches(regex));
        System.out.println("bbb456bbb".matches(regex));
        System.out.println("111789111".matches(regex));
        System.out.println("&&abc&&".matches(regex));
        System.out.println("abc111abc".matches(regex));
    }
}
