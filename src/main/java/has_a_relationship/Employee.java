package has_a_relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	@Qualifier("ICICI")
	Account account;
	
	public void check() {
		account.balance();
	}
}
