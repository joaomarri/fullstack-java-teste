Consulta de Solicitações de Viagens
===============================
Aplicação Web java desenvolvida para pode testar a chamada do serviço SOAP pesqisarSolicitacao e pode persisitir os dados em algum Banco de dados.

###1. Technologias utilizadas
* Java 8
* Maven 3.3
* Spring 4.3.2.RELEASE
* HSQLDB 2.3.2
* Hibernate 4.3.6

###2. Arquitetura
Esse projeto foi desenvolvido com o padrão MVC para camada de apresentação dos dados, a utilização do padrão ORM para a persistencia das informações e a customização de um componente client para consumir a API de serviços SOAP.
Foi utilizado o SGDB HSQL de modo embedado na aplicação e por isso não é necessario a instalação e configuração de algum banco de dados para pode executar esse projeto para teste local. 

###3. Para executar este projeto local
```shell
$ git clone https://github.com/joaomarri/fullstack-java-teste
$ mvn jetty:run
```
Acesse ```http://localhost:8080/fullstack-java-teste/```

Obs: Depois de acessar a url acima verifique os dados gravados no banco utilizando a ferrmenta 
HSQL Database Manager que já esta configurado no projeto e será apresentada ao usuario.

Para consultar os dados no banco: ```select * from viagem```

###4. Para importar esse projeto no Eclipse IDE
1. ```$ mvn eclipse:eclipse```
2. Importe para o Eclipse via opção: Import **Existing mavem projects**.
3. Selecione o projeto que deseja importar e clique em finish.

