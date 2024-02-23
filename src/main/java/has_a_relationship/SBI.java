package has_a_relationship;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements Account{
	
	public void balance() {
		System.out.println("SBI Balance is : 3000");
	}
}
