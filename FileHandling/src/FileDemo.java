import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".mp3");
	}
	
}

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String path = "F:\\DIT_DSA\\Group_5\\inheritance_basics.txt";
		String path = "F:\\DIT_DSA\\Group_5\\demo.txt";
		File file = new File(path);
		if(file.exists()) {
//			file.delete();
			File file2 = new File("F:\\DIT_DSA\\Group_5\\demo_1.txt");
			file.renameTo(file2);
			System.out.println("File Already Exist...");
		}
		else {
			file.createNewFile();
			System.out.println("New File Created...");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		path = "F:\\DIT_DSA\\Group_5\\folder_1\\xx\\yy\\zz";
		file = new File(path);
//		file.mkdir();
		file.mkdirs();
		
		path = "F:/DIT_DSA/Group_5/Songs";
		file = new File(path);
		File files[] = file.listFiles();
		System.out.println("Number of files : " + files.length);
		
//		MyFilter filter = new MyFilter();
//		File mp3files[] = file.listFiles(filter);
//		System.out.println("Number of Mp3 files : " + mp3files.length);
		
		File mp3files[] = file.listFiles((dirPath, fileName) -> fileName.endsWith(".mp3"));
		File pngfiles[] = file.listFiles((dirPath, fileName) -> fileName.endsWith(".png"));
		
		System.out.println("Number of Mp3 files : " + mp3files.length);
		System.out.println("Number of PNG files : " + pngfiles.length);
		
		
//		int count = 0;
//		for(File f : files) {
//			if(f.getName().endsWith(".mp3")) {
//				count++;
//			}
//		}
//		System.out.println("Number of MP3 Files : " + count);
		
	}

}
