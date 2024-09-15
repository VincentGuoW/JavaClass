package A2409Sep2024.Class05;

public class RegularExpressionDemo {
/*
    [abc]           one char in abc range
    [^abc]          one char not a , b or c
    [a-zA-Z]        one char in a to z or A to Z range
    [a-z[A-Z]]      same as [a-zA-Z] 
    [a-z&&[m-p]]    one char in range a-z also in range m-p ==>result: m-p
    [a-z&&[^mp]]   one char in range a-z excludite m and p ==> result a-l + n-o + q-z
    [a-z&&[^m-p]]   one char in range a-z excludite m-p ==> result a-l + q-z


    ***common mistake ***
        If miss two &&, only did one, wont get the common range, will turns into:
        [a-z&[m-p]] ==> in range a-z, simble  "&" and range m-p.
            if any thing above qualify, return ture.
        System.out.println("&".matches("[a-z&[m-p]]"));//true
 */
 
 
 
 
 public static void main(String[] args) {
        //String accountSample = "102222";
        //System.out.println(checkAccount(accountSample));

        //boolean result =accountSample.matches("[1-9]\\d{5,19}");
        //System.out.println(result);


        System.out.println("a".matches("[abc]"));//true
        System.out.println("ab".matches("[abc]"));//false, cos it has two char
        System.out.println("ab".matches("[abc][abc]"));//true
    }

    public static boolean checkAccount(String account){
        if(account.length()>=6 && account.length()<=20 && account.charAt(0)!=48){
            return true;
        }

        return false;
    }
}
