<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>Consulta de Solicitações de Viagens</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
     <!-- Bootstrap Stylesheets http://getbootstrap.com -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet"> 
    
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/fullstack-java-teste/">Consulta</a>
        </div>
    </div>
</nav>
<div class="container">

<div class="row">
	<div class="col-lg-12">
		<h2 class="page-header" style="padding-top: 30px;">Consulta de Solicitações de Viagens dos últimos 3 meses</h2>
	</div>
</div>

<div class="row">
<table class="table table-bordered table-striped">
<thead>
<tr>
	<th>id Solicitação</th>
	<th>Nome Passageiro</th>
	<th>Nome Cia</th>
	<th>Data/Hora Saida</th>
	<th>Data/Hora Chegada</th>
	<th>Cidade Origem</th>
	<th>Cidade Destino</th>
</tr>
</thead>
<tbody>
	<c:forEach items="${viagens}" var="viagem">
		<tr>
			<td>${viagem.idSolicitacao}</td>
			<td>${viagem.nomePassageiro}</td>
			<td>${viagem.companhiaArea}</td>
			<td><fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${viagem.dataSaida}" /></td>
			<td><fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${viagem.dataChegada}" /></td>
			<td>${viagem.cidadeOrigem}</td>
			<td>${viagem.cidadeDestino}</td>
		</tr>
	</c:forEach>
<tbody> 
</table>
</div>

<div class="row">
	<h4>${msg}</h4>
</div>

</div>

</body>
<footer>
    <div class="container">
        <p class="text-center"><a href="https://github.com/joaomarri/fullstack-java-teste" target="_blank">github</a></p>
    </div>
</footer>
</html>