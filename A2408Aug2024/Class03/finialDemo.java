package A2408Aug2024.Class03;

public class finialDemo {
    public static void main(String[] args) {
        final double PI = 3.14;
        //PI = 1;// This is wrong cus data with finial can't be change


        final Student s1 = new Student("Vincent",23);
        s1.setAge(11);
        s1.setName("TOM");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());

    }
}


