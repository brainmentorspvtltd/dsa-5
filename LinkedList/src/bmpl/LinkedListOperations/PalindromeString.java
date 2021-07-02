package bmpl.LinkedListOperations;

class CListNode {
	char data;
	CListNode next;
	public CListNode(char data) {
		this.data = data;
	}
}

public class PalindromeString {
	CListNode start;
	
	void add(char data) {
		if(start == null) {
			start = new CListNode(data);
			return;
		}
		
		CListNode temp = start;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new CListNode(data);
	}
	
	void print() {
		CListNode temp = start;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	CListNode reverseRec(CListNode currentNode, CListNode prevNode) {
		if(currentNode == null) {
			return prevNode;
		}
		CListNode nextNode = currentNode.next;
		currentNode.next = prevNode;
		return reverseRec(nextNode, currentNode);
	}
	
	boolean isPalindrome() {
		CListNode prev = null;
		CListNode slow, fast;
		CListNode midNode = null;
		slow = fast = start;
		
		// move to the middle
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		if(fast != null) {
			midNode = slow;
			slow = slow.next;
		}
		
		// making of second half
		CListNode secondHalf = slow;
		prev.next = null;
		secondHalf = reverseRec(secondHalf, null);
		boolean result = compare(start, secondHalf);
		secondHalf = reverseRec(secondHalf, null);
		if(midNode != null) {
			prev.next = midNode;
			midNode.next = secondHalf;
		}
		return result;
		
	}
	
	boolean compare(CListNode a, CListNode b) {
		while(a != null && b != null) {
			if(a.data == b.data) {
				a = a.next;
				b = b.next;
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeString obj = new PalindromeString();
		obj.add('r');
		obj.add('a');
		obj.add('v');
		obj.add('i');
		obj.add('v');
		obj.add('a');
		obj.add('r');
		obj.print();
		String result = obj.isPalindrome() ? "Palindrome" : "Not Palindrome";
		System.out.println(result);
		
	}

}
