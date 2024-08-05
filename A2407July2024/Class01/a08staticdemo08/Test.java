package July2024.Class01.a08staticdemo08;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(001, "Vincent", 3000, 1000);    
        System.out.println(manager.getId());
        System.out.println(manager.getName());
        System.out.println(manager.getPay());
        System.out.println(manager.getManagerBonues());
        manager.lunch();
        manager.work();

    }
}
