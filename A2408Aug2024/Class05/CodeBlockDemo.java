package A2408Aug2024.Class05;

public class CodeBlockDemo {
    public static void main(String[] args) {
        int a=20;
        {
            int b =10;
        }
        System.out.println(a);
        System.out.println(b);//int b in code block, it will finish right away. save memory space
    }
    
    
}
