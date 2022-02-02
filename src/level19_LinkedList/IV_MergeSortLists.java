/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02-02-2022/02/2022
 *   Time: 11:18 AM
 *   File: IV_MergeSortLists
 */

/**
 * LEETCODE QUESTION 148 =>
 * <p>
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
 */

package level19_LinkedList;

public class IV_MergeSortLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode sortList(ListNode head) {
            ListNode mid = midNode(head);
            ListNode mid_next = mid.next;
            mid.next = null;

            ListNode list1 = sortList(head);
            ListNode list2 = sortList(mid_next);

            return mergeTwoLists(list1, list2);
        }

        public ListNode midNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
