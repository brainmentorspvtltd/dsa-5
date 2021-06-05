class X2 {
//	amazon normal delivery
	int a,b,c;
}
class Y2 extends X2 {
//	amazon prime delivery
	int d,e;
}

class P1 {
	public X2 show() {
		System.out.println("Show Parent");
		X2 obj = new X2();
		return obj;
	}
}
class C1 extends P1 {
	@Override
	public Y2 show() {
		System.out.println("Show Parent");
		Y2 obj = new Y2();
		return obj;
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
