import java.util.LinkedList;

class G {
	String t;
	int e;
	G(String t, int e) {
		this.t = t;
		this.e = e;
	}
}


public class FullMemory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		System.out.println("Execution Started...");
		while(true) {
			G obj = new G("hello",10);
			link.add(obj);
			Thread.sleep(40);
		}
	}

}
