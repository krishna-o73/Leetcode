//https://leetcode.com/problems/partition-list/
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode current = head; 
        ListNode lessDummy = new ListNode(0);   
        ListNode lessTail = lessDummy;          
        ListNode greaterDummy = new ListNode(0); 
        ListNode greaterTail = greaterDummy;    
        while (current != null) {
            if (current.val < x) {
                lessTail.next = new ListNode(current.val);
                lessTail = lessTail.next; // Move the tail pointer
            } else {
                greaterTail.next = new ListNode(current.val);
                greaterTail = greaterTail.next; // Move the tail pointer
            }
            current = current.next; // Move to the next node
        }
        lessTail.next = greaterDummy.next;
        return lessDummy.next;
    }
}
