package A2409Sep2024.Class05;

public class RegularExpressionDemo2 {
/*
    copy address, straight paste will be like:
        C:\Users\o_ovi\Desktop\Java\A2409Sep2024\Class05\RegularExpressionDemo.java
    But if We put it into string: "(paste in here)"
        "C:\\Users\\o_ovi\\Desktop\\Java\\A2409Sep2024\\Class05\\RegularExpressionDemo.java"

    ^ In most programming language simble "\" means ***escape character***
        change the char after "\" into something different
        E.g. "\n" means change line in html 

*/

/*
    "."     =>  anything
    "\d"    =>  [0-9]
    "\D"    =>  [^0-9]
    "\s"    =>  [\t\n\x0B\f\r]   //(ONE EMPTY CHAR)
    "\S"    =>  [^\s]
    "\w"    =>  [a-zA-Z0-9_]    ALSO INCLUDED "_" underscore line
    "\W"    =>  [^\w]
 */


 /*
    "X?"        =>  once / zero
    "X*"        =>  >= zero
    "X+"        =>  >= once
    "X{n}"      =>  n times
    "X{n,}"     =>  at least n times
    "X{n,m}"    =>  at least n times but less or equal to m times

    (a|b|c)     => a or b or c
    (a|b|c)     => (a|b|c)==[abc] it's the same  

    .matches( xxx ) will return pattern;
    So in filture when we create a pattern to recive .matches

 */    public static void main(String[] args) {
        System.out.println("C:\\Users\\o_ovi\\Desktop\\Java\\A2409Sep2024\\Class05\\RegularExpressionDemo.java");
        
        System.out.println("A图".matches(".."));//true
        System.out.println("图".matches(".."));//false
        System.out.println("A图".matches("."));//false
        System.out.println("A图".matches("[A-Z]."));//true

        System.out.println("1图".matches("\\d."));//true
        System.out.println("\\图".matches("\\\\."));//true if input==>"\" check with \\\\

        System.out.println("图".matches("\\w"));//false 图is not in range [a-zA-Z0-9]
        System.out.println("图".matches("\\W"));//true  not in //w ==>//W

        System.out.println("Result:     1");

        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23dF".matches("\\w{4}"));//true
        System.out.println("23dFawefaw".matches("\\w{4,}"));//true(at least 4 times)
        
        System.out.println("_!,?23dFawefaw".matches("\\w{4,}"));//false
        System.out.println("23dFawefaw_!,?".matches("\\w{4,}"));//false
        //Major issue, they have other simble inside, it wont matches.
        //First all input need to match the request, then it will calculate amount
        System.out.println("Result:     2");


        System.out.println("23_F".matches("\\w{4}"));//true
        System.out.println("23_F".matches("[\\w!?'']{4}"));//true

        System.out.println("23aF".matches("\\w&&[^_]{4}"));//false
        System.out.println("23aF".matches("[\\w&&[^_]]{4}"));//true
        //use && to find the common, they have to under array [...&&...]





        


    
    
    }
}
