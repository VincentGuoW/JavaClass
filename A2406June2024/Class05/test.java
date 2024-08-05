package June2024.Class05;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(getCode());
    }
    private static String getCode(){
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            sb.append(list.get(r.nextInt(list.size())));
        }
        sb.append(r.nextInt(10));

        char[] charArray = sb.toString().toCharArray();
        int randomIndex = r.nextInt(charArray.length);
        char temp = charArray[randomIndex];
        charArray[randomIndex]=charArray[charArray.length-1];
        charArray[charArray.length-1]=temp;
        String result = new String(charArray);
        return result;
    }
}
