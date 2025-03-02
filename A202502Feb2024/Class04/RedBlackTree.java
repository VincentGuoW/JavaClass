package A202502Feb2024.Class04;

public class RedBlackTree {
    /*
     * 1. The new inserted node must be red.
     * 2. The root node must be black.
     * 3. Nodes without children (leaf nodes) are considered to have a Nil child, which is black.
     * 4. Two consecutive red nodes are not allowed (no red node can have a red child).
     * 5. Every path from a node to its leaf nodes must have the same number of black nodes (this is known as the black-height property).
     */

     /*
      1. Root Node ==> Always black
      
      2. Non root node ==>   Father Black  / Father Red
            A. Father Black ->  All good, no action need.

            B. Father Red   ->  Uncle Red
                            ->  Uncle Black (Child on Father Left)
                            ->  Uncle Black (Child on Father Right)
            
                
                a. Uncle Red: 
                    . Father & Uncle                change to Black
                    . Grand Father                  change to Red  (Do it first define if that's root later)
                    . If GrandFather is root        change back to Black (Root always black)
                    . If GrandFather is not root    check if grandfater change will influce anything lese
                    set grandfather as a node c if grandfather's father or grandfather need to change
                
                b. Uncle Black (Left side):
                    . Set Father to Black.
                    . Set Grand Father to Red.
                    . Rotate RIGHT from Grand Father.
                
                c. Uncle Black (Right size):
                    . Rotate Left from Father.
                    . Recheck condition
      */
}
