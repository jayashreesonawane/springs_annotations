package method_level_annotatiions;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {
	@PostConstruct
	public void start() {
		System.out.println("Shoes");
	}

	public void used() {
		System.out.println("Walk");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Hand Wash");
	}
}
