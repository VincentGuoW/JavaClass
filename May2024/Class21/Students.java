package May2024.Class21;

public class Students {
    private String name;
    private int age;

    public Students(){ }

    public Students(String name,int age){
        this.name= name;
        this.age = age;
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
  
}
