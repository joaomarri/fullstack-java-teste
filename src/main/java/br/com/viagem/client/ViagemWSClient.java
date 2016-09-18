package br.com.viagem.client;


import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
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


@Component
public class ViagemWSClient extends WebServiceGatewaySupport {
	
    @SuppressWarnings("unchecked")
	public PesquisarSolicitacaoResponse getSolicitacoesDeViagem() throws DatatypeConfigurationException {
	   
        Date dataHoje = new Date();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(dataHoje);
        XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

        
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
        request.setDataInicial(data);
        request.setDataFinal(data);
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
  
  
	/*public AutenticarUsuarioResponse autenticarUsuario() {
		AutenticarUsuario request = new AutenticarUsuario();
		request.setLogin("primew01");
		request.setSenha("cl8V0DPt8Mw=");
		
		//setProxy();
		
		AutenticarUsuarioResponse response = (AutenticarUsuarioResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, 
				new SoapActionCallback("http://boticario.com.br/wsdadosvarejo/AutenticarUsuario")
		);
		
		return response;
	}

	public ListarRegionaisResponse getListarRegionais() {
		if (autenticarUsuario == null) {
			autenticarUsuario = autenticarUsuario();
		}
		
		ListarRegionais request = new ListarRegionais();
		request.setToken(autenticarUsuario.getAutenticarUsuarioResult());
		
		//setProxy();
		
		ListarRegionaisResponse response = (ListarRegionaisResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, 
				new SoapActionCallback("http://boticario.com.br/wsdadosvarejo/ListarRegionais")
		);
		
		return response;
	}
	
	public ListarFranquiasPorRegionalResponse getListarFranquiaPorRegional(Integer codigoRegional) {
		if (autenticarUsuario == null) {
			autenticarUsuario = autenticarUsuario();
		}
		//setProxy();
		
		ListarFranquiasPorRegional request = new ListarFranquiasPorRegional();
		request.setToken(autenticarUsuario.getAutenticarUsuarioResult());
		request.setCodigoRegional(codigoRegional);
		
		ListarFranquiasPorRegionalResponse response = (ListarFranquiasPorRegionalResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, 
				new SoapActionCallback("http://boticario.com.br/wsdadosvarejo/ListarFranquiasPorRegional")
		);
		
		return response;
	}
	
	public ListarMovimentacoesFranquiaResponse getListarMovimentacoesFranquia(Integer codigoFranquia) {
		if (autenticarUsuario == null) {
			autenticarUsuario = autenticarUsuario();
		}
		//setProxy();
		
		ListarMovimentacoesFranquia request = new ListarMovimentacoesFranquia();
		request.setToken(autenticarUsuario.getAutenticarUsuarioResult());
		request.setCodigoFranquia(codigoFranquia);
		
		ListarMovimentacoesFranquiaResponse response = (ListarMovimentacoesFranquiaResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, 
				new SoapActionCallback("http://boticario.com.br/wsdadosvarejo/ListarMovimentacoesFranquia")
		);
		
		return response;
	}*/
	
	
	
	
}
