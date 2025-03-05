package A202503Mar2025.Class01;

public class SetDemo4 {
    public static void main(String[] args) {
        /*
         * There are three part of HashSet (Array, Linklist, RedBlackTree)
         * 
         * Array    0   1   2   3   4   5   6   7   ... 15
         *          |           |
         *          |          / \
         *      LinkList    Red_BlackTree
        */

        /*
         * 1. Save and get not the same order:
         *      When save we can just jump to index: int index = (Array.length-1)&HashCode;
         *      When get  we must go from the first value to check it.
         * 
         * 2. There no index for HashSet:
         *      index in pic just for easy understanding.
         *      They have Linklist/RedBlack Tree, they can't share same index
         * 
         * 3. HashSet have no repeat:
         *      HashCode ==> Location to store it
         *      equals   ==> Value inside if the same
         */
        System.out.println();
        //1. If not rewrite HashCode --> Diff Address == Diff HashCode
        //2. If rewrite HashCode --> Same Value == Same HashCode

        //HashSet JDK8 & Before(HashCode location): 
        //int index = (Array.length-1)&HashCode;

        int result = (16-1)& 2613467; 

        //change to binary==> check each digit in binary
        //If both digit ==1, return 1, otherwise return 0,
        // then return to decimal

        System.out.println(result);//==>  11 
        //If location index 11 == null ==> save at location 11
        //If location index 11 != null ==> if same value don't save
        //                                 if diff value ==> save , save as linked List
    
    
        //JDK 8 & Before: old value got pushed below new value. New value on top.
        //JDK 9 & After : new value got pushed below old value. Old value on top.
    
    
        /*
         * Size of the HashSet:
         * Increase to double when get 0.75 max amount
         * E.g. start with 16 index, when 16*0.75=12 installed.
         *      index increase to 32.(Double it)
         * 
         */

         /*
          * When Linked list >8  && index of the array >64
                LinkedList will change to RedBlack Tree
          */
    }
}
