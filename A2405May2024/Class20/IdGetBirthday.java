package May2024.Class20;

public class IdGetBirthday {
    //E.g. 321281202001011234
    //7-14for year month day
    //17 to end will be gender Odd for man / Even for woman
    public static void main(String[] args) {
        System.out.println();
        String idNumber = "321281202001011223";
        String birthdayStr = idNumber.substring(6, 14);
        String genderStr = (idNumber.substring(14));
        System.out.println(birthdayOfficial(birthdayStr));
        System.out.println(genderBetter(genderStr));
    }

    public static String birthdayOfficial(String birthdayStr){
        String result="";
        //20240101
        //YEAR + MONTH + DAY
        result= "YEAR: "+birthdayStr.substring(0, 4)+", "+
                "MONTH: "+birthdayStr.substring(4, 6)+", "+
                "DAY: "+ birthdayStr.substring( 6);
        return result;
    }

    public static boolean genderTest(String genderStr){
        
        char lastDigit = genderStr.charAt(genderStr.length()-1);
        int lastDigitInt = lastDigit;//fine but not clear
        boolean reuslt =(lastDigitInt %2 ==0) ? true: false;
        return reuslt;
    }

    public static boolean genderBetter(String genderStr){
        char lastDigit = genderStr.charAt(2);
        int lastDigitInt = lastDigit-48;//better 'x' -48 (48 is zero at the asix chart)
        boolean reuslt =(lastDigitInt %2 ==0) ? true: false;
        return reuslt;
    }
}
