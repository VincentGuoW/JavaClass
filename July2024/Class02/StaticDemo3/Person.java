package July2024.Class02.StaticDemo3;

public class Person {
    private String name;
    private int age;
    public Person() {
    }
    public Person(String name, int age) {
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
    public void keepPet(Pet p,String food){
        if(p instanceof Dog){
            System.out.println("Age of "+age+" Name of "+name+" have a "+p.getColor()+" color "+p.getAge()+" years old dog");
            p.eat(food);
        }
        else if(p instanceof Cat){
            p.eat(food);
        }
        else{
            System.out.println("instance of class is wrong");
        }
    }
    
}
