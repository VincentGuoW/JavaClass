package May2024.Class09;

import java.util.Scanner;

public class FightGame {
    /*
        Name:xxx
        HP(Health Point):100
    */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the world champing fight host by vincent!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first character Name: ");
        CharacterInfo characterOne = new CharacterInfo(sc.nextLine(),100);

        System.out.println("Please enter second character Name: ");
        CharacterInfo characterTwo = new CharacterInfo(sc.nextLine(),100);

        System.out.println("OK lets fight!");
        FightRound fRounds = new FightRound();
        int round=1;
        while(characterOne.characterAlive() && characterTwo.characterAlive()){
         
            System.out.println("------------------------------------ROUND " + round +" START!------------------------------------");
        
            fRounds.setRound(round);
            //character 1 fight first! made dmg to character 2.
            fRounds.hostSpeach(characterOne.getName(),characterOne.getHp(), characterTwo.gotDmg());
            if(!characterTwo.characterAlive()){
                break;
            }

            //character 2 made dmg to character 1.
            fRounds.hostSpeach(characterTwo.getName(),characterTwo.getHp(), characterOne.gotDmg());
            
            System.out.println("------------------------------------ROUND " + round +" Finished!------------------------------------");
            System.out.println("Round "+ round + " " + 
            characterOne.getName() +"("+ characterOne.getHp() +")" +
            " VS " +
            characterTwo.getName() +"("+ characterTwo.getHp() +")");
            round++;
        }

        if(characterOne.characterAlive()==true){
            System.out.println("We have a winner!!!!! ===>" + characterOne.getName());
        }
        else{
            System.out.println("We have a winner!!!!! ===>" + characterTwo.getName());
        }
       
    }

    
}
