package br.com.viagem.util;

import java.util.LinkedList;
import java.util.List;

import br.com.viagem.model.Viagem;
import br.com.viagem.schema.Aereo;
import br.com.viagem.schema.AereoSeguimento;
import br.com.viagem.schema.Passageiro;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;
import br.com.viagem.schema.Solicitacao;

/**
 * Classe utilitaria para realizar a conversao dos dados do response para as entidades do modelo
 * @author joaopaulo
 *
 */
public class ConvertUtil {

	public List<Viagem> responseToViagensModel(PesquisarSolicitacaoResponse response) {
		List<Viagem> viagens = new LinkedList<Viagem>();
		for (Solicitacao solicitacao : response.getSolicitacao()) {
			
			Viagem viagem = new Viagem();
			viagem.setIdSolicitacao(solicitacao.getIdSolicitacao());
			
			List<Passageiro> passageiros = solicitacao.getPassageiros().getPassageiro();
			if (passageiros != null && !passageiros.isEmpty()) {
				viagem.setNomePassageiro(passageiros.get(0).getNomeCompleto());
			}
			
			if (solicitacao.getAereos() != null && !solicitacao.getAereos().getAereo().isEmpty()) {
				Aereo aereo = solicitacao.getAereos().getAereo().get(0);
				
				if (!aereo.getAereoSeguimento().isEmpty()) {
					AereoSeguimento aereoSeguimento = aereo.getAereoSeguimento().get(0);
					viagem.setCidadeOrigem(aereoSeguimento.getCidadeOrigem());
					viagem.setCidadeDestino(aereoSeguimento.getCidadeDestino());	
					viagem.setDataChegada(DateUtil.toDate( aereoSeguimento.getDataChegada() ));
					viagem.setDataSaida(DateUtil.toDate( aereoSeguimento.getDataSaida() ));
					
					if (!aereoSeguimento.getAereoVoo().isEmpty()) {
						viagem.setCompanhiaArea(aereoSeguimento.getAereoVoo().get(0).getCia().getSigla());
					}
				}	
			}
			
			viagens.add(viagem);
		}
		
		return viagens;
	}

}
