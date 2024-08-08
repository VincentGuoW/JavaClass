package A2408Aug2024.Class03;

public class finialDemo {
    public static void main(String[] args) {
        final double PI = 3.14;
        //PI = 1;// This is wrong cus data with finial can't be change


        //It's ok to change data inside finial Student s1
        //Cus finial is for s1's address.
        final Student s1 = new Student("Vincent",23);
        s1.setAge(11);
        s1.setName("TOaM");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());

        final int[] arr={1,2,3,4,5};
        arr[0]=11;
        arr[1]=22;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        


    }
}


