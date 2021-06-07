//static variables
//static block
//static method - Utility Class
//static method with interface - Utility Interface

import static java.lang.System.out;
import static java.lang.Math.sqrt;

//final class MathOperations {
//	private MathOperations() {
//		
//	}
//	static void fact(int num) {
//		System.out.println("Factorial...");
//	}
//	static void sqrt(int num) {
//		System.out.println("SQRT...");
//	}
//}

interface MathOperations {
	static void fact(int num) {
		
	}
	static void sqrt(int num) {
		
	}
}

public class JavaStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MathOperations obj = new MathOperations();
//		obj.fact(6);
//		obj.sqrt(5);
		MathOperations.fact(5);
		MathOperations.fact(7);
		
		out.println(Math.abs(-3));
		out.println(sqrt(67));
		
	}

}
