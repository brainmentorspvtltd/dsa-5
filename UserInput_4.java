import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UserInput_4 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Emp ID :");
        int empId = scanner.nextInt();
        System.out.println("Emp ID is : " + empId);

        System.out.println("Enter your name : ");
        scanner.nextLine();
        String name = scanner.nextLine();

        // convert first letter to upper case
        char e = name.charAt(0);
        String firstChar = String.valueOf(e);
        firstChar = firstChar.toUpperCase();
        // convert rest of the letter to lower case
        name = firstChar + name.substring(1).toLowerCase();

        System.out.println("Name is : " + name);

        System.out.println("Enter your salary :");
        double salary = scanner.nextDouble();
        System.out.println("Original Salary is : " + salary);

        Locale locale = new Locale("en", "IN");
        // Locale locale = new Locale("us", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatSalary = nf.format(salary);
        System.out.println("Formatted Salary is : " + formatSalary);

        // Adding date
        Date date = new Date();
        // System.out.println(date);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String dateFormat = df.format(date);
        System.out.println(dateFormat);

        scanner.close();
    }
}
