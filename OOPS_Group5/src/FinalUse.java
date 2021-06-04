//S O L I D
//SRP
//DRY
//O - Open Close Principle
//  - class is open for extension, but close for modification

//final class Parent {
//	
//}
//
//class Child extends Parent {
//	
//}

class Parent {
	private int x;
//	final void show() {
//		System.out.println("Show function...");
//	}
	
	private final void show() {
		System.out.println("Show function...");
	}
}

class Child extends Parent {
//	@Override
	void show() {
		System.out.println("Show overrided...");
	}
}

public class FinalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
//		PI++;
	}

}
