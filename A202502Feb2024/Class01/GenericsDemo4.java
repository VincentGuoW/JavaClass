package A202502Feb2024.Class01;

public class GenericsDemo4 {
    public static void main(String[] args) {
        GenericsMyArrayList mylist = new GenericsMyArrayList<>();
        
        mylist.add(123);
        mylist.add("123");
        mylist.add(false);
    
        System.out.println();

        for (int i = 0; i < mylist.size; i++) {
            System.out.print("||");

            System.out.print(mylist.get(i));
            System.out.print("||");


        }
    }
}
