
package br.com.viajem;

import br.com.viagem.client.WebServiceClient;


public class ApplicationTest {

	public static void main(String[] args) {
		//teste
		//ApplicationContext ctx = SpringApplication.run(ViagemConfiguracao.class, args);
		
		//ViagemWSClient viagemClient = ctx.getBean(ViagemWSClient.class);
		//viagemClient.getWebServiceTemplate();
	  WebServiceClient client = new WebServiceClient();
	  client.customSendAndReceive();
	  
	}

}
