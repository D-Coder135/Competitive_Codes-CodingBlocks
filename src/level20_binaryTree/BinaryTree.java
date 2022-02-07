/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 07-02-2022/02/2022
 *   Time: 10:21 PM
 *   File: BinaryTree
 */

package level20_binaryTree;

import java.util.Scanner;

public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }
    }


    private Node root;

    public BinaryTree() {
        this.root = createTree(null);
    }

    private Node createTree(Node parentNode) {

    }
}
