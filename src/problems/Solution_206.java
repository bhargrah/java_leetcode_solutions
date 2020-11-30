package problems;

class ListNode {
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

public class Solution_206 {

/**
 * @author rahulbhargava
 * @category 206. Reverse Linked List
 * @see https://leetcode.com/problems/reverse-linked-list/submissions/
 */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {
		
		ListNode current = head;
		ListNode previous = null;
		ListNode newHead = null;
		ListNode next = null;
		
		// a -> b -> c -> d
		while(current!=null) {	
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		newHead = previous;
		return newHead;

	}

}
