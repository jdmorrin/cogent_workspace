package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutpurStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Juandi\\cogent\\workspace\\cogent_java_wk\\March28\\src\\streams\\data.txt");
			fos = new FileOutputStream("C:\\Users\\Juandi\\cogent\\workspace\\cogent_java_wk\\March28\\src\\streams\\newemployee.txt");
		
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File copied succesfully");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			}catch(IOException io) {
				System.out.println(io);
			}
		}

	}

}
