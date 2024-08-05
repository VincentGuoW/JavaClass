package May2024.Class20;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("aaa");
        sb.append("aaa");
        sb.append("aaa");
        System.out.println(sb);
        //Should be sb address, but java have pre-build change address to string
        //So we have string as result

        String sbString = sb.toString();
        System.out.println(sbString);
        //best way to do it. even it will get the same answer
    }
}
