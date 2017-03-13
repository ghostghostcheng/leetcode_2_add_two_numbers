package leetcode_2_two_sum;
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int intoNextDigit = 0;
        ListNode resultList = new ListNode(0);
        ListNode lastNode = resultList;
        
        if (l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        
        while (l1 != null || l2 != null) {
        	int l1_val = 0;
        	int l2_val = 0;
        	
        	if (l1 != null) {
        		l1_val = l1.val;
        		l1 = l1.next;
        	} 
        	if (l2 != null) {
        		l2_val = l2.val;
        		l2 = l2.next;
        	} 
        	
            ListNode newNode = new ListNode((l1_val + l2_val + intoNextDigit) %  10);
            lastNode.next = newNode;
            intoNextDigit = (l1_val + l2_val + intoNextDigit) /  10;
            lastNode = lastNode.next; 
        }
       
        if (intoNextDigit > 0) {
        	ListNode newNode = new ListNode(intoNextDigit);
        	lastNode.next = newNode;
        }
        
        return resultList.next;
    }
}