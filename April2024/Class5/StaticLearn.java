package April2024.Class5;

public class StaticLearn {

    public static void main(String args[]){
        //must use main to run it?!!!
        Dish sample1 = new Dish(1);
        Dish sample2 = new Dish(2);
        Dish sample3 = new Dish(3);
        Dish sample4 = new Dish(4);

        System.out.println(sample1.salt);
        System.out.println(sample2.salt);
        System.out.println(sample3.salt);
        System.out.println(sample4.salt);

        System.out.println(Dish.count);
    }
}
