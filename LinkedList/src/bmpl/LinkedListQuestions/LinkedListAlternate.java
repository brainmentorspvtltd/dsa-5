package bmpl.LinkedListQuestions;

class ListNode {
	
}

public class LinkedListAlternate {
	ListNode start;
	ListNode tail;
	ListNode first = null, second = null, current;
	ListNode firstTail = null, secondTail = null;
	
	void add() {
		
	}
	
	void print() {
		
	}
	
	void approach() {
		current = start;
		boolean alternate = true;
		while(current != null) {
			move(current, alternate);
			alternate = !alternate;
		}
	}
	
	void move(ListNode current, boolean alternate) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
