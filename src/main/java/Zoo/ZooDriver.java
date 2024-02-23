package Zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ZooDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Zoo zoo = (Zoo) applicationContext.getBean("zoo");
		zoo.cage();
		
		((AbstractApplicationContext) applicationContext).close();
	}
}
