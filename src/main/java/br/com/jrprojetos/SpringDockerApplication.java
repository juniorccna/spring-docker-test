package br.com.jrprojetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}
	
	@GetMapping
	public String helloWorld() {
		return "Eu amo o docker";
	}

}
