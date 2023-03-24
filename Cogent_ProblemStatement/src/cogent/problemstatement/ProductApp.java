package cogent.problemstatement;
import java.util.Scanner;
import java.util.Random;
public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		ProductDAO dao = new ProductDAO();
		Product[] prods = null;
		int choice = 0;
		
		do {
			System.out.println("******MENU******"
					+"\n1. Create Peoduct"
					+"\n2. View All Products"
					+"\n3. Update Product"
					+"\n4. Delete Product"
					+"\n5. Exit\n");
			
			choice = s.nextInt();
			
			switch(choice) {
				case 1:
					prods = new Product[4];
					for(int i = 0; i< prods.length; i++) {
						dao.create(prods, i);
					}
					System.out.println("All products have been created");
//					dao.create(prods);
					break;
				case 2:
					dao.read(prods);
					break;
				case 3:
					System.out.println("Which product do you wish to update?"
							+ "\nEnter a number between 1 and " + prods.length );
					int x = s.nextInt();
					if(x <= prods.length) {
						dao.update(prods, x -1);
					}
					else
						System.out.println("That product does not exist");
					//dao.update();
					break;
				case 4:
					prods = dao.delete(prods);
					break;
				case 5:
					break;
				default:
					break;
			}
		}while(choice != 5);
		
		for(int i = 0;i < prods.length; i++) {
			
			
		}
		

	}

}
