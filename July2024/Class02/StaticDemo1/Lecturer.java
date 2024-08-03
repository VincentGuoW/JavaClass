package July2024.Class02.StaticDemo1;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String employeeID, String employeeName, String employeeDuty) {
        super(employeeID, employeeName, employeeDuty);
    }
    
    @Override
    public void work() {
        System.out.println("Lecturer work");
    }
}
