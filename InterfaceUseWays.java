//@FunctionalInterface
//- only one method will be there in this interface

@FunctionalInterface
interface Calc {
	int compute(int x, int y);
//	int calc(int x, int y);
}

class MyCalc implements Calc {
	@Override
	public int compute(int x, int y) {
		return x + y;
	}
}

public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCalc obj = new MyCalc();
//		obj.compute(4, 6);
		
//		this will create anonymous class
//		Calc obj = new Calc() {
//			int z = this.add(10, 20);
//			@Override
//			public int compute(int x, int y) {
//				System.out.println("Z is : "+z);
//				return x + y;
//			}
//			int add(int x, int y) {
//				return x * y;
//			}
//		};
//		System.out.println("Result is : "+obj.compute(4, 5));
//		
//		Calc obj2 = new Calc() {
//			@Override
//			public int compute(int x, int y) {
//				return x + y;
//			}
//		};
//		System.out.println("Result is : "+obj2.compute(4, 5));
		
//		lambda expressions - java 8 onwards
		Calc c = (a,b) -> a * b;
		System.out.println("Product is : "+c.compute(4, 5));
//		sam - single abstract method
		
		Calc c1 = (a,b) -> {
			int d = a + b;
//			System.out.println("Sum is : "+d);
			return d;
		};
		System.out.println("Sum is : "+c1.compute(4, 5));
		
	}

}
