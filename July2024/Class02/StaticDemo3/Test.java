package July2024.Class02.StaticDemo3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);
        person.setName("Mr Wang");

        Pet petDog = new Dog();
        petDog.setAge(2);
        petDog.setColor("Black");

        person.keepPet(petDog, "Bone");

    }
}
