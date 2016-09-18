package br.com.viagem.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Classe utilitaria para pode realzar operações em objetos do tipo data
 * @author joaopaulo
 *
 */
public class DateUtil {

	public static XMLGregorianCalendar toXmlGregorianCalendar(Date data) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
        c.setTime(data);
        XMLGregorianCalendar xmlData = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        return xmlData;
	}
	
	public static XMLGregorianCalendar somaDecrementaMes(Date data, Integer meses) throws DatatypeConfigurationException {
		Calendar c = Calendar.getInstance(); 
		c.setTime(data); 
		c.add(Calendar.MONTH, meses);
		return toXmlGregorianCalendar(c.getTime());
	}
	
	public static Date toDate(XMLGregorianCalendar data) {
		if (data == null) {
			return null;
		}
		return data.toGregorianCalendar().getTime();
		
	}

}
