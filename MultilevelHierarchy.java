class Grandfather {
	int x = 10;
}

class Father extends Grandfather {
	int x = 100;
}

class Son extends Father {
	int x = 200;
	Son(int x) {
		int z = ((Grandfather)this).x + super.x + this.x + x;
		System.out.println(z);
	}
}

//class ChildX extends Son {
//	ChildX() {
//		super(10);
//		int grandfather_x = ((Grandfather)this).x;
//	}
//}


public class MultilevelHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj =  new Son(10);
	}

}
