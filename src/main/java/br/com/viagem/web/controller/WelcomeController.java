package br.com.viagem.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.viagem.client.ViagemWSClient;
import br.com.viagem.model.Viagem;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;
import br.com.viagem.service.ViagemService;
import br.com.viagem.util.ConvertUtil;

/**
 * Classe controller utilizada para realizar a ação de chamar o serviço consulta de viagens WS, 
 * chamar o serviço de persistencia dos dados e enviar os dados para a tela 
 * @author joaopaulo
 *
 */

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	
	@Autowired
	private ViagemWSClient viagemWSClient;
	
	@Autowired
	private ViagemService viagemService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {

		logger.debug("Teste do serviço soap - pesquisar solicitações de viagens");

		try {
			ConvertUtil convertUtil = new ConvertUtil();
			
			PesquisarSolicitacaoResponse response = viagemWSClient.consultaViagensUltimos3Meses();
			List<Viagem> viagens = convertUtil.responseToViagensModel(response);
			
			viagemService.persistViagens(viagens);
			
			model.addAttribute("viagens", viagens);
			model.addAttribute("msg", "Status da consulta: "+response.getResultadoAcao());
			
		} catch (Exception e) {
			logger.error("Erro ao tentar consultar servico soap pesquisarSolicitacao", e);
		}
		
		return "welcome";

	}

}