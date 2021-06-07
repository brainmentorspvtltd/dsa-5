class RR {
	int x, y;
	RR(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Object Created...");
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object Destroyed...");
	}
}

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RR obj = new RR(10,20);
		obj = null;	// 1st way
		
		System.gc();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
//		2nd way
		RR obj2 = new RR(20,30);
		RR obj3 = new RR(20,30);
		obj3 = obj2;
		
//		3rd way
		if(5 > 3) {
			RR obj4 = new RR(20,30);
			// outside the scope it is eligible for garbage collection
		}
		
	}

}
