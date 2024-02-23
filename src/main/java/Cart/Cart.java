package Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cart {

	@Autowired
	@Qualifier("laptop")
	Items items ;
	
	public void info() {
		items.name();
	}
}
