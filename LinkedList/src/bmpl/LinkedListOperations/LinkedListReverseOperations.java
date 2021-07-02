package bmpl.LinkedListOperations;

class LinkedListNode {
	int data;
	LinkedListNode next;
	public LinkedListNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}

public class LinkedListReverseOperations {
	private LinkedListNode start;
	
	void insert(LinkedListNode node) {
		if(start == null) {
			start = node;
			return;
		}
		LinkedListNode current = start;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
	}
	
	// calculate the length of linked list
	int getSize() {
		LinkedListNode temp = start;
		int size = 0;
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	// Get node at a particular index
	LinkedListNode getNode(int index) {
		int size = getSize();
		if(size == 0) {
			System.out.println("LinkedList in Blank...");
		}
		if(index < 0 || index >= size) {
			System.out.println("Invalid Index...");
		}
		LinkedListNode temp = start;
		for(int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	void reverseData() {
		int left = 0;
		int right = getSize() - 1;
		while(left < right) {
			LinkedListNode leftNode = getNode(left);
			LinkedListNode rightNode = getNode(right);
			int temp = leftNode.data;
			leftNode.data = rightNode.data;
			rightNode.data = temp;
			left++;
			right--;
		}
	}
	
	void print() {
		LinkedListNode temp = start;
		while(temp != null) {
			System.out.println("Node is :: " + temp.data);
			System.out.println("Address is :: " + temp.next);
			temp = temp.next;
		}
		System.out.println("===========================");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListReverseOperations obj = new LinkedListReverseOperations();
		obj.insert(new LinkedListNode(101));
		obj.insert(new LinkedListNode(110));
		obj.insert(new LinkedListNode(102));
		obj.insert(new LinkedListNode(104));
		obj.insert(new LinkedListNode(108));
		
		System.out.println("Before data reverse...");
		obj.print();
		
		System.out.println("After data reverse...");
		
		obj.reverseData();
		obj.print();
		
	}

}
