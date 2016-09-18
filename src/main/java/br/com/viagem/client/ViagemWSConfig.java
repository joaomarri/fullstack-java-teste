
package br.com.viagem.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ViagemWSConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("br.com.viagem.schema");
		return marshaller;
	}

	@Bean
	public ViagemWSClient viagemClient(Jaxb2Marshaller marshaller) {
		ViagemWSClient client = new ViagemWSClient();
		//WebServiceTemplate template = client.getWebServiceTemplate();
		
		client.setDefaultUri("https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
