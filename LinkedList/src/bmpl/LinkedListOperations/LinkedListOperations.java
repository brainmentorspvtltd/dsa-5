package bmpl.LinkedListOperations;

class Node<T> {
	T data;
	Node<T> next;
	Node(T data) {
		this.data = data;
		this.next = null;
	}
	public String toString() {
		return "Node :: " + data + " Pointer :: " + next;
	}
}

public class LinkedListOperations<T> {
	private Node<T> start;
	void insertAtEnd(Node<T> node) {
		if(start ==  null) {
			start = node;
			return;
		}
		Node<T> current = start;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
	}
	
	void insertAtBeg(Node<T> node) {
		if(start == null) {
			start = node;
			return;
		}
		node.next = start;
		start = node;
	}
	
	void insertAtMid(Node<T> node, int pos) {
		if(start == null) {
			start = node;
			return;
		}
		if(pos == 0) {
			node.next = start;
			start = node;
			return;
		}
		if(pos > 0) {
			int i = 1;
			Node<T> temp = start;
			while(i < pos) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}
	
	void deleteInMid(int pos) {
		Node<T> temp = null;
		if(start == null) {
			System.out.println("Linked List is empty...");
			return;
		}
		if(pos == 0) {
			temp = start.next;
			start = temp;
			return;
		}
		temp = start;
		int i = 1;
		while(i < pos) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
	}
	
	void reverseIterate() {
		if(start == null) {
			System.out.println("List is Empty, Can't Reverse");
		}
		if(start.next == null) {
			System.out.println("Only One Element is available");
			return;
		}
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		while(currentNode != null) {
			Node<T> nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		start = previousNode;
	}
	
	Node reverseRec(Node<T> currentNode, Node<T> PreviousNode) {
		// Logic...
		return reverseRec(currentNode, PreviousNode);
	}
	
	void midPoint() {
		Node<T> slow;
		Node<T> fast;
		if(start != null) {
			fast = slow = start;
			while(fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("Mid Point is :: " + slow.data);
		}
	}
	
	void findNthFromLast(int n) {
		Node<T> p;
		Node<T> q;
		p = q = start;
		for(int i = 1; i <= n; i++) {
			q = q.next;
		}
		while(q != null) {
			p = p.next;
			q = q.next;
		}
		System.out.println(p.data);
	}
	
//	void detectLoop() {
//		Node<T> slow = start;
//		Node<T> fast = start;
//		if(start != null) {
//			while(fast != null && fast.next != null) {
//				slow = slow.next;
//				fast = fast.next.next;
//				if(slow == fast) {
//					System.out.println("Cycle is present...");
//					return;
//				}
//			}
//			System.out.println("No Cycle Present...");
//		}
//	}
	
	void detectRemoveLoop() {
		Node<T> slow = start;
		Node<T> fast = start;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Loop Detected...");
				break;
			}
		}
		if(slow != fast) {
			System.out.println("No Loop Detected...");
			return;
		}
		slow = start;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next.next;
		}
		fast.next = null;
	}
	
	void print() {
		Node<T> temp = start;
		while(temp != null) {
			System.out.println("Node is :: " + temp.data);
			temp = temp.next;
		}
		System.out.println("=====================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations<Integer> operations = new LinkedListOperations<Integer>();
		
//		Insert Operations
		operations.insertAtEnd(new Node<Integer>(100));
		operations.insertAtEnd(new Node<Integer>(200));
		operations.insertAtEnd(new Node<Integer>(300));
		operations.insertAtEnd(new Node<Integer>(400));
		
		operations.insertAtBeg(new Node<Integer>(99));
		
		operations.insertAtMid(new Node<Integer>(55), 2);
		operations.insertAtMid(new Node<Integer>(155), 4);
		
		operations.print();
		
//		Delete Operations
		operations.deleteInMid(3);
		operations.print();
		
//		operations.deleteInMid(2);
//		operations.print();
		
//		Reverse Iterate
//		operations.reverseIterate();
//		operations.print();
		
//		Mid Point
		operations.midPoint();
		
		operations.findNthFromLast(4);
	}

}
