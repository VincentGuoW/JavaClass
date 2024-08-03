package July2024.Class01.a08staticdemo08;

public class Chef extends Employee {


    public Chef() {
    }




    public Chef(int id, String name, int pay) {
        super(id, name, pay);
    }




    @Override
    public void work() {
        System.out.println("Cook nice dishes");
    }
}
