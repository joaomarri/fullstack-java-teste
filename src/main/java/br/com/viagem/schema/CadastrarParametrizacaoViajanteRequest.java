//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.09.18 às 12:24:25 PM BRT 
//


package br.com.viagem.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarParametrizacaoViajanteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParametrizacaoViajanteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parametrizacaoViajanteAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacao"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarParametrizacaoViajanteRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "parametrizacaoViajanteAprovacao"
})
public class CadastrarParametrizacaoViajanteRequest {

    @XmlElement(required = true)
    protected ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao;

    /**
     * Obtém o valor da propriedade parametrizacaoViajanteAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public ParametrizacaoViajanteAprovacao getParametrizacaoViajanteAprovacao() {
        return parametrizacaoViajanteAprovacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoViajanteAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public void setParametrizacaoViajanteAprovacao(ParametrizacaoViajanteAprovacao value) {
        this.parametrizacaoViajanteAprovacao = value;
    }

}
