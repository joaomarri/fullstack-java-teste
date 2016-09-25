package br.com.viajem;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.viagem.client.ViagemWSClient;
import br.com.viagem.client.ViagemWSConfig;
import br.com.viagem.model.Viagem;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;
import br.com.viagem.schema.ResultadoAcao;
import br.com.viagem.util.ConvertUtil;

/**
 * Teste de integração com serviço SOAP pesquisarSolicitacao para verificar se a quantidade de
 * solicitações recebidas na resposta é mesma da lista de Viagens criada apos a conversão.
 * @author joaopaulo
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ViagemWSConfig.class})
public class FullstackJavaTesteApplicationTests {

	
	@Autowired
	private ViagemWSClient viagemWSClient;
	
	
	@Test
	public void verificaSeChamadaAoServicoSoapResultouSucesso() throws DatatypeConfigurationException {
		PesquisarSolicitacaoResponse response = viagemWSClient.consultaViagensUltimos3Meses();
		Assert.assertTrue(response.getResultadoAcao().equals(ResultadoAcao.SUCESSO));
	}
	
	
	@Test
	public void verificaNumeroDeSolicitacoesAposChamarServicoSoap() throws DatatypeConfigurationException {
		PesquisarSolicitacaoResponse response = viagemWSClient.consultaViagensUltimos3Meses();
		ConvertUtil convertUtil = new ConvertUtil();
		List<Viagem> viagens = convertUtil.responseToViagensModel(response);
		
		Assert.assertTrue(response.getNumeroSolicitacoes() > 0);
		Assert.assertTrue(viagens.size() == response.getNumeroSolicitacoes());
	}

}
