
package br.com.viagem.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * classe para configuracao do componente client WS
 * @author joaopaulo
 *
 */

@ComponentScan({ "br.com.viagem.client", "br.com.viagem.schema" })
@Configuration
public class ViagemWSConfig {

	@Autowired
	private ViagemWSClient client;
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("br.com.viagem.schema");
		return marshaller;
	}

	@Bean
	public ViagemWSClient viagemClient(Jaxb2Marshaller marshaller) {
		
		client.setDefaultUri("https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
