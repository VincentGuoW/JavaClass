package A2408Aug2024.Class15;

public class ClassInMethod {
    //Member variables
    int a = 20;

    public void show(){
        //Local Variable
        int a = 10;
        class Inner{
            String innerName;
            int innerAge;
            public void method1(){
                System.out.println("Inner method 1");
                System.out.println(a);
                System.out.println(ClassInMethod.this.a);
            }


        }

        Inner i = new Inner();
        System.out.println("Inner name" + i.innerName);
    }
}
