public class QueueUsingArray {
	
	int data[];
	int front;
	int rear;
	int size;
	
	public QueueUsingArray(int len) {
		data = new int[len];
		front = rear = -1;
		size = 0;
	}
	
	int getSize() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	int getFrontValue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty...");
		}
		return data[front];
	}
	
	void enqueue(int element) {
		if(size == data.length) {
			throw new RuntimeException("Queue is Full...");
		}
		if(size == 0) {
			front = 0;
		}
		rear++;
		size++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = element;
	}
	
	int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty...");
		}
		int temp = data[front];
		front++;
		if(front == data.length) {
			front = 0;
		}
		size--;
		if(isEmpty()) {
			front = rear = -1;
		}
		return temp;
	}
	
	void dequeue_2() {
		if(isEmpty()) {
			return;
		}
		for(int i = 0; i < size-1; i++) {
			data[i] = data[i+1];
		}
		size--;
	}
	
	void print() {
		while(!isEmpty()) {
			System.out.println(dequeue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray q = new QueueUsingArray(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.print();
	}

}
