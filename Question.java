package leetcode_2_two_sum;

public class Question {
	public static void main(String args[]) {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(1);
		ListNode resultList = new ListNode(0);
		
		l1.next = new ListNode(8);
		//l1.next.next = new ListNode(3);
		//l1.next.next.next = new ListNode(2);
		
		//l2.next = new ListNode(6);
		//l2.next.next = new ListNode(4);
		
		resultList = Solution.addTwoNumbers(l1,l2);
		
		while(resultList != null) {
			System.out.print(resultList.val);
			resultList = resultList.next;
		}
	}
}
