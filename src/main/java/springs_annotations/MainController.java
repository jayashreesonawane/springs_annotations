package springs_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee employee = (Employee) applicationContext.getBean("employee");
//		employee.role();
		System.out.println(employee);
		Employee employee2 = (Employee) applicationContext.getBean("employee");
		System.out.println(employee2);
	}
}
