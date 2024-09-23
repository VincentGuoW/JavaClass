package A2409Sep2024.Class06;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println();
        String sampleString = "SAM afjwo1233ifjwoji TOM a123jowiej324foi JERRY fj123123aiowei.";
        String regex1 = "[^A-Z]+";
        System.out.println(sampleString.replaceAll(regex1, " VS "));

        //slipt a 
        //E.g.  xxxxxayyyyy
        //=>    xxxxx yyyyy
        //It will take a as a split.
        String [] result = sampleString.split(regex1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        //when go through Definition, String regex means they can take Regular Expression


        System.out.println(sampleString);

    }
}
