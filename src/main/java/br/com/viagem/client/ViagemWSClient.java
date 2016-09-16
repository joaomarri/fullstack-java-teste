package br.com.viagem.client;


import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


@Component
public class ViagemWSClient extends WebServiceGatewaySupport {

	/*private AutenticarUsuarioResponse autenticarUsuario;*/
	
      public void getSolicitacoesDeViagem() {
        RequestPayload requestPayload = new RequestPayload();
        requestPayload.setKeyClient("base_teste_qa");
        requestPayload.setUserName("278849f1577f07488c18bfd5b0892160");
        requestPayload.setUserPassword("99b298667fed7a2edc2e2af2ad9e143c");
	   
	    getWebServiceTemplate().marshalSendAndReceive(requestPayload, new SoapActionCallback(""));
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
