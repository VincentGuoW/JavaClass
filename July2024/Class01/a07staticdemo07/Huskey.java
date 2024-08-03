package July2024.Class01.a07staticdemo07;

public class Huskey extends Dog {
    public void destory(){
        System.out.println("Destory his own house");
    }
    int age=1;
    int size=1;
    public Huskey(){}
    public Huskey(int age, int size) {
        this.age = age;
        this.size = size;
    }
    public void result(){
        System.out.println("AGE: " + age + ", SIZE: " +size);
    }
    
}
