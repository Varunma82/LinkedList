// Rotate List
// Given the head of a linked list, rotate the list to the right by k places.

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
 

// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next ==null || k==0 ) return head;

        ListNode curr = head;

        // step 1  -  calculate the  size of linked list
        int size = 1;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }

        // step 2  -  pointer curr to head of LL
        
        curr.next = head;

        k = k % size;
        k = size - k;

        // step 3  -  move curr til k > 0 and make head to curr.next and curr.next = null;

        while(k>0){
            curr=curr.next;
            k--;
        }
        
        // step - 4 

        head=curr.next;
        curr.next = null;

        return head;
    }
}
