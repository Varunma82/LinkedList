// Search in a Linked List
// Problem Statement
// Suggest Edit
// You are given a Singly Linked List of integers with a head pointer. Every node of the Linked List has a value written on it.


// A sample Linked List:
// Sample Linked List
// Now you have been given an integer value, 'K'. Your task is to check whether a node with a value equal to 'K' exists in the given linked list. Return 1 if node exists else return 0.
// Detailed explanation ( Input/output format, Notes, Images )
// keyboard_arrow_down
// Sample Input 1:
// 3 6 2 7 9 -1
// 2
// Sample Output 1:
// 1
// Explanation For Sample Input 1:
// As value 2 exists in the given linked list. So we will return 1 in this case.
// alt img

// Sample Input 2:
// 1 2 3 7 -1
// 7
// Sample Output 2:
// 1
// Explanation For Sample Input 2:
// As the value 7 exists in the Linked List, our answer is 1.
public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        while(head!=null){
            if(head.data==k)
                return 1;
                head=head.next;
            
        }
        return 0;
    }
}
