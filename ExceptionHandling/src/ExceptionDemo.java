import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String name = null;
			if("Ravi".equals(name)) {
				System.out.println("Welcome : "+name);
			}
			else {
				System.out.println("Welcome Guest...");
			}
//			if(name != null) {
//				name.toLowerCase();
//			}
			
//			int x[] = new int[10];
//			x[11] = 100;
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter first number : ");
			int num_1 = scanner.nextInt();
			System.out.print("Enter second number : ");
			int num_2 = scanner.nextInt();
			scanner.close();
			int add = num_1 + num_2;
			System.out.println("Sum : "+add);
			int sub = num_1 - num_2;
			System.out.println("Sub : "+sub);
			double div = num_1 / num_2;
			System.out.println("Div : "+div);
			int mul = num_1 * num_2;
			System.out.println("Mul : "+mul);
		}
		catch (ArithmeticException e) {
			System.err.println("Cannot divide by zero...");
//			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.err.println("Invalid Input...");
//			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound...");
		}
		catch (NullPointerException e) {
			System.out.println("String is null...");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Error...Please contact with Admin...");
		}
	}

}
