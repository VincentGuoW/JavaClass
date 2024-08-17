package A2408Aug2024.Class14;

public class OuterDemo2 {
    String name;
    static int age;
    public static class Inner{
        public void show2(){
            OuterDemo2 o2 = new OuterDemo2();
            System.out.println(o2.name);
            System.out.println(age);
        }
        public static void show3(){
            OuterDemo2 o2 = new OuterDemo2();
            System.out.println(o2.name);
            System.out.println(age);

        };
    }
   
    public class Inner3{
        public void show2(){
            System.out.println(name);
            System.out.println(age);
        }
        public static void show3(){
            OuterDemo2 o2 = new OuterDemo2();
            System.out.println(o2.name);
            System.out.println(age);

        };
    }
    
}
