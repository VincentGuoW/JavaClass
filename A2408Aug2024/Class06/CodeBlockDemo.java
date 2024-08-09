package A2408Aug2024.Class06;

public class CodeBlockDemo {
    private int age;
    private String name;
    {
        System.out.println("Instance Initialize Block");
        //will print everytime they have a new variable
    }
    static{
        System.out.println("Static Block");
        //only print when they first use this block// consider this is start up database
        //Static will show befor Instance Initialize Block
    }
    public CodeBlockDemo(){}
    public CodeBlockDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        String showString = "Test";
        {
            showString = "This is the Local Block";
            System.out.println(showString);

            int a = 10;
        }
       
        System.out.println(showString);
        //System.out.println(a); int a will be delete cus inside local block once finish will get remove
    }


    
}
