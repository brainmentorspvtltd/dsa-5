interface K1 {
	void show();
//	void showMe();
	default void print() {
		System.out.println("K1 Interface print...");
	}
}

interface K2 {
	default void print() {
		System.out.println("K2 Interface print...");
	}
}

interface K3 extends K1, K2 {
	@Override
	default void print() {
		K1.super.print();
		K2.super.print();
		System.out.println("K3 Interface print...");
	}
}

class K implements K3 {

	@Override
	public void show() {
		System.out.println("Class K show call...");
	}
	
}

public class JavaDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K obj = new K();
		obj.show();
		obj.print();
	}

}
