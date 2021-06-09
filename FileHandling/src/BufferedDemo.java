import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sourcePath = "F:\\DIT_DSA\\Group_5\\Songs\\Faded.mp3";
		String destPath = "F:\\DIT_DSA\\Group_5\\Songs\\FadedCopy.mp3";
		
		File file = new File(sourcePath);
		final int EOF = -1;
		if(!file.exists()) {
			System.out.println("File not exist...");
			return;
		}
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs);
		
		FileOutputStream fo = new FileOutputStream(destPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Copying File Started...");
		
		int singleByte = bs.read();
		while(singleByte != EOF) {
			bo.write(singleByte);
			singleByte = bs.read();
//			System.out.println(singleByte);
		}
		bo.close();
		bs.close();
		fs.close();
		fo.close();
		
		long endTime = System.currentTimeMillis();
		double time = endTime - startTime;
		time = time / 1000;
		
		System.out.println("File copied and time taken is : "+time);
	}

}
