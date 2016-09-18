package br.com.viagem.model;

import java.util.Date;

public class Viagem {

	private Integer idSolicitacao;
	
	private String nomePassageiro;
	
	private String companhiaArea;
	
	private Date dataChegada;
	
	private Date dataSaida;
	
	private String cidadeOrigem;
	
	private String cidadeDestino;

	
	
	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(Integer idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public String getCompanhiaArea() {
		return companhiaArea;
	}

	public void setCompanhiaArea(String companhiaArea) {
		this.companhiaArea = companhiaArea;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	
	
	

}
