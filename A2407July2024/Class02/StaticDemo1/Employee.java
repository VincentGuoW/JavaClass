package July2024.Class02.StaticDemo1;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String employeeDuty;
    public Employee(){}
    public Employee(String employeeID, String employeeName, String employeeDuty) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeDuty = employeeDuty;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeDuty() {
        return employeeDuty;
    }
    public void setEmployeeDuty(String employeeDuty) {
        this.employeeDuty = employeeDuty;
    }

    public void work(){
        System.out.println("EVERYONE HAS WORK");
    }
    
    
}
