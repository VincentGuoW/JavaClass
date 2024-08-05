package July2024.Class01.a08staticdemo08;

public class Manager extends Employee {
    private int managerBonues;

   
 


    public Manager() {
        //this.managerBonues=1000;
        //E.g. set up a pre Bonues if there's no Bonues input
    }



    public Manager(int id, String name, int pay, int managerBonues) {
        super(id, name, pay);
        this.managerBonues = managerBonues;
    }



    public Manager(int id, String name, int pay) {
        super(id, name, pay);
    }



    @Override
    public void work() {
        System.out.println("Manage people");
    }



    public int getManagerBonues() {
        return managerBonues;
    }



    public void setManagerBonues(int managerBonues) {
        this.managerBonues = managerBonues;
    }
    
    
}
