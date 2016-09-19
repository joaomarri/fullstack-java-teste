package br.com.viagem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Representa uma entidade do modelo, utilizado para aramazenar os valores de uma viagem
 * @author joaopaulo
 *
 */
@Entity
@Table(name="Viagem")
public class Viagem {

	@Id
	@Column(name="idSolicitacao")
	private Integer idSolicitacao;
	
	@Column(name="nomePassageiro")
	private String nomePassageiro;
	
	@Column(name="companhiaArea")
	private String companhiaArea;
	
	@Column(name="dataChegada")
	private Date dataChegada;
	
	@Column(name="dataSaida")
	private Date dataSaida;
	
	@Column(name="cidadeOrigem")
	private String cidadeOrigem;
	
	@Column(name="cidadeDestino")
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
