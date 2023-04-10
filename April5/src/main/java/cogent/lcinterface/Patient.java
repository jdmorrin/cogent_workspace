package cogent.lcinterface;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Patient /*implements InitializingBean,DisposableBean*/{
	private int id;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside init");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside destroy");
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Inside after properties set method");
//		
//	}
}
