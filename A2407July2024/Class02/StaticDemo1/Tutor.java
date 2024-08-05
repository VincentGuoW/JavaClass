package July2024.Class02.StaticDemo1;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String employeeID, String employeeName, String employeeDuty) {
        super(employeeID, employeeName, employeeDuty);
    }
    
    @Override
    public void work() {
        System.out.println("Tutor work");
    }
}
