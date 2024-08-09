package A2408Aug2024.Class07;

public class AbstractDemo {
    public static void main(String[] args) {
        SonDemo s = new SonDemo("name",1);
        s.setName("Vincent");
        s.setAge(28);
        System.out.println("Name: "+s.getName()+", Age: "+s.getAge()+"");
    }

    /*
     Important note about Abstract:
        1. Class have abstract inside, the whole class must be abstract aswell;
        2. Abstract class can not be use right away, need to build a extends class
            e.g. son class, rewrite all the abstract function and use son class.
            Think of private value need set and get methond to use it.
        3.NEED TO REWRIGHT ALL THE abstract function in the extends class!
        (It make sense, only if all their son/extens class have it, then they need
        write it in the dad/main class )
     */
}
