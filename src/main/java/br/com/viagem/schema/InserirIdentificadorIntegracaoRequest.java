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
 * <p>Classe Java de inserirIdentificadorIntegracaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirIdentificadorIntegracaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorIntegracaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}identificadorIntegracaoRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirIdentificadorIntegracaoRequest", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request", propOrder = {
    "identificadorIntegracaoRef"
})
public class InserirIdentificadorIntegracaoRequest {

    @XmlElement(required = true)
    protected IdentificadorIntegracaoRef identificadorIntegracaoRef;

    /**
     * Obtém o valor da propriedade identificadorIntegracaoRef.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorIntegracaoRef }
     *     
     */
    public IdentificadorIntegracaoRef getIdentificadorIntegracaoRef() {
        return identificadorIntegracaoRef;
    }

    /**
     * Define o valor da propriedade identificadorIntegracaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorIntegracaoRef }
     *     
     */
    public void setIdentificadorIntegracaoRef(IdentificadorIntegracaoRef value) {
        this.identificadorIntegracaoRef = value;
    }

}
