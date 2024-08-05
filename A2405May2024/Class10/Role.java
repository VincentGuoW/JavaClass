package May2024.Class10;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    
    public Role(){
    }

    public Role( String name, int blood){
        this.name= name;
        this.blood=blood;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getBlood(){return blood;}
    public void setBlood(int blood){this.blood=blood;}

    public void attack (Role role){//use Role role so that can use everything inside that role.
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        int remainBlood = role.getBlood()-hurt;
        remainBlood =remainBlood < 0 ? 0:remainBlood; //check if less than 0, turn in to zero, or just remain same!
        
        role.setBlood(remainBlood);
        
        System.out.println(
        this.getName()+
        " hit " +
        role.getName() +
        " once and damaged " +
        hurt +
        " to "+
        role.getName()+
        " left " +
        remainBlood);
    }
}
