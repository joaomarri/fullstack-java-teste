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
 * <p>Classe Java de tipoApartamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoApartamento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDIVIDUAL"/&gt;
 *     &lt;enumeration value="DUPLO"/&gt;
 *     &lt;enumeration value="TRIPO"/&gt;
 *     &lt;enumeration value="QUADRUPLO"/&gt;
 *     &lt;enumeration value="TWIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoApartamento", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoApartamento {

    INDIVIDUAL,
    DUPLO,
    TRIPO,
    QUADRUPLO,
    TWIN;

    public String value() {
        return name();
    }

    public static TipoApartamento fromValue(String v) {
        return valueOf(v);
    }

}
