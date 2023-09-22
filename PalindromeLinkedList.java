// Palindrome Linked List
// Given the head of a singly linked list, return true if it is a 
// palindrome
//  or false otherwise.

 

// Example 1:


// Input: head = [1,2,2,1]
// Output: true
// Example 2:


// Input: head = [1,2]
// Output: false

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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=new ListNode();
        ListNode temp=new ListNode();
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        prev=slow;
        slow=slow.next;
        prev.next=null;
        while(slow!=null){
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        fast=head;
        slow=prev;
        while(slow!=null){
            if(slow!=null){
                if(fast.val!=slow.val){
                    return false;
                }
                fast=fast.next;
                slow=slow.next;
            }
        }
        return true;
    }
}
