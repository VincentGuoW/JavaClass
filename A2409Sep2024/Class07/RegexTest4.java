package A2409Sep2024.Class07;

public class RegexTest4 {
    public static void main(String[] args) {
        System.out.println();
        String input = "I want study study about about about JAVA JAVA JAVA JAVA JAVA";
    
       // String regex = "(.*?)\\1*";
        String regex = "\\b(\\w+)\\b( \\1)+";


        //$1 means the first () in regex
        //same as \\1 inside the regex
        String output = input.replaceAll(regex, "$1");
        System.out.println(output);
    
    }
}
