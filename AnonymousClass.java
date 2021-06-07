abstract class Employee1 {
	abstract void details();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 obj = new Employee1() {
			
			@Override
			void details() {
				// TODO Auto-generated method stub
				System.out.println("Emp Details...");
			}
		};
		obj.details();
	}

}
