import java.io.File;
import java.io.IOException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			String path = "demo.txt";
			String path = "D:/demo.txt";
			File file = new File(path);
			if(file.exists()) {
				System.out.println("File Already Exists...");
			}
			else {
				file.createNewFile();
				System.out.println("File created...");
			}
		}
		catch (NullPointerException e) {
			System.out.println("String is null...");
		}
		catch(IOException e) {
			System.out.println("File cannot be created...");
		}
	}

}
