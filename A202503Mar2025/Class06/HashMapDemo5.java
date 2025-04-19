package A202503Mar2025.Class06;

import java.util.HashMap;
import java.util.Random;

public class HashMapDemo5 {
    // Student vote for vacation location
    // 80 student; four locations (ABCD)
    // SP: IF MORE STUDENT AND MORE LOCATION, THINK FURTHER
    public static void main(String[] args) {
        HashMap<String, Integer> voteHashMap = new HashMap<>();

        String keyString = "";

        for (int i = 0; i < 80; i++) {
            Random r = new Random();
            int randomNumber = r.nextInt(26);
            char locationSelectChar = (char) ('A' + randomNumber);
            keyString = String.valueOf(locationSelectChar);

            if (voteHashMap.containsKey(keyString)) {
                voteHashMap.put(keyString, voteHashMap.get(keyString) + 1);
            } else {
                voteHashMap.put(keyString, 1);
            }
        }

        voteHashMap.forEach((key, value) -> System.out.println("{" + key + " ; " + value + "}"));
    
        /*
        int max = 0;

        voteHashMap.forEach(new BiConsumer<String, Integer>() {

            @Override
            public void accept(String key, Integer value) {
                if(value>max){
                    max=value;
                }
            }
            
        });
        */
        

    }
}
