package leetcode_2_two_sum;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int intoNextDigit = 0;
        ListNode resultList = new ListNode(0);
        ListNode lastNode = resultList;
        int flagL2Shorter = 0;
        
        while (l1.next != null || l2.next != null) {
            if (l2.next == null) {
            	flagL2Shorter = 1;
            	ListNode l2_newNode = new ListNode(0);
            	l2.next = l2_newNode;
            } else if (l1.next == null){
            	flagL2Shorter = -1;
            	ListNode l1_newNode = new ListNode(0);
            	l1.next = l1_newNode;
            }
            
            if (l1.next != null && l2.next != null) {
	            ListNode newNode = new ListNode((l1.val + l2.val + intoNextDigit) %  10);
	            lastNode.next = newNode;
	            intoNextDigit = (l1.val + l2.val + intoNextDigit) /  10;
	            
	            l1 = l1.next;
	            l2 = l2.next;
	            lastNode = lastNode.next; 
            }
        }
        
        ListNode newNode = new ListNode((l1.val + l2.val + intoNextDigit) %  10);
        lastNode.next = newNode;
        intoNextDigit = (l1.val + l2.val + intoNextDigit) /  10;
        lastNode = lastNode.next;
       
        if (intoNextDigit > 0) {
        	newNode = new ListNode(intoNextDigit);
        	lastNode.next = newNode;
        } else if (l1.next != null) {
        	lastNode.next = l1.next;
        } else if (l2.next != null) {
        	lastNode.next = l2.next;
        }
        
        return resultList.next;
    }
}