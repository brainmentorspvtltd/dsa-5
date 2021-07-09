public class CircularQueue {
	
	private int array[];
	private int rear;
	private int front;
	private final int DEFAULT_CAPACITY = 10;
	public CircularQueue() {
		array = new int[DEFAULT_CAPACITY];
		rear = front = 0;
	}
	public CircularQueue(int capacity) {
		if(capacity < 1) {
			throw new RuntimeException("Invalid capacity...");
		}
		array = new int[capacity];
		rear = front = 0;
	}
	private int getSize() {
		return rear;
	}
	
	private boolean isEmpty() {
		return rear == 0;
	}
	
	void enQueue(int data) {
		if(rear == array.length) {
			throw new RuntimeException("Queue is Full...");
		}
		int availIndex = (front + rear) % array.length;
		array[availIndex] = data;
		rear++;
	}
	
	int dequeue() {
		if(rear == 0) {
			throw new RuntimeException("Queue is Empty...");
		}
		int value = array[front];
		array[front] = 0;
		front = (front + 1) % array.length;
		rear--;
		return value;
	}
	
	int getFront() {
		if(rear == 0) {
			throw new RuntimeException("Queue is Empty...");
		}
		int value = array[front];
		return value;
	}
	
	void print() {
		for (int i = 0; i < rear; i++) {
			int availIndex = (front + i) % array.length;
			System.out.println(array[availIndex]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq = new CircularQueue(4);
		cq.enQueue(10);
		cq.enQueue(20);
		cq.enQueue(30);
		cq.enQueue(40);
		
		cq.dequeue();
		cq.enQueue(50);
		
		cq.dequeue();
		cq.enQueue(60);
	}

}
