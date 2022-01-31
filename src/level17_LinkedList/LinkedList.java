/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 31-01-2022/01/2022
 *   Time: 12:15 PM
 *   File: LinkedList
 */

package level17_LinkedList;

public class LinkedList {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }
    }

    private Node head;
    private int size;
    private Node tail;
}
