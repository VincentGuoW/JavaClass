package A202502Feb2024.Class02.AnimalTest.java;

public abstract class Animal<N,I> {
    //abstract ==> only work for the extent class
    //Dad work for the son. dad useless 
    //(dad only stock for the son when he needs to use it)

    private N name;
    private I age;
    public Animal() {

    }
    public Animal(N name, I age) {
        this.name = name;
        this.age = age;
    }
    public N getName() {
        return name;
    }
    public void setName(N name) {
        this.name = name;
    }
    public I getAge() {
        return age;
    }
    public void setAge(I age) {
        this.age = age;
    }

    public abstract void eat();
}
