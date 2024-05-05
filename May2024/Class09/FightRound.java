package May2024.Class09;

import java.util.Scanner;

public class FightRound {
    private int round = 1;

    public FightRound() {
    }

    public FightRound(int round){
        System.out.println("Round " + this.round + " !");
    }
    

    public void setRound(int round){
        this.round=round;
    }
    public int getRound(){
        return this.round;
    }

    public void hostSpeach(String name,int hp, int dmg){
        
        Scanner sc = new Scanner(System.in);
        System.out.println(name + "(" + hp + ")" + " please make your "+this.round+" move!");
        String moveName = sc.next();
        System.out.println(name + "(" + hp + ")" + " used "+moveName+" ! Dmg " +dmg+ " has been made!" );
       
    }

    
        
    

}
