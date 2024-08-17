package A2408Aug2024.Class14;

public class OuterDemo {
    private int a = 10;
    public class InnerDemo{
        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(OuterDemo.this.a);
        }
    }
}
