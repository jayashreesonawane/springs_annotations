package Zoo;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

	public void sound() {
		System.out.println("Lion : Roar");
	}
}
