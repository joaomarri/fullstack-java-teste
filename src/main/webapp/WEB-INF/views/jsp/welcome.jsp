<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
<h1>Consulta de Solicitações de Viagens dos ultimos 3 meses</h1>

<table border=1 cellspacing=0 cellpadding=2>
<tr>
	<th>id Solicitação</th>
	<th>Nome Passageiro</th>
	<th>Nome Cia</th>
	<th>Data/Hora Saida</th>
	<th>Data/Hora Chegada</th>
	<th>Cidade Origem</th>
	<th>Cidade Destino</th>
</tr>
	<c:forEach items="${viagens}" var="viagem">
		<tr>
			<td>${viagem.idSolicitacao}</td>
			<td>${viagem.nomePassageiro}</td>
			<td>${viagem.companhiaArea}</td>
			<td><fmt:formatDate pattern="dd-MM-yyyy HH:mm:ss" value="${viagem.dataSaida}" /></td>
			<td><fmt:formatDate pattern="dd-MM-yyyy HH:mm:ss" value="${viagem.dataChegada}" /></td>
			<td>${viagem.cidadeOrigem}</td>
			<td>${viagem.cidadeDestino}</td>
		</tr>
	</c:forEach>
</table>

<h4>${msg}</h4>

</body>
</html>