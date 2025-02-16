package A202502Feb2024.Class01;

public class GenericsDemo5 {
    public static void main(String[] args) {
        GenericsMyArrayList<String> mylist = new GenericsMyArrayList<>();
        //test test test
        mylist.add("123");
        mylist.add("abc");
        mylist.add("???");

    
        System.out.println();

        for (int i = 0; i < mylist.size; i++) {
            System.out.print("||");

            System.out.print(mylist.get(i));
            System.out.print("||");


        }
    }
}
