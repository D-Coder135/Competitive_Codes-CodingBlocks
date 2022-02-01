/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-02-2022/02/2022
 *   Time: 11:23 AM
 *   File: I_CycleRemoval
 */

/**
 * CODING BLOCKS QUESTION =>
 * <p>
 * Write a code to remove the cycle present in the linked list.
 */

package level19_LinkedList;

public class I_CycleRemoval {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode head;
    public ListNode size;

    static class Solution {

        // Floyd Cycle detection Method
        public static ListNode meetingPoint() {
            ListNode slow = head;
        }
    }
}
