class P {
	int x = 100;
	void show() {
		System.out.println("Parent class show..."+x);
	}
}
class C extends P {
	int x = 10;
	@Override
	void show() {
		System.out.println("Child class show..."+x);
	}
}


public class OverrideMethodVsVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C obj = new C();
		P obj = new C();
		obj.show();
		System.out.println(obj.x);

	}

}
