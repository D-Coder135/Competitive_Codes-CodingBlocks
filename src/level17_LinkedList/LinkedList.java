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

    public void addFirst(int item) {
        Node newNode = new Node(item);

        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        }
    }

    public void addLast(int item) {
        if (this.size == 0) {
            addFirst(item);
        } else {
            Node newNode = new Node(item);
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    public void addAtIndex(int index, int item) throws Exception {
        if (index < 0 || index > this.size) {
            throw new Exception("Index not within the range.");
        }
        if (index == 0) {
            addFirst(item);
        } else if (index == this.size) {
            addLast(item);
        } else {
            Node newNode = new Node(item);
        }
    }


    private Node getNode(int k) throws Exception {
        if (k < 0 || k >= this.size) {
            throw new Exception("Index not within the range.");
        }
        Node temp = this.head;

        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
