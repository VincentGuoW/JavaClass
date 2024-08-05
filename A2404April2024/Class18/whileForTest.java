package April2024.Class18;

public class whileForTest {
    //Height 8844430
    //PaperThick 0.1
    
    public static void main(String[] args) {
        double height = 8844430;
        double PaperThick = 0.1;
        int i=0;
        for (; PaperThick<height; i++) {
            PaperThick = PaperThick*2;
        }
        // for (int i=1; PaperThick<height; i++) {
        //     PaperThick = PaperThick*2;
        // }
        System.out.println(i);

        double PaperThick1 = 0.1;
        int j =0;
        while(PaperThick1<height){
            PaperThick1 = PaperThick1*2;
            j++;
        }
        System.out.println(j);
    }
}
