package A2410Oct2024.Class01;

public class A03_BlockSearchDemo1 {
    public static void main(String[] args) {
        /*
            Use block method to search array
                1. how many block  ==>  root of array.length
                2. in block random, but block in order
         */

        //{7,10,13,19,16,20,27,22,30,40,36,43,50,48}

        int[] arr = {16,5,9,12,21,18,
                    32,23,37,26,45,34,
                    50,48,61,52,73,66};


        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);
        
        Block[] blockArr = {b1,b2,b3};
        
        int testNumber =66;

    
        if(getIndex(blockArr,testNumber,arr)>=0){
            System.out.println("The index is: "+getIndex(blockArr,testNumber,arr));
        }else{
            System.out.println("Not in range");
        }


    }

    private static int getIndex(Block[] blockArr,int testNumber,int[] arr) {
        for (int i = 0; i < blockArr.length; i++) {
            if(checkBlock(blockArr, testNumber)>-1){
                int blockIndex = checkBlock(blockArr, testNumber);
                for (int j = blockArr[blockIndex].startIndex; j <= blockArr[blockIndex].endIndex; j++) {
                    if (arr[j]==testNumber){
                        return j;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    private static int checkBlock(Block[] blockArr, int testNumber){
        for (int i = 0; i < blockArr.length; i++) {
            if(blockArr[i].getMax()>=testNumber){
                return i;
            }
       }
        return -1;
    }

    
}
class Block{
        int max;
        int startIndex;
        int endIndex;
        public Block() {
        }
        public Block(int max, int startIndex, int endIndex) {
            this.max = max;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
        public int getMax() {
            return max;
        }
        public void setMax(int max) {
            this.max = max;
        }
        public int getStartIndex() {
            return startIndex;
        }
        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }
        public int getEndIndex() {
            return endIndex;
        }
        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }

        
}
