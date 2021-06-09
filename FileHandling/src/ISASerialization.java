import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C {
	
}

class A implements Serializable {
//class A {
	int x;
	int y;
	C obj = new C();
	transient int f;	// won't save this in file...
	A() {
		x = 100;
		y = 200;
		f = 500;
		System.out.println("A cons call...");
	}
	void add() {
		x++;
		y++;
		f++;
	}
}

class B extends A {
//class B extends A implements Serializable{
	int z;
	B() {
		z = 1000;
		System.out.println("B cons call...");
	}
	void plus () {
		z++;
	}
}

public class ISASerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		B obj = new B();
//		FileOutputStream fo = new FileOutputStream("is_a.dat");
//		ObjectOutputStream os = new ObjectOutputStream(fo);
//		obj.add();
//		obj.plus();
//		os.writeObject(obj);
//		os.close();
//		fo.close();
//		System.out.println("Object written Successfully...");
		
		System.out.println("================");
		
		FileInputStream fs = new FileInputStream("is_a.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		B b1 = (B)oi.readObject();
		System.out.println(b1.x + ":" + b1.y + ":" + b1.z + ":" + b1.f);

	}

}
