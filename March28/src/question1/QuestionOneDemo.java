package question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class QuestionOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File(args[0]), out = new File(args[1]);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream(in);
			System.out.println("Input file opened");			
			
		}catch(FileNotFoundException fnf) {
			System.out.println(fnf);
			System.out.println("Input file has not been created");
		}
		
		// Not yet working
		if(out.exists()) {
			try {
//				fos = new FileOutputStream(out);
				System.out.println("Would you like to overwrite the output file [y/n]?");
				Scanner s = new Scanner(System.in);
				char c = s.next().charAt(0);
				
				if(c == 'y') {
					fos.flush();
					
					int i;
					while((i = fis.read()) != -1) {
						fos.write(i);
					}
					System.out.println(args[1] + " has been successfully overriten");
				}else {
					System.out.println("Nothing happens");
				}
				
			}catch(IOException ioe) {
				System.out.println(ioe);
			}
			
			
		}else {
			System.out.println("Creating new file named: " + args[1]);
			fos = new FileOutputStream(out);
			
		}

	}

}
