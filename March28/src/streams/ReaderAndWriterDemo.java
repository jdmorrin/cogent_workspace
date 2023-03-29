package streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\Users\\Juandi\\cogent\\workspace\\cogent_java_wk\\March28\\src\\streams\\data.txt");
			fw = new FileWriter("new.txt");
			int c;
			
			while((c = fr.read()) != -1) {
				fw.append((char)c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			}catch(IOException io) {
				System.out.println(io);
			}
			
		}
	}

}
