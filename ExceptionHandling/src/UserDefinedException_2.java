class MyException extends Exception {
	double bal[] = {5000.00, 56000.00, 1200.00, 800.00, 950.00, 5000.00};
	public MyException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}

public class UserDefinedException_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyException obj = new MyException("Balance is less than 5000");
		try {
			for(int i = 0; i < obj.bal.length; i++) {
				System.out.println("Balance is : "+obj.bal[i]);
				if(obj.bal[i] < 5000) {
					throw obj;
				}
			}	
		}
		catch(MyException e) {
			e.printStackTrace();
		}
		
	}

}
