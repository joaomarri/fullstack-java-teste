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
 * <p>Classe Java de parametrizacaoViajanteAprovacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoViajanteAprovacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="periodoViagemFinal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="valorAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoViajanteAprovacao", propOrder = {
    "periodoViagemFinal",
    "valorAlcadaInicial",
    "valorAlcadaFinal",
    "vencimento"
})
public class ParametrizacaoViajanteAprovacao
    extends ParametrizacaoViajanteAprovacaoRef
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoViagemFinal;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaInicial;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaFinal;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;

    /**
     * Obtém o valor da propriedade periodoViagemFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }

    /**
     * Define o valor da propriedade periodoViagemFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoViagemFinal(XMLGregorianCalendar value) {
        this.periodoViagemFinal = value;
    }

    /**
     * Obtém o valor da propriedade valorAlcadaInicial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }

    /**
     * Define o valor da propriedade valorAlcadaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaInicial(Double value) {
        this.valorAlcadaInicial = value;
    }

    /**
     * Obtém o valor da propriedade valorAlcadaFinal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }

    /**
     * Define o valor da propriedade valorAlcadaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaFinal(Double value) {
        this.valorAlcadaFinal = value;
    }

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

}
