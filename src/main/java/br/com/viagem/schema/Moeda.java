//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.09.18 às 12:24:25 PM BRT 
//


package br.com.viagem.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de moeda.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="moeda"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="NUC"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "moeda", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum Moeda {

    ARS,
    BRL,
    USD,
    NUC,
    EUR,
    GBP,
    JPY,
    CNY,
    PLN,
    KHR,
    CAD,
    MXN,
    COP,
    AFA,
    PEN,
    SGD,
    ZAR,
    PYG,
    CLP,
    CHF;

    public String value() {
        return name();
    }

    public static Moeda fromValue(String v) {
        return valueOf(v);
    }

}
