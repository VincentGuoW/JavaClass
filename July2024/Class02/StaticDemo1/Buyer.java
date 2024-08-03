package July2024.Class02.StaticDemo1;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String employeeID, String employeeName, String employeeDuty) {
        super(employeeID, employeeName, employeeDuty);
    }

    @Override
    public void work() {
        System.out.println("Buyer's work");
    }
    
}
