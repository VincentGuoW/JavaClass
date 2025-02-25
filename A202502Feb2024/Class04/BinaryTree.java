package A202502Feb2024.Class04;

public class BinaryTree {
    
}

/*   Binary Tree Balance
 *              7
 *              |
 *           ————————
 *          |        |
 *          4       10
 *                   |
 *                 ——————
 *                 |    |
 *                 9   11
 *                      |
 *                     ————
 *                         |
 *                         12
 * 
 * *          
 *                      10
 *                      |
 *                 ———————————
 *                 |         |
 *                 7        11
 *                 |         |
 *               ——————     ————
 *               |    |         |
 *               4    9        12
 *      
 * 
 * 1. From last added to find the first unbalance node
 * 2. Rotate from the node
 * 3. Node rise and the other side go down (FIRST)
 * 4. Add the rotate node remain nodes into the go down side!!! (Then)
 */
