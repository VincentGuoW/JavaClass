package A2408Aug2024.Class07;

public abstract class DadDemo {
    private String name;
    private int age;
    public DadDemo(){}
    public DadDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract void show();//For abstract, no need {}
    
}
