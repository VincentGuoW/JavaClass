package A2409Sep2024.Class05;

public class RegularExpressionTest {
    //username Check:       4-16 number, letter, upper letter and underscore
    //ID Check:             18 total length, 17 numbers only front, and last(the 18) can be number or x or X;
    //Super ID Check:
            //First dig can't be zero, first one to six all number;
            //next four digit in year 18xx 19xx 20xx cus no one younger than that
            //month 01-12
            //date 01-31
            //last four digit any number 3 times, last one can be 3, x or X.
    public static void main(String[] args) {
        //(?i) ignore upper case
        String sample1 = "(?i)abc";//abc all ignore upper case
        System.out.println("abc".matches(sample1));
        System.out.println("ABC".matches(sample1));
        System.out.println("AbC".matches(sample1));
        String sample2 = "ab(?i)c";//c ignore upper case
        System.out.println("ABc".matches(sample2));
        System.out.println("ABC".matches(sample2));
        System.out.println("abC".matches(sample2));
        String sample3 = "a((?i)b)c";//b ignor upper case
        System.out.println("ABc".matches(sample3));
        System.out.println("ABC".matches(sample3));
        System.out.println("abC".matches(sample3));

        System.out.println("Test result: ");
        System.out.println(IDCheck("12345678901234567x"));
        System.out.println(IDCheck("123456789012345671"));
        System.out.println(IDCheck("12345678901234567X"));

    }

    public static boolean usernameCheck(String input){
        return input.matches("\\w{4,16}");
    }

    public static boolean IDCheck(String input){
        //return input.matches("\\d{17}[\\dxX]");
        //return input.matches("\\d{17}(\\d|x|X)"); its the same
        //return input.matches("\\d{17}[\\d((?i)x)]"); WRONG
        /*
            *****This is important*****
            In Regular Expression 
            []  ==> list all the posibility's (after calculation)
                    e.g. xX     [\\dxX]
            ()  ==> can still keep calculation
                    e.g. (?i)x  (\\d | x | X) or (\\d | (?i)x)
         */
        return input.matches("\\d{17}(\\d|(?i)x)");
    }

    public static boolean IDCheckSuper(String input){
        return input.matches("[1-9]   \\d{5}   ((1(8|9))|20)  \\d{2}   ((0[\\d&&[^0]])|(1[012]))    (0[1-9] | 1\\d | 2\\d | 3(0|1))    \\d{3} (\\d | (?i)x)         ");
        /*
         18 19 20   ==>     ((1(8|9))|20) 
         or
         18 19 20   ==>     (18|19|20) 

         01-31
         (0[\\d&&[^0]]) | 1\\d | 2\\d | 3(0|1))
         ==>
         (0[1-9] | [12]\\d | 3[01])

         // 3[01] and 3(0|1) they will all get 30 or 31 

         (\\d | (?i)x ) ==>     [ \\d x X ]
         
         */
    
    }
}
