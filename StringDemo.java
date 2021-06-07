
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ravi".intern();
		String name2 = "Ravi";
		System.out.println(name == name2);
		
//		String name3 = new String("Ravi").intern();
//		System.out.println(name == name3);
		
		String name3 = new String("Ravi").intern();
		String name4 = new String("Ravi");
		System.out.println(name3 == name4);
		
		String t = "hello";
		String h = t;
		System.out.println(h == t);
		
		t = "hi there";		// it will create new memory
		System.out.println(h == t);
		
		// by default it will create array of 16 size
//		StringBuffer sb = new StringBuffer();
		StringBuffer sb = new StringBuffer(200);
//		sb.ensureCapacity(250);   // formula will work after 250
		System.out.println(sb.capacity() + "," + sb.length());
		sb.append("hello");
		System.out.println(sb.capacity() + "," + sb.length());
		sb.append("hello how are you ??");
		System.out.println(sb.capacity() + "," + sb.length());
		
//		if string buffer is full
//		there is a formula : old_capacity * 2 + 2
//		+2 (for null character)
		
		sb.append("hello how are you  ??");
		System.out.println(sb.capacity() + "," + sb.length());
		sb.append("hello how are you ??");
		System.out.println(sb.capacity() + "," + sb.length());
		
		sb.append("hello how are you iiii ??");
		System.out.println(sb.capacity() + "," + sb.length());
		
	}

}
