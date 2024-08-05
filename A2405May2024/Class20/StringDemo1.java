package May2024.Class20;

public class StringDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnopqrsturvxyz");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
