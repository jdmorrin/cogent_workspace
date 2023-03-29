package pkg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
public class FileINputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("C:\\Users\\Juandi\\cogent\\workspace\\cogent_java_wk\\March28\\src\\pkg\\bday.txt"));
			System.out.println("File is opened");
			int i;
			
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(FileNotFoundException io) {
			System.out.println(io);
		}catch(IOException f) {
			System.out.println(f);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}

}
