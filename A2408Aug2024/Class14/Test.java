package A2408Aug2024.Class14;

public class Test {
    public  void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o.name);
        System.out.println(new Outer().name);



        Outer.Inner oi = new Outer().new Inner();
        new Outer().getInner2();
        Object inner2 = new Outer().getInner2();

        new OuterDemo().new InnerDemo().show();

        OuterDemo2.Inner.show3();
        OuterDemo2.Inner3 oi3 = new OuterDemo2().new Inner3();
    }
}
