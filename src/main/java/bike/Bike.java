package bike;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	@PostConstruct
	public void start() {
		System.out.println("Bike started");
	}

	public void used() {
		System.out.println("Bike is used to travel");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Bike stopped");
	}
}
