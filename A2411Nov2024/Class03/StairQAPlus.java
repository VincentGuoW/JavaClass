package A2411Nov2024.Class03;

public class StairQAPlus {
    public static void main(String[] args) {
        //Sam take stair one or two or three step each time
        //20 stairs
        //no comeing back
        //how many options
        System.out.println();
        System.out.println(optionCal(20));
    }
    /*
    Idea!!!:
        For this case, take 1/2/3 stairs at a time==>
        level n options = optionCal(n-1) + optionCal(n-2) + optionCal(n-3);
            think: 
                take 1 stairs to ideal floor => optionCal(n-1) 
                take 2 stairs to ideal floor => optionCal(n-2) 
                take 3 stairs to ideal floor => optionCal(n-3) 
            !!! take 1 stair then take 2 stairs included in take 2 stairs!!!
    In short just add three options together.
        take 1 stairs all potions + 2 stairs potions + 3 stairs options

     */

    public static int optionCal(int stairs){
        if(stairs==1){
            return 1;
        }
        if(stairs==2){
            return 2;
        }
        if(stairs==3){
            return 4;
        }
        return optionCal(stairs-1)+optionCal(stairs-2)+optionCal(stairs-3);
    }
}
