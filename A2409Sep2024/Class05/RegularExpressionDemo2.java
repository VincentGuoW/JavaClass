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
    "\w"    =>  [a-zA-Z0-9]
    "\W"    =>  [^\w]
 */
    public static void main(String[] args) {
        System.out.println("C:\\Users\\o_ovi\\Desktop\\Java\\A2409Sep2024\\Class05\\RegularExpressionDemo.java");
        
        System.out.println("A图".matches(".."));//true
        System.out.println("图".matches(".."));//false
        System.out.println("A图".matches("."));//false
        System.out.println("A图".matches("[A-Z]."));//true

        System.out.println("1图".matches("\\d."));//true
        System.out.println("\\图".matches("\\\\."));//true if input==>"\" check with \\\\

        System.out.println("图".matches("\\w"));//false 图is not in range [a-zA-Z0-9]
        System.out.println("图".matches("\\W"));//true  not in //w ==>//W

        


    
    
    }
}
