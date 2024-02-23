package Zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	@Autowired
	@Qualifier("lion")
	Animal animal;
	
	public void cage() {
		animal.sound();
	}
}
