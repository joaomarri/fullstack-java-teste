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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de formaPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="formaPagamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="formaPagameno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vencimentoCartao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numeroRequisicaoGov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumTipoFormaPagamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formaPagamento", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", propOrder = {
    "autorizacao",
    "numero",
    "parcelas",
    "valor",
    "formaPagameno",
    "vencimentoCartao",
    "numeroRequisicaoGov",
    "tipo"
})
public class FormaPagamento {

    protected String autorizacao;
    protected String numero;
    protected Integer parcelas;
    protected Double valor;
    @XmlElement(required = true)
    protected String formaPagameno;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vencimentoCartao;
    protected String numeroRequisicaoGov;
    @XmlSchemaType(name = "string")
    protected EnumTipoFormaPagamento tipo;

    /**
     * Obtém o valor da propriedade autorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacao() {
        return autorizacao;
    }

    /**
     * Define o valor da propriedade autorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacao(String value) {
        this.autorizacao = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParcelas(Integer value) {
        this.parcelas = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade formaPagameno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagameno() {
        return formaPagameno;
    }

    /**
     * Define o valor da propriedade formaPagameno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagameno(String value) {
        this.formaPagameno = value;
    }

    /**
     * Obtém o valor da propriedade vencimentoCartao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoCartao() {
        return vencimentoCartao;
    }

    /**
     * Define o valor da propriedade vencimentoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoCartao(XMLGregorianCalendar value) {
        this.vencimentoCartao = value;
    }

    /**
     * Obtém o valor da propriedade numeroRequisicaoGov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRequisicaoGov() {
        return numeroRequisicaoGov;
    }

    /**
     * Define o valor da propriedade numeroRequisicaoGov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRequisicaoGov(String value) {
        this.numeroRequisicaoGov = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoFormaPagamento }
     *     
     */
    public EnumTipoFormaPagamento getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoFormaPagamento }
     *     
     */
    public void setTipo(EnumTipoFormaPagamento value) {
        this.tipo = value;
    }

}
