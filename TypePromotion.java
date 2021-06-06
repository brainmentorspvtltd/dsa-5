import java.util.LinkedList;

public class TypePromotion {
	
//	void show(byte x) {
//		System.out.println("Byte X...");
//	}
//	void show(int x) {
//		System.out.println("Int X...");
//	}
//	void show(long x) {
//		System.out.println("Long X...");
//	}
//	void show(float x) {
//		System.out.println("Float X...");
//	}
//	void show(double x) {
//		System.out.println("Double X...");
//	}
//	void show(Integer x) {
//		System.out.println("Integer X...");
//	}
//	void show(Float x) {
//		System.out.println("Float Wrapper X...");
//	}
	void show(int ...x) {
		int sum = 0;
		for(int i : x) {
			sum += i;
		}
		System.out.println("Var args X..."+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion obj = new TypePromotion();
//		JRE will give first chance to int
//		if int is not available then it will give chance to long
//		if long is not available then it will give chance to float
//		if float is not available then it will give chance to double
//		if double is not available then it will give chance to wrapper class with same data type
//		if wrapper class is not available then it will give chance to var args
		obj.show(10);
		
//		Integer - wrapper class
		int x = 100;		// primitive - value variable
		Integer y = 20; // reference - address
		
		int xx = x;		// copy value
		Integer yy = 5; // copy address
		
		System.out.println(y.compareTo(yy));
//		when y and yy is equal then it will return 0
//		when y is smaller then yy then it will return -1
//		when y is greater then yy then it will return +1
		
		byte xb = (byte)x;	// explicit type casting
		long xl = x;		// impilicit type casting
		
		System.out.println("Bytes : "+xb);
		byte xb2 = yy.byteValue();
		
//		AutoBoxing
		Integer a1 = 100;	// boxing
		Integer a2 = x;		// boxing
		
		int b1 = a1;	// unboxing
//		boxing - primitive can be converted into object
//		unboxing - object can be converted into primitive
		
//		old style of boxing
		Integer i = new Integer(b1);	// boxing
		int i1 = i.intValue();			// unboxing
		
		
//		LinkedList link = new LinkedList();
//		link.add(i);
//		Integer l2 = (Integer)link.get(0);
//		int l3 = l2.intValue();
//		l3++;
//		l2 = new Integer(l3);
		
		
		LinkedList<Integer> link = new LinkedList<>();
		link.add(a1);
		link.add(100);
		link.add(link.get(0) + 1);
		
//		obj.show((byte)10);
		
		obj.show();
		obj.show(10,20);
		obj.show(10,20,40,50);

	}

}
