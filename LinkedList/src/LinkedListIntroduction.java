//class Node {
//	int data;
//	Node next;
//	Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//}

//Node with Template
class Node<T> {
	T data;
	Node<T> next;
	Node(T data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node n1 = new Node(100);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
//		Creating the objects of nodes
		Node<Integer> n1 = new Node<>(100);
		Node<Integer> n2 = new Node<>(200);
		Node<Integer> n3 = new Node<>(300);
		Node<Integer> n4 = new Node<>(400);
		
//		Connecting nodes
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
//		Node<Integer> start = n1;
//		while(start != null) {
//			System.out.println(start.data);
//			start = start.next;
//		}
		
	}

}
