package A202503Mar2025.Class06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo3 {
    //80 Student pick one location in four for vacation
    //Find the location with the most people want to go
    public static void main(String[] args) {
        System.out.println();
        HashMap<String,Integer> voteLocation = new HashMap<>();
        voteLocation.put("A", 0);
        voteLocation.put("B", 0);
        voteLocation.put("C", 0);
        voteLocation.put("D", 0);

        for (int i = 0; i < 80; i++) {
            Random r = new Random();
            int selectLocation = r.nextInt(4);
            char resultChar = (char)('A'+selectLocation);
            String result = String.valueOf(resultChar);
            //System.out.println(result); result
            int newVoteAmount = voteLocation.get(result) + 1;
            voteLocation.put(result, newVoteAmount);
        }
        Set<Entry<String,Integer>> voteEntry = voteLocation.entrySet();
        Iterator<Entry<String,Integer>> it = voteEntry.iterator();
        int highestPick = 0;
        String finialLocation ="";
        while (it.hasNext()) {
            Entry<String,Integer> result = it.next();
            if(highestPick<result.getValue()){
                highestPick=result.getValue();
                finialLocation=result.getKey();
            }
            System.out.println("{"+result.getKey()+" ; "+result.getValue()+"}");   
        } 
        
        System.out.println("Highest pick number: " + highestPick);
        System.out.println("Location: " + finialLocation);

    }
}
