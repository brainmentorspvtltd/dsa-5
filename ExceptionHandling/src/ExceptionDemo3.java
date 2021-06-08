
public class ExceptionDemo3 {
	
	static void dao() throws ArithmeticException {
		System.out.println("Connection Open...");
//		int e = 10/0;
		try {
			if(10 > 5) {
				return;
			}
			int x = 10/0;
			System.out.println("Querying data...");
			System.out.println("Sending results to helper");
		}
		finally {
			// it will always execute...
			System.out.println("Connection Close...");
		}
	}
	
	static void helper() throws ArithmeticException {
		System.out.println("Calling DAO...");
		dao();
		System.out.println("Fetching results from DAO...");
		System.out.println("Sending results to View...");
	}
	
	static void view() {
		System.out.println("Calling Helper");
		try {
			helper();
			System.out.println("Got results from Helper...");
			System.out.println("Display Results...");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();
	}

}
