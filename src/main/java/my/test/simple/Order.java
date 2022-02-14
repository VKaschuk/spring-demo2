package my.test.simple;

import org.springframework.stereotype.Component;

@Component
public class Order {
	public void createOrder() {
		System.out.println("Order has been created two minutes ago...");
	}
}
