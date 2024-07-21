package July2024.Class01.a02staticdemo02;

public class TestDemo {
    public static void main(String[] args) {
        double[] arrDouble = {1.2,2.3,3.5,4.4,5,6};
        int[] arrInt = {1,2,3,4,5,6};
        String arrList = ArrayUtil.printArr(arrInt);
        double resulte = ArrayUtil.getAverage(arrDouble);
        System.out.println(arrList);
        System.out.println(resulte);
    }
}
