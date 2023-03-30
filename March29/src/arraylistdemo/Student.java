package arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private ArrayList <String> names;
	
	public void setNames() {
		Scanner s = new Scanner(System.in);
		this.names = new ArrayList<>();
		String name;
		
		do {
			System.out.println("Add name: ");
			name = s.nextLine();
			this.names.add(name);
			
		}while(!name.equals("exit"));
	}
	
	public void searchName(String name) {
		if(this.names.contains(name))
			System.out.println("Name has been found at index " + this.names.indexOf(name));
		else
			System.out.println("That name has not been found");
//		for(String n : this.names) {
//			if(n.equals(name))
//				System.out.println("Name has been found at index " + this.names.indexOf(n));
//		}
	}
	
	public void searchname(int indx) {
		System.out.println("The name at index " + indx + " is " + this.names.get(indx));
		
//		for(String n : this.names) {
//			if(this.names.)
//			//System.out.println("The name at index " + indx + " is " + this.names)
//		}
	}
	
	public void printNames() {
		System.out.println("\nPrint all names");
		for(String n : this.names) {
			System.out.println(n);
		}
	}
	
	public void removeName(String name) {
		
	}
}
