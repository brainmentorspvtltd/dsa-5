import java.io.IOException;
import java.util.Scanner;

public class UserInput_3 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Emp ID :");
        int empId = scanner.nextInt();
        System.out.println("Emp ID is : " + empId);

        System.out.println("Enter your name : ");
        // nextLine will take input untill we press enter
        scanner.nextLine(); // it will eat the \n coming from above
        String name = scanner.nextLine();
        // String name = scanner.next();
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
