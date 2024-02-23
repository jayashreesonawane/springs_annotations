package Zoo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Donkey {

	public void sound() {
		System.out.println("Donkey : Braw");
	}
}
