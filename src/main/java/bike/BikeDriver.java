package bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class BikeDriver {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BikeConfig.class);
		Bike bike = (Bike) applicationContext.getBean("bike");
		bike.used();
		
		((AbstractApplicationContext) applicationContext).close();
		
//		bike.used();
		
//		Bike bike2 = (Bike) applicationContext.getBean("bike");
//		bike2.used();
	}

	
}
