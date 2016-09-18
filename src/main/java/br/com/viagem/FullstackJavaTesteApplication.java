package br.com.viagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.viagem.config.SpringRootConfig;

@SpringBootApplication
public class FullstackJavaTesteApplication {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(SpringRootConfig.class, args);
	}
}
