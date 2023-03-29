package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f;
		FileInputStream is = null;
		
		try {
			is = new FileInputStream(new File("C:\\Users\\Juandi\\cogent\\workspace\\cogent_java_wk\\March28\\src\\employees\\data.txt"));
			System.out.println("File is open");
			
			int i;
			while((i = is.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(FileNotFoundException fnf) {
			System.out.println(fnf);
		}catch(IOException ioe) {
			System.out.println(ioe);
		}finally {
			try {
				is.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}

	}

}
