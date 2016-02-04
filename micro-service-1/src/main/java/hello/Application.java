package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		System.out.println("Microservice 1 invoked !!" + date.toString());
		return "Hello Docker -- from ms 1";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
