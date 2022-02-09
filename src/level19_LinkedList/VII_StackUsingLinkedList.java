/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09-02-2022/02/2022
 *   Time: 11:30 AM
 *   File: VII_StackUsingLinkedList
 */

/**
 * Create Stack Using Linked List. Note that the pop and push operation should be performed in the O(1) time complexity.
 */

package level19_LinkedList;

import java.util.LinkedList;

public class VII_StackUsingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        // For push operation in O(1), addFirst() method of LinkedList will be used.
        stack.addFirst(40);
        stack.addFirst(30);
        stack.addFirst(50);
        stack.addFirst(10);
        stack.addFirst(20);

        // For pop operation in O(1), remove()[removeFirst()] method of LinkedList will be used.
        System.out.println(stack.remove());
    }
}
