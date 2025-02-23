package A202502Feb2024.Class02;

public class AnimalDemo {
    
}


class animal{
    private String name;
    private int age;
    void eat(String name,int age){
        System.out.println("An animal: "+name+" at age: "+age+" is eating");
    }
}
class cat extends animal{

}
class dog extends animal{}
class whiteCat extends cat{}
class blackCat extends cat{}
class whiteDog extends dog{}
class blackDog extends dog{}