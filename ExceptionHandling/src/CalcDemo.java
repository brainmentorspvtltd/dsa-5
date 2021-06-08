import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDemo {
	Scanner scanner = new Scanner(System.in);
	int firstNumber;
	int secondNumber;
	int result;
	
	void takeFirstNumber() {
		try {
			System.out.println("Enter first number : ");
			firstNumber = scanner.nextInt();		// throw new InputMismatchException();
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input...");
			scanner.nextLine();
			takeFirstNumber();
		}
	}
	
	void takeSecondNumber(String msg) {
		if(msg == null) {
			msg = "Number must be b/w 0 to 9";
		}
		try {
			System.out.println("Enter second number : ");
			secondNumber = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println(msg);
			scanner.nextLine();
			takeSecondNumber(msg);
		}
	}
	
	void add() {
		try {
			result = firstNumber + secondNumber;
		}
		catch(ArithmeticException e) {
			System.out.println("Error during addition...");
		}
	}
	
	void divide() {
		try {
			result = firstNumber / secondNumber;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
			takeSecondNumber("Number must be b/w 1 to 9, 0 is not allowed...");
			divide();
		}
	}
	
	void print() {
		System.out.println("Result is : "+result);
//		scanner.close();
	}
	void closeScanner() {
		scanner.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcDemo obj = new CalcDemo();
		obj.takeFirstNumber();
		obj.takeSecondNumber("Number must be b/w 0 to 9");
		obj.add();
		obj.print();
		obj.divide();
		obj.print();
		obj.closeScanner();

	}

}
