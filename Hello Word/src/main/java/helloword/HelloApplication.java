package helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController	
public class HelloApplication {
	
	@GetMapping ("/mentalidade")
	public String Atividade1(){
		return "PERSISTÊNCIA E ORIENTAÇÃO AOS DETALHES";
	}

	@GetMapping("/objetivo")
	public String Atividade2(){
		return "Muito aprendizado!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
