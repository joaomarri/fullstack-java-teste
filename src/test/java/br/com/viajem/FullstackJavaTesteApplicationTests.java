package br.com.viajem;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import br.com.viagem.client.ViagemWSClient;
import br.com.viagem.client.ViagemWSConfig;
import br.com.viagem.model.Viagem;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;
import br.com.viagem.util.ConvertUtil;

public class FullstackJavaTesteApplicationTests {

	private ViagemWSClient viagemClient;
	
	public FullstackJavaTesteApplicationTests() {
		ApplicationContext ctx = SpringApplication.run(ViagemWSConfig.class);
		viagemClient = ctx.getBean(ViagemWSClient.class);
	}
	
	@Test
	public void verificaNumeroDeSolicitacoesAposChamarServicoSoap() throws DatatypeConfigurationException {
		
		PesquisarSolicitacaoResponse response = viagemClient.consultaViagensUltimos3Meses();
		ConvertUtil convertUtil = new ConvertUtil();
		List<Viagem> viagens = convertUtil.responseToViagensModel(response);
		
		Assert.assertTrue(response.getNumeroSolicitacoes() > 0);
		Assert.assertTrue(viagens.size() == response.getNumeroSolicitacoes());
	}

}
