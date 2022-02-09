/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09-02-2022/02/2022
 *   Time: 06:30 PM
 *   File: II_LevelOrderLineWise
 */

package level21_binaryTree;

import java.util.Scanner;

public class II_LevelOrderLineWise {
    private final Node root;
    Scanner scanner = new Scanner(System.in);

    public II_LevelOrderLineWise(Node root) {
        this.root = createTree();
    }

    private Node createTree() {
        int item = scanner.nextInt();
        Node newNode = new Node(item);
        boolean hasLeftChild = scanner.nextBoolean();

        if (hasLeftChild) {
            newNode.left = createTree();
        }

        boolean hasRightChild = scanner.nextBoolean();

        if (hasRightChild) {
            newNode.right = createTree();
        }
        return newNode;
    }

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
}
