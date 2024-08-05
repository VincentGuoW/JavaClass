package July2024.Class02.StaticDemo2;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Vincent");
        teacher.setAge(11);
        register(teacher);
        //teacher.show() //also works
    }

    public static void register(Employee e){
        e.show();
        //This is real important, cus we use Employee(Dad) as imput so we can have all the 
        //other (Son) to use this register(xxx)
        //We dont have to rewrite for all the it
    }
}
