package A2409Sep2024.Class07;

public class RegexTest7 {
    public static void main(String[] args) {
        System.out.println();
        String id = "12345678912345678x";
        String regexID = "(([1-9])(\\d{16}))(\\d|X|x)";
        System.out.println(id.replaceAll(regexID, "$4"));
        /*
         * The way to find the bracket is to count the left bracket part
         */
    }
}
