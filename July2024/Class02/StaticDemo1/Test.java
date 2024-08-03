package July2024.Class02.StaticDemo1;

public class Test {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.setEmployeeDuty("BE A BUYER");
        buyer.setEmployeeID("001AABB");
        buyer.setEmployeeName("Vincent");
        System.out.println(buyer.getEmployeeDuty());
        System.out.println(buyer.getEmployeeID());
        System.out.println(buyer.getEmployeeName());
        buyer.work();

    }
}
