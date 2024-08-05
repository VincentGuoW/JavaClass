package May2024.Class06;

public class GirlFriend {
    /*
        Must be private other width it's not safe.
        In private, only same class can access it.
        (E.g. class GrilFrined can change it but others can't)
     */
    private int age;
    private double height;
    private String name;

    //set
    public void setAge(int inputAge){ //!!!! no static ！!!!
        if(inputAge>=18 && inputAge <=50){
             age =inputAge;
        }
        else{
            System.out.println("Wrong age");
        }
    }
    //get
    public int getAge(){
        return  age;
    }


    public static void sleep(){
        System.out.println("Sleep");
    }
    public static void eat(){
        System.out.println("Eat");
    }


}
