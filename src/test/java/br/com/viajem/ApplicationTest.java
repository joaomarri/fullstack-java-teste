
package br.com.viajem;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import br.com.viagem.client.ViagemWSConfig;
import br.com.viagem.client.ViagemWSClient;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;


public class ApplicationTest {

	public static void main(String[] args) throws DatatypeConfigurationException {
		//teste
		ApplicationContext ctx = SpringApplication.run(ViagemWSConfig.class, args);
		
		ViagemWSClient viagemClient = ctx.getBean(ViagemWSClient.class);
		PesquisarSolicitacaoResponse response = viagemClient.getSolicitacoesDeViagem();
		System.out.println(response.getNumeroSolicitacoes());
	  
	}

}
