package bmpl.LinkedListOperations;

class ListNode {
	int data;
	ListNode next;
	ListNode(int val) {
		this.data = val;
		this.next = null;
	}
}

public class RemoveNthFromEnd {
	
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode dummy = new ListNode(0);
//		dummy.next = head;
//		ListNode first = dummy;
//		ListNode second = dummy;
//		for(int i = 1; i <= n + 1; i++) {
//			first = first.next;
//		}
//		while(first != null) {
//			first = first.next;
//			second = second.next;
//		}
//		second.next = second.next.next;
//		return dummy.next;
//	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode first = head;
		ListNode second = head;
		for(int i = 1; i <= n+1; i++) {
			first = first.next;
		}
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
