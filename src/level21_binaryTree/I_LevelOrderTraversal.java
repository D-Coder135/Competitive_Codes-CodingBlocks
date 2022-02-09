/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09-02-2022/02/2022
 *   Time: 12:10 PM
 *   File: I_LevelOrderTraversal
 */

package level21_binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class I_LevelOrderTraversal {

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

    private final Node root;
    Scanner scanner = new Scanner(System.in);

    public I_LevelOrderTraversal() {
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
        return newNode;
    }

    public void levelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            Node value = queue.remove();
        }
    }
}
