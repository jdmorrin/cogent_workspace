package cogent.question1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean(name="person")
	public Person getPerson() {
		Person per = new Person();
		per.setAge(25);
		per.setName("David");
		return per;
	}
	
	@Bean(name="product")
	public Product getProduct() {
		Product prd = new Product();
		prd.setProductName("Iphone");
		prd.setPrice(9999.99);
		return prd;
	}
	
}
