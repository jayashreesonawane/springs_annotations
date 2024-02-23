package Cart;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Items{
	
	public void name() {
		System.out.println("Laptop");
	}
}
