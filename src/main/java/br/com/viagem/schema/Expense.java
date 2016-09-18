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
 * <p>Classe Java de expense complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="expense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adiantamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamento" minOccurs="0"/&gt;
 *         &lt;element name="prestacaoContas" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expense", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", propOrder = {
    "adiantamento",
    "prestacaoContas"
})
public class Expense {

    protected Adiantamento adiantamento;
    protected PrestacaoContas prestacaoContas;

    /**
     * Obtém o valor da propriedade adiantamento.
     * 
     * @return
     *     possible object is
     *     {@link Adiantamento }
     *     
     */
    public Adiantamento getAdiantamento() {
        return adiantamento;
    }

    /**
     * Define o valor da propriedade adiantamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Adiantamento }
     *     
     */
    public void setAdiantamento(Adiantamento value) {
        this.adiantamento = value;
    }

    /**
     * Obtém o valor da propriedade prestacaoContas.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContas }
     *     
     */
    public PrestacaoContas getPrestacaoContas() {
        return prestacaoContas;
    }

    /**
     * Define o valor da propriedade prestacaoContas.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContas }
     *     
     */
    public void setPrestacaoContas(PrestacaoContas value) {
        this.prestacaoContas = value;
    }

}
