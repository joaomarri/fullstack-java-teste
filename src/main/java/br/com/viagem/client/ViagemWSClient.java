package br.com.viagem.client;


import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.namespace.QName;
import javax.xml.transform.TransformerException;

import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import br.com.viagem.schema.PesquisarSolicitacaoRequest;
import br.com.viagem.schema.PesquisarSolicitacaoResponse;
import br.com.viagem.util.DateUtil;

/**
 * Componente client ws utilizado para se comunicar via SOAP com o serviço pesquisarSolicitacao 
 * @author joaopaulo
 *
 */

@Component
public class ViagemWSClient extends WebServiceGatewaySupport {
	
    @SuppressWarnings("unchecked")
	public PesquisarSolicitacaoResponse consultaViagensUltimos3Meses() throws DatatypeConfigurationException {
	   
        Date dataHoje = new Date();
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
        request.setDataInicial( DateUtil.somaDecrementaMes(dataHoje, -3) );
        request.setDataFinal( DateUtil.toXmlGregorianCalendar(dataHoje) );
        request.setRegistroInicial(1);
        request.setQuantidadeRegistros(50);
        request.setSincronizado(false);
        request.setExibirRemarks(true);
        
        JAXBElement<PesquisarSolicitacaoResponse> response = (JAXBElement<PesquisarSolicitacaoResponse>) getWebServiceTemplate().marshalSendAndReceive(request, new WebServiceMessageCallback(){
            public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                soapMessage.getEnvelope().addNamespaceDeclaration("ns3", "http://lemontech.com.br/selfbooking/wsselfbooking/services");
                
                SoapHeader soapHeader = soapMessage.getSoapHeader();
                QName password = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword", "ns3");
                soapHeader.addHeaderElement(password).setText("99b298667fed7a2edc2e2af2ad9e143c");
                
                QName username = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName", "ns3");
                soapHeader.addHeaderElement(username).setText("278849f1577f07488c18bfd5b0892160");
                
                QName keyClient = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient", "ns3");
                soapHeader.addHeaderElement(keyClient).setText("base_teste_qa");
                
            }
        });
        
         
        return response.getValue();
	 }
	
	
}
