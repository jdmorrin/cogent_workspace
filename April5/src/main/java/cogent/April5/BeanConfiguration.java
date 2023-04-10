package cogent.April5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("David");
		p.setAge(25);
		return p;
	}
}
