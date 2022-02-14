package my.test.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppSpring {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(AppConfig.class);
			ShopService shop = context.getBean("shopService", ShopService.class);
			shop.buy();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			((AnnotationConfigApplicationContext)context).close();
		}
	}
	
}
