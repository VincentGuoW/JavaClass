package A2408Aug2024.Class04;

public class UnderSameFile {
    public static void main(String[] args) {
        SampleDemo privateDemo = new SampleDemo();
        //name is private, can only been use under it's own class!
        System.out.println(privateDemo.name);
        privateDemo.show();
        

        //age able to use different file under same class
        System.out.println(privateDemo.age);
        //

        System.out.println(privateDemo.gender);
    }
    
    
}
