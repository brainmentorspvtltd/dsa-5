interface H1 {
	int x = 10;
	void show();
}

interface H2 {
	int x = 20;
	void show();
}

interface H3 extends H1, H2 {
	
}

class C11 implements H3 {
	public void show() {
		System.out.println("Show Called..."+H1.x + H2.x);
	}
}


public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
