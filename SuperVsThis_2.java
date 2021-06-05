class X1 {
	int z;
	X1() {
		z = 50;
		System.out.println("Default constructor of X");
	}
	X1(int x) {
		this(); // it will call X default const.
		System.out.println("X param const call");
	}
}
class Y1 extends X1 {
	int t;
	int z;
	Y1() {
		super(10);
		z = 100;
		System.out.println("Default constructor of Y");
	}
	Y1(int z) {
		this(); // it will call Y default const.
		int n = super.z + this.z + z;
		System.out.println("Y param const call..."+n);
	}
}

public class SuperVsThis_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y1 obj = new Y1(10);
	}

}
