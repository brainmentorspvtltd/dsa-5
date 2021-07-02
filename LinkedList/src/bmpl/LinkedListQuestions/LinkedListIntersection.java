package bmpl.LinkedListQuestions;

class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListIntersection {
	static Node head1, head2;
	
	int getSize(Node node) {
		Node current = node;
		int count = 0;
		while(current != null) {
			count ++;
			current = current.next;
		}
		return count;
	}
	
	int getNode() {
		int c1 = getSize(head1);
		int c2 = getSize(head2);
		int d;
		if(c1 > c2) {
			d = c1 - c2;
			return getIntersection(d, head1, head2);
		}
		else {
			d = c2 - c1;
			return getIntersection(d, head2, head1);
		}
	}
	
	int getIntersection(int d, Node n1, Node n2) {
		int i;
		Node current1 = n1;
		Node current2 = n2;
		for(i = 0; i < d; i++) {
			if(current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while(current1 != null && current2 != null) {
			if(current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
	
	void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println("Node is :: " + temp.data);
			temp = temp.next;
		}
		System.out.println("=====================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListIntersection obj = new LinkedListIntersection();
		head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);
		head1.next.next.next.next = new Node(50);
		
		obj.print(head1);
		
		head2 = new Node(11);
		head2.next = new Node(12);
		head2.next.next = new Node(13);
		head2.next.next.next = new Node(40);
		head2.next.next.next.next = new Node(50);
		obj.print(head2);
		
		System.out.println(obj.getNode());
		
	}

}
