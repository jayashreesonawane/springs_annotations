package has_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements Account{
	public void balance() {
		System.out.println("HDFC Balance is : 5000");
	}
}
