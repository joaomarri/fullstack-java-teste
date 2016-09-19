

CREATE TABLE viagem (
  idSolicitacao  INTEGER PRIMARY KEY,
  nomePassageiro VARCHAR(200),
  companhiaArea  VARCHAR(100),
  dataSaida TIMESTAMP,
  dataChegada TIMESTAMP,
  cidadeOrigem   VARCHAR(100),
  cidadeDestino  VARCHAR(100)
);
