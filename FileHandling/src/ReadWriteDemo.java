import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "F:\\DIT_DSA\\Group_5\\demo.txt";
		File file = new File(path);

		//		Read data
		final int EOF = -1;
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read();
			while(singleByte != EOF) {
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			fs.close();
		}
		

		//		Write Data
		System.out.println("Enter the data you want to write : ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		FileOutputStream fo = new FileOutputStream(file);
		fo.write(text.getBytes());
		fo.close();
		scanner.close();
		
	}

}
