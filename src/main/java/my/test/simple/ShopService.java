package my.test.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopService{
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private Order orderService;
	
	@Autowired
	private MailService mailService;
	
	public void buy() {
		productService.getProducts();
		orderService.createOrder();
		mailService.sendMail();
	}	
	
}
