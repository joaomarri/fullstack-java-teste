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
 * <p>Classe Java de deslocamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deslocamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitudeOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longitudeOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitudeDestino" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longitudeDestino" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distanciaPercorrida" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deslocamento", propOrder = {
    "latitudeOrigem",
    "longitudeOrigem",
    "latitudeDestino",
    "longitudeDestino",
    "distanciaPercorrida"
})
public class Deslocamento {

    @XmlElement(required = true)
    protected String latitudeOrigem;
    @XmlElement(required = true)
    protected String longitudeOrigem;
    @XmlElement(required = true)
    protected String latitudeDestino;
    @XmlElement(required = true)
    protected String longitudeDestino;
    protected double distanciaPercorrida;

    /**
     * Obtém o valor da propriedade latitudeOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeOrigem() {
        return latitudeOrigem;
    }

    /**
     * Define o valor da propriedade latitudeOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeOrigem(String value) {
        this.latitudeOrigem = value;
    }

    /**
     * Obtém o valor da propriedade longitudeOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeOrigem() {
        return longitudeOrigem;
    }

    /**
     * Define o valor da propriedade longitudeOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeOrigem(String value) {
        this.longitudeOrigem = value;
    }

    /**
     * Obtém o valor da propriedade latitudeDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDestino() {
        return latitudeDestino;
    }

    /**
     * Define o valor da propriedade latitudeDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDestino(String value) {
        this.latitudeDestino = value;
    }

    /**
     * Obtém o valor da propriedade longitudeDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDestino() {
        return longitudeDestino;
    }

    /**
     * Define o valor da propriedade longitudeDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDestino(String value) {
        this.longitudeDestino = value;
    }

    /**
     * Obtém o valor da propriedade distanciaPercorrida.
     * 
     */
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    /**
     * Define o valor da propriedade distanciaPercorrida.
     * 
     */
    public void setDistanciaPercorrida(double value) {
        this.distanciaPercorrida = value;
    }

}
