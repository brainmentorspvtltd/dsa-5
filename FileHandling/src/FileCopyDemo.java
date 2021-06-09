import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sourcePath = "F:\\DIT_DSA\\Group_5\\Songs\\song.mp3";
		String destPath = "F:\\DIT_DSA\\Group_5\\Songs\\songCopy.mp3";
		
		File file = new File(sourcePath);
		final int EOF = -1;
		if(!file.exists()) {
			System.out.println("File not exist...");
			return;
		}
		FileInputStream fs = new FileInputStream(file);
		FileOutputStream fo = new FileOutputStream(destPath);
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Copying File Started...");
		
		int singleByte = fs.read();
		while(singleByte != EOF) {
			fo.write(singleByte);
			singleByte = fs.read();
		}
		fs.close();
		fo.close();
		
		long endTime = System.currentTimeMillis();
		double time = (endTime - startTime) / 1000;
		
		System.out.println("File copied and time taken is : "+time);
	}

}
