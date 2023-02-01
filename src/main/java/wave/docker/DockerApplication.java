package wave.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello Spring Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
