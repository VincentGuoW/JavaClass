package A2409Sep2024.Class05;

public class RegularExpressionDemo3 {
    public static void main(String[] args) {
        /*
        Test phone number: 17632907611
            First digit must be 1, second digit must be 3-9, rest must be number;
            total 11 digits.

        Test local phone number: 020-2313432  0202321341 0201-2313432 
            area code:
                first number must be zero
                two or three numbers after it
            fourth might be "-", if not just skip it
            rest must be number5-10 digs,fist one can't be zero

        Test email address 13123123@qq.com jolijw1334@yahoo.com
        */
        System.out.println(phoneNumberTest("17632907611"));
        System.out.println(localPhoneNumberTest("021-112345678"));
        System.out.println(emailTest("jolijw1334@123.com.cn"));
    }

    public static boolean phoneNumberTest(String phoneNumber){
        boolean result = phoneNumber.matches("1[3-9]\\d{9}");
        return result;
    }

    public static boolean localPhoneNumberTest(String localPhoneNumber){
        boolean result = localPhoneNumber.matches("0\\d{2,3}-?[1-9]\\d{4,9}");
        return result;
    }

    public static boolean emailTest(String email){
        boolean result = email.matches("[\\w&&[^_]]+@[\\w&&[^_]]+\\.[\\w&&[^_]]+\\.*[\\w&&[^_]]*");
        return result;
    }

    /*extra knowledge
        123a_wef@ae12.com.cn
        before @ anydigits          ==>  \\w+  
        one @ simble                ==>  @
        before . any but no _       ==>  [\\w&&[^_]]+
        one . simble                ==>  \\.                (just dot . means anything)
        country(cn/com/jp....)      ==>  [a-zA-Z]{2,3}

        in this sample we have .com.cn we can consider that a same group repeat
        email.matches("\\w+@[\\w&&[^_]]+(\\.[a-zA-Z]{2,3}){1,2}");
        (\\.[a-zA-Z]{2,3}){1,2}
        means that .com.cn can repeat once or twice.
       
    */    
    public static boolean newTest(String email){
        boolean result = email.matches("\\w+@[\\w&&[^_]]+\\.[\\w&&[^_]]+\\.*[\\w&&[^_]]*");
        return result;
    }
}
