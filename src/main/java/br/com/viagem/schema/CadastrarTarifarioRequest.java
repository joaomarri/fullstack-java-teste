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
 * <p>Classe Java de cadastrarTarifarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarTarifarioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioHotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorHotel"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioCarro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorCarro"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioOutro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorOutro"/&gt;
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
@XmlType(name = "cadastrarTarifarioRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "tarifarioHotel",
    "tarifarioCarro",
    "tarifarioOutro"
})
public class CadastrarTarifarioRequest {

    protected TarifarioFornecedorHotel tarifarioHotel;
    protected TarifarioFornecedorCarro tarifarioCarro;
    protected TarifarioFornecedorOutro tarifarioOutro;

    /**
     * Obtém o valor da propriedade tarifarioHotel.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorHotel }
     *     
     */
    public TarifarioFornecedorHotel getTarifarioHotel() {
        return tarifarioHotel;
    }

    /**
     * Define o valor da propriedade tarifarioHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorHotel }
     *     
     */
    public void setTarifarioHotel(TarifarioFornecedorHotel value) {
        this.tarifarioHotel = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioCarro.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorCarro }
     *     
     */
    public TarifarioFornecedorCarro getTarifarioCarro() {
        return tarifarioCarro;
    }

    /**
     * Define o valor da propriedade tarifarioCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorCarro }
     *     
     */
    public void setTarifarioCarro(TarifarioFornecedorCarro value) {
        this.tarifarioCarro = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioOutro.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorOutro }
     *     
     */
    public TarifarioFornecedorOutro getTarifarioOutro() {
        return tarifarioOutro;
    }

    /**
     * Define o valor da propriedade tarifarioOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorOutro }
     *     
     */
    public void setTarifarioOutro(TarifarioFornecedorOutro value) {
        this.tarifarioOutro = value;
    }

}
