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

    Scanner scanner = new Scanner(System.in);
    private Node root;

    public BinaryTree() {
        this.root = createTree(null);
    }

    private Node createTree(Node parentNode) {
        int item = scanner.nextInt();
        Node newNode = new Node(item);
        boolean hasLeftChild = scanner.nextBoolean();

        if (hasLeftChild) {
            newNode.left = createTree(newNode);
        }

        boolean hasRightChild = scanner.nextBoolean();

        if (hasRightChild) {
            newNode.right = createTree(newNode);
        }

    }
}
