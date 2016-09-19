package br.com.viagem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.viagem.dao.ViagemDAO;
import br.com.viagem.model.Viagem;

/**
 * Serviço para realizar a persistencia dos dados de uma lista de vigens
 * @author joaopaulo
 *
 */
@Service
public class ViagemService {
	
	@Autowired
	private ViagemDAO viagemDAO;
	
	@Transactional(readOnly = false)
	public void persistViagens(List<Viagem> viagens) {
		viagemDAO.persistViagens(viagens);
	}

}
