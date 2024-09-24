package A2409Sep2024.Class07;

public class RegexTest6 {
    public static void main(String[] args) {
        //Not able to use \\1 or $1 condition:
        //      x(?:y)   ==> x follow y ==show==>   xy
        //      x(?=y)   ==> x follow y ==show==>   x
        //      x(?!y)   ==> x follow y ==show==>   null (if x follow anything but y then return y)
        System.out.println();
        String input = "abcccccddddddddeeeeee";

        String regex1 = "(?:.)(?:.)(\\2+)";
        String regex2 = "(.)(.)(\\2+)";

        System.out.println(input.replaceAll(regex1, "$2"));
        System.out.println(input.replaceAll(regex2, "$2"));

        String id = "12345678912345678x";
        String regexID = "[1-9](?:\\d{16})(\\d|X|x)";
        System.out.println(id.replaceAll(regexID, "$1"));
        //This will replace the the whole thing with "$1", the first bracket
        //As you can see the first bracket is (?:\\{16})
        //but they returen(\\d|X|x)
        //therefor (?:) (?!)(?=) brackets doesn't count


    }
}
