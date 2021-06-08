import java.util.Scanner;

//Checked Exception
//class CheckAgeException extends Exception {
//	
//}

class CheckAgeException extends RuntimeException {
	String message;
	CheckAgeException() {
		this.message = "";
	}
	CheckAgeException(String msg) {
		this.message = msg;
	}
	@Override
	public String toString() {
		return "CheckAgeException [message = " + message + "]";
	}

}


public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = scanner.nextInt();
		try {
			if(age < 18) {
				throw new CheckAgeException("Age cannot be less than 18");
			}
		}
		catch (CheckAgeException e) {
//			System.out.println(e.getMessage());
			System.err.println(e);
		}
		finally {
			scanner.close();
		}

	}

}
