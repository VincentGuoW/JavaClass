package A2410Oct2024.Class01;

public class A03_BlockSearchDemo2 {
    public static void main(String[] args) {
        System.out.println();
        /*
         * Use block search to find the index location
         * {27,22,30,40,36,13,19,16,20,7,10,43,50,48}
         * Test number =48
         */

        int[] arr = { 27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48 };
        
        Block b1 = new Block(40,22,0,4);
        Block b2 = new Block(20,13,5,8);
        Block b3 = new Block(10,7,9,10);
        Block b4 = new Block(50,43,11,13);

        Block[] blockList = {b1,b2,b3,b4};

        int result = indexInBlock(blockList, 48, arr);
        System.out.println(result);
        

    }

    private static int indexInBlock(Block[] blockList,int testNumber,int[] arr){
        int locationOfBlockList = blockFinder(blockList, testNumber);
        if(locationOfBlockList>=0){
            int startIndex = blockList[locationOfBlockList].getStartIndex();
            int finishIndex = blockList[locationOfBlockList].getFinishIndex();

            for (int i = startIndex; i <= finishIndex; i++) {
                if(arr[i]==testNumber){
                    return i ;
                }
            }
        }
        return -1;
    }
    private static int blockFinder(Block[] blockList,int testNumber){
        for (int i = 0; i < blockList.length; i++) {
            int max = blockList[i].getMax();
            int min = blockList[i].getMin();
            if(testNumber>=min && testNumber<=max){
                return i;
            }
        }
        return -1;
    }

    
 static class Block {
    private int max;
    private int min;
    private int startIndex;
    private int finishIndex;
    public Block() {
    }
    public Block(int max, int min, int startIndex, int finishIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.finishIndex = finishIndex;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    public int getFinishIndex() {
        return finishIndex;
    }
    public void setFinishIndex(int finishIndex) {
        this.finishIndex = finishIndex;
    }

}

}
