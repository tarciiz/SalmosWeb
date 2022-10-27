package br.com.ifba.salmos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SalmosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalmosApplication.class, args);
	}

}
