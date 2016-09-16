package br.com.viagem.client;

import java.io.StringReader;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.ws.client.core.WebServiceTemplate;

public class WebServiceClient {
  
  
  
  private static final String MESSAGE =
      "pesquisarSolicitacao";

  private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

  public void setDefaultUri(String defaultUri) {
      webServiceTemplate.setDefaultUri(defaultUri);
  }

  // send to the configured default URI
  public void simpleSendAndReceive() {
      StreamSource source = new StreamSource(new StringReader(MESSAGE));
      StreamResult result = new StreamResult(System.out);
      webServiceTemplate.sendSourceAndReceiveToResult(source, result);
  }

  // send to an explicit URI
  public void customSendAndReceive() {
      StreamSource source = new StreamSource(new StringReader(MESSAGE));
      StreamResult result = new StreamResult(System.out);
      webServiceTemplate.sendSourceAndReceiveToResult("https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService",
          source, result);
  }
  
 /* public testService() {
    RequestPayload requestPayload = new RequestPayload();
    requestPayload.setKeyClient("base_teste_qa");
    requestPayload.setUserName("278849f1577f07488c18bfd5b0892160");
    requestPayload.setUserPassword("99b298667fed7a2edc2e2af2ad9e143c");
    StreamResult result = new StreamResult(System.out);
    webServiceTemplate.sendSourceAndReceiveToResult("https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService",
        requestPayload, result);
    
    webServiceTemplate.sendSourceAndReceiveToResult
  }*/

}
