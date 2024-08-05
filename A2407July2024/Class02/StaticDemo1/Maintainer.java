package July2024.Class02.StaticDemo1;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String employeeID, String employeeName, String employeeDuty) {
        super(employeeID, employeeName, employeeDuty);
    }
    
    @Override
    public void work() {
        System.out.println("Maintainer's work");
    }
}
