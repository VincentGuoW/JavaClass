package A2409Sep2024.Class07;

public class RegexTest5 {
    public static void main(String[] args) {
        System.out.println();
        String input = "abcccccddddddeeeee";
        
        //regular expression: looking for repeat letter 
        String regex = "(.)\\1+";
        //  (.)       ==> anything
        //  \\1+      ==> \\1 first bracket, + shows more than once
        //  (.)\\+    ==> anything and repeat show more than once 

        System.out.println(input.replaceAll(regex, "$1"));
        //  "$1"      ==> $1  first bracket
        // all condition fit regex, replace with their first bracket.
        //E.g.      ==> ccccc ==> c  (c)\\1+ 
        
    }
}
