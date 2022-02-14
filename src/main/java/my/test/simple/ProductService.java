package my.test.simple;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
	public void getProducts() {
		System.out.println("Sending products list...");
	}
}
