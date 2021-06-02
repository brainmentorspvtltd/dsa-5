import java.io.IOException;
import java.util.Scanner;

public class UserInput_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        
        Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        String name = scanner.next();
        System.out.println("Name is : " + name);

        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        System.out.println("Age is : " + age);

        System.out.println("Enter your salary :");
        double salary = scanner.nextDouble();
        System.out.println("Salary is : " + salary);

        scanner.close();
    }
}
