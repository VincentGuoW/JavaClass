package May2024.Class18;

public class StringStudy {
    /*
     public String()
     public String("xxx")
     public String(Char[] xx)
     public String(byte[] xx)

     !!!String Pool!!! 
      Java special area to store String. If same reuse it.
      But only for direct initialization!!!

     StringTable => String xxx = "xxx" //(direct initialization) will be saved into String Pool
     New Object  => String xxx = new String() //new object, new address.
    */
    public static void main(String[] args) {
        System.out.println();
        String s1 = "abc";
        System.out.println("s1:"+s1);
        String s2 = new String("abc");
        System.out.println("s2:"+s2);

        //char to String // String to char
        char [] chs = {'a','b','c','d'};
        String s3 = new String(chs);
        System.out.println(s3);

        String s4 = "VincentHuo";
        char[] chs2 = new char[s4.length()];
        for (int i = 0; i < chs2.length; i++) {
            if(s4.charAt(i)=='H'){
                chs2[i]='G';
            }else{
                chs2[i]=s4.charAt(i);
            }
        }
        String s4New = new String(chs2);
        System.out.println(s4New);


        //byte to char ==> (ASCII Table)
        byte [] byteArry = {97,98,99,100,101};
        String s5 = new String(byteArry);
        System.out.println(s5);


        //char with ASCII table also works
        char [] charArray = {126,97,98,99,100,101,126};
        String s6 = new String(charArray);
        System.out.println(s6);
    }
}
