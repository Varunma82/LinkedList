// Merge Two Sorted Lists
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.
// Example 1:
// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:
// Input: list1 = [], list2 = []
// Output: []
// Example 3:
// Input: list1 = [], list2 = [0]
// Output: [0]

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode temp=ans;
        ListNode one=list1;
        ListNode two=list2;
        while(one!=null && two!=null){
            if(one.val<two.val){
                
                ListNode first=new ListNode();
                temp.next=first;
                first.val=one.val;
                one=one.next;
                temp=temp.next;
            }else{
                ListNode first=new ListNode();
                temp.next=first;
                first.val=two.val;
                two=two.next;
                temp=temp.next;
            }
        }
        
        if(one!=null){
            temp.next=one;
        }
        if(two!=null){
            temp.next=two;
        }
        return ans.next;
    }
}
