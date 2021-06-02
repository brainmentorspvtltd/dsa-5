import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        // int name = System.in.read();  // read one byte at a time, and store ascii
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name is : " + name);
        scanner.close();
    }
}
