package org.example.testmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example", "com.bjit"})
public class TestmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestmailApplication.class, args);
	}

}
