import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18N {
//	Internationalization
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Press 1 for Hindi");
		System.out.println("Press 2 for English");
		int choice = new Scanner(System.in).nextInt();
		Locale locale = new Locale("en","US");
		if (choice == 1) {
			locale = new Locale("hi","IN");
		}
		
		ResourceBundle rb = ResourceBundle.getBundle("message", locale);
		double salary = 45000.00;
//		System.out.println(rb.getString("welcome"));
		Date date = new Date();
		System.out.println(date);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		String dateFormat = df.format(date);
		System.out.println(rb.getString("date") + " : " + dateFormat);
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formatSalary = nf.format(salary);
		System.out.println(rb.getString("salary") + " : " + formatSalary);
		
	}

}
