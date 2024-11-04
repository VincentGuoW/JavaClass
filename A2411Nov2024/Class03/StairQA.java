package A2411Nov2024.Class03;

public class StairQA {
    public static void main(String[] args) {
        //Sam take stair one or two step each time
        //20 stairs
        //no comeing back
        //how many options
        System.out.println();
        System.out.println(optionCal(20));
    }

    public static int optionCal(int stairs){
        if(stairs==1){
            return 1;
        }
        if(stairs==2){
            return 2;
        }
       
        return optionCal(stairs-1)+optionCal(stairs-2);
    }
}
