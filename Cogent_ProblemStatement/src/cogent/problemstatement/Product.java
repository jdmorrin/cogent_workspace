package cogent.problemstatement;

public class Product {
	private int id;
	private float price;
	private String name;
	
	public Product() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID: " + this.getId() + "\nPrice: $" + this.getPrice() + "\nName: " + this.getName() + "\n";
	}
	
	
}
