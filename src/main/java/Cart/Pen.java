package Cart;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Items{
	
	public void name() {
		System.out.println("Pen");
	}
}
