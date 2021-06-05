class X {
	X() {
		System.out.println("Default constructor of X");
	}
	X(int x) {
		this(); // it will call X default const.
		System.out.println("X param const call");
	}
}

class Y extends X {
	Y() {
//		super(); // - it is written internally...
		super(100); // it will call X param const.
		System.out.println("Default constructor of Y");
	}
//	Y (int x, int y) {
//		System.out.println("Y 2 param const. call...");
//	}
	Y(int x) {
//		super(); // it is internally written...
//		super(100); // explicit call
		this(); // it will call Y default const.
		System.out.println("Y param const call...");
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y obj = new Y(10);
	}

}
