package May2024.Class04;

public class test11 {
    /*
        session1 {22,66,44}
        session2 {77,33,88}
        session3 {25,45,65}
        session4 {11,66,99}
     */
    public static void main(String[] args) {
        
        int totalIncome=0;

        int[][] totalArray = new int[][]{
            {22,66,44},
            {77,33,88},
            {25,45,65},
            {11,66,99},
        };

        for (int i = 0; i < totalArray.length; i++) {
            int sessionIncome=0;
            for (int j = 0; j < totalArray[i].length; j++) {
                sessionIncome+=totalArray[i][j];
            }
            System.out.println("Session " + (i+1)+" : " +sessionIncome);
            totalIncome+=sessionIncome;
        }
        System.out.println("Total " +" : " +totalIncome);
        
    }
}
