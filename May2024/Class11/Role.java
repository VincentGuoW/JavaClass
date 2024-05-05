package May2024.Class11;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces={"AA","BB","CC","DD","EE","FF"};
    String[] girlfaces={"aa","bb","cc"};

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if(gender=='M'){
            int index = r.nextInt(this.boyfaces.length);
            this.face = boyfaces[index];
        }
        else{
            int index = r.nextInt(this.girlfaces.length);
            this.face = girlfaces[index];
        }
       
    }

   
    
    public Role(){
    }

    public Role( String name, int blood, char gender){
        this.name= name;
        this.blood=blood;
        this.gender=gender;
        setFace(gender);

        
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

        System.out.println("Name: " + this.name);
        System.out.println("Name: " + this.blood);
        System.out.println("Name: " + this.gender);
        System.out.println("Name: " + this.face);
        System.out.println("Name: " + role.name);
        System.out.println("Name: " + role.blood);
        System.out.println("Name: " + role.gender);
        System.out.println("Name: " + role.face);
    }
}
