package Cart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CartDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Cart cart = (Cart) applicationContext.getBean("cart");
		cart.info();
	}
}
