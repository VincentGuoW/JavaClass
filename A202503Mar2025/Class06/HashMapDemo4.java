package A202503Mar2025.Class06;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapDemo4 {
    /*
     * Four location ABCD
     * Student vote and find the highest pick
     */
    public static void main(String[] args) {
        HashMap<Student, String> voteHashMap = new HashMap<>();
        Student st1 = new Student("TOM", 12);
        Student st2 = new Student("SAM", 23);
        Student st3 = new Student("LU", 123);
        Student st4 = new Student("GITA", 1212);
        Student st5 = new Student("TINA", 112);

        voteHashMap.put(st1, "A");
        voteHashMap.put(st2, "C");
        voteHashMap.put(st3, "B");
        voteHashMap.put(st4, "A");
        voteHashMap.put(st5, "D");

        int[] voteArray = new int[4];
        char[] voteLocation = {'A','B','C','D'};
        voteHashMap.forEach(new BiConsumer<Student, String>() {

            @Override
            public void accept(Student student, String vote) {
                switch (vote) {
                    case "A":
                        voteArray[0]++;
                        break;
                    case "B":
                        voteArray[1]++;

                        break;
                    case "C":
                        voteArray[2]++;

                        break;
                    case "D":
                        voteArray[3]++;

                        break;
                    default:
                        break;
                }
            }

        });
        
        int maxIndexVoteArray = 0;
        for (int i = 0; i < voteArray.length; i++) {
            if(voteArray[i]>voteArray[maxIndexVoteArray]){
                maxIndexVoteArray=i;
            }
        }
        System.out.println("The most voted location is: " + voteLocation[maxIndexVoteArray]);
    }
}
