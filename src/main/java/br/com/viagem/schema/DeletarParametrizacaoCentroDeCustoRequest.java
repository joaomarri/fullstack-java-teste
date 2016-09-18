//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.09.18 às 12:24:25 PM BRT 
//


package br.com.viagem.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deletarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoSolicitacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoSolicitacaoRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacaoCentroDeCustoDebitoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoDebitoRef"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarParametrizacaoCentroDeCustoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "parametrizacaoCentroDeCustoAprovacaoRef",
    "parametrizacaoCentroDeCustoSolicitacaoRef",
    "parametrizacaoCentroDeCustoDebitoRef"
})
public class DeletarParametrizacaoCentroDeCustoRequest {

    protected ParametrizacaoCentroDeCustoAprovacaoRef parametrizacaoCentroDeCustoAprovacaoRef;
    protected ParametrizacaoCentroDeCustoSolicitacaoRef parametrizacaoCentroDeCustoSolicitacaoRef;
    protected ParametrizacaoCentroDeCustoDebitoRef parametrizacaoCentroDeCustoDebitoRef;

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoAprovacaoRef getParametrizacaoCentroDeCustoAprovacaoRef() {
        return parametrizacaoCentroDeCustoAprovacaoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoAprovacaoRef(ParametrizacaoCentroDeCustoAprovacaoRef value) {
        this.parametrizacaoCentroDeCustoAprovacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoSolicitacaoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoSolicitacaoRef getParametrizacaoCentroDeCustoSolicitacaoRef() {
        return parametrizacaoCentroDeCustoSolicitacaoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoSolicitacaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoSolicitacaoRef(ParametrizacaoCentroDeCustoSolicitacaoRef value) {
        this.parametrizacaoCentroDeCustoSolicitacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoDebitoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoDebitoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoDebitoRef getParametrizacaoCentroDeCustoDebitoRef() {
        return parametrizacaoCentroDeCustoDebitoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoDebitoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoDebitoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoDebitoRef(ParametrizacaoCentroDeCustoDebitoRef value) {
        this.parametrizacaoCentroDeCustoDebitoRef = value;
    }

}
