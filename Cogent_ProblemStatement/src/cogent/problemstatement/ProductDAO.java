package cogent.problemstatement;
import java.util.Scanner;

public class ProductDAO {
//	private Product[] prods;
	Scanner s = new Scanner(System.in);
	
	public ProductDAO() {
		
	}
	
	public void create(Product[] prods, int i) {
//		prods = new Product[3];
		prods[i] = new Product();
		
		System.out.println("Set ID: ");
		prods[i].setId(s.nextInt());
		System.out.println("Set price: ");
		prods[i].setPrice(s.nextFloat());
		System.out.println("Set name: ");
		prods[i].setName(s.next());
		
//		for(int i = 0; i<prods.length; i++) {
//			prods[i] = new Product();
//			
//			System.out.println("Set ID: ");
//			prods[i].setId(s.nextInt());
//			System.out.println("Set price: ");
//			prods[i].setPrice(s.nextFloat());
//			System.out.println("Set name: ");
//			prods[i].setName(s.next());
//		}
		
//		System.out.println("All products have been created");
		
	}
	
	public void read(Product[] prods) {
		System.out.println("Products List");
		
		for(int i = 0; i< prods.length; i++) {
			System.out.println("Product index: " + (i+1));
			System.out.println(prods[i]);
		}
	}
	
	public void update(Product[] prods, int i) {
		prods[i] = new Product();
		
		System.out.println("Set ID: ");
		prods[i].setId(s.nextInt());
		System.out.println("Set price: ");
		prods[i].setPrice(s.nextFloat());
		System.out.println("Set name: ");
		prods[i].setName(s.next());
	}
	
	public Product[] delete(Product[] prods) {
		Product[] newProds = new Product[prods.length -1];
		System.out.println("Which product would you like to erase?"
				+ "\nEneter a number between 1 and " + prods.length);
		int x = s.nextInt() -1;
		
		for(int i = 0, j = 0; i<prods.length; i++) {
			if(i != x) {
				newProds[j] = prods[i];
				j++;
			}
		}
		
		return newProds;
	}
}
