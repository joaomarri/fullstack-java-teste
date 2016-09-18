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
 * <p>Classe Java de regime.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="regime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAFE_DA_MANHA"/&gt;
 *     &lt;enumeration value="MEIA_PENSAO"/&gt;
 *     &lt;enumeration value="PENSAO_COMPLETA"/&gt;
 *     &lt;enumeration value="ALL_INCLUSIVE"/&gt;
 *     &lt;enumeration value="SO_HOSPEDAGEM"/&gt;
 *     &lt;enumeration value="JANTAR"/&gt;
 *     &lt;enumeration value="NAO_INCLUI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "regime", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum Regime {

    CAFE_DA_MANHA,
    MEIA_PENSAO,
    PENSAO_COMPLETA,
    ALL_INCLUSIVE,
    SO_HOSPEDAGEM,
    JANTAR,
    NAO_INCLUI;

    public String value() {
        return name();
    }

    public static Regime fromValue(String v) {
        return valueOf(v);
    }

}
