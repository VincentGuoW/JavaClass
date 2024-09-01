package A2409Sep2024.Class01;

public class NarcissisticNumber {
    //E.g.  153 = 1^3 + 5&3
    public static void main(String[] args) {
        // System.out.println();
        // int num= 153;
        // int numLength=0;
        // int inputNumber=num;
        // while (inputNumber>0) {
        //     inputNumber=inputNumber/10;
        //     numLength++;
        // }

        System.out.println("START");
        int numLength=5;

        int startNum = 1*(int)Math.pow(10, numLength-1);

        int endNum=0;
        for (int i = 0; i < numLength; i++) {
            endNum=endNum*10+9;
        }


        for (int i = startNum; i < endNum; i++) {
            int result=0;
            for (int j = 0; j < numLength; j++) {
                int dig =(i/((int)Math.pow(10, j)))%10;
                result=result +(int)Math.pow(dig, numLength);
            }

            if(result==i){
                System.out.println(i);
            }
        }
        System.out.println("End");

    }
}
