package has_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements Account{
	public void balance() {
		System.out.println("ICICI Balance is : 10000");
	}
}
