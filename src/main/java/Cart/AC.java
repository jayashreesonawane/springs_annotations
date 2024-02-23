package Cart;

import org.springframework.stereotype.Component;

@Component
public class AC implements Items{

	public void name() {
		System.out.println("AC");
	}
}
