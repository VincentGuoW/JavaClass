package May2024.Class04;

import java.util.Scanner;

public class test5 {
    // average score => take away one highest one lowest
    public static void main(String[] args) {
        
        int numOfJudge= 6;
        int[] scores = new int[numOfJudge];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numOfJudge;i++) {
            System.out.println("Judge " + (i+1) +" Input your score:");
            for (int j = 0; j < 1;) {
                int scoreTest = sc.nextInt();
                if(scoreTest>=0 && scoreTest<=100){
                    scores[i]=scoreTest;
                    j++;
                }else{
                    System.out.println("Please input the right score for Judge "+(i+1));
                }
            }
            
            
        }

        int averageScore=0;
        int highScore=0;
        int lowScore=scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]< lowScore){
                lowScore=scores[i];
            }
            if(scores[i]>highScore){
                highScore=scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            averageScore+= scores[i];
        }
        averageScore= (averageScore-highScore-lowScore)/(scores.length-2);
        System.out.println(averageScore);
    }

}
