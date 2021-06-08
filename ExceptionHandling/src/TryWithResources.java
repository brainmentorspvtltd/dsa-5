import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		try {
//			System.out.println("Enter your name : ");
//			String name = scanner.nextLine();
//			System.out.println("Welcome : "+name);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Invalid Input...");
//		}
//		finally {
//			if(scanner != null) {
//				scanner.close();
//			}
//		}
		
//		try(Scanner scanner = new Scanner(System.in)) {
//			System.out.print("Enter your name : ");
//			String name = scanner.nextLine();
//			System.out.println("Welcome : "+name);
//		}
//		catch(Exception e) {
//			System.out.println("Invalid Input...");
//		}
		
//		try-with-resources with Multiple Resources
		try(Scanner scanner = new Scanner(new File("demo.txt"));
				PrintWriter writer = new PrintWriter(new File("demo_1.txt"))) {
			while(scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Input...");
		}

	}

}
