package July2024.Class01.a08staticdemo08;

public class Employee {
    private int id;
    private String name;
    private int pay;


    public Employee(){
        this(0, null, 0, null, "rice");
    }

    public Employee(int id, String name, int pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void work(){
        System.out.println("Depends on people");
    }

    public void lunch(){
        System.out.println("Rice");
    }

    

}
