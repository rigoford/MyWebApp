package uk.co.rigoford;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyWebApp {

	@RequestMapping("/red")
	public String red() {
		return "Red";
	}

	@RequestMapping("/green")
	public String green() {
		return "Green";
	}

	@RequestMapping("/blue")
	public String blue() {
		return "Blue";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyWebApp.class, args);
	}
}
