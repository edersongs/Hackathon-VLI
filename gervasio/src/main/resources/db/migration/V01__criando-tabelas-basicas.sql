CREATE TABLE tativo (
	codigo BIGINT(20) auto_increment PRIMARY KEY ,
	descricao VARCHAR(200) NOT NULL,
	dataAquisicao date NOT NULL,
	valor NUMERIC(18,4) NOT NULL,
	codigoFilial BIGINT(20) NOT NULL,
	codigoModelo BIGINT(20),
	codigoStatus BIGINT(20),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tmodelo (
	codigo BIGINT(20) auto_increment PRIMARY KEY,
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tstatusAtivo (
	codigo BIGINT(20) auto_increment PRIMARY KEY,
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tfilial (
	codigo BIGINT(20) auto_increment PRIMARY KEY,
	nome VARCHAR(200) NOT NULL,
	sigla VARCHAR(200) NOT NULL,
	longitude VARCHAR(200) NOT NULL,
	latitude VARCHAR(200) NULL NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tsubinventario (
	codigo BIGINT(20) auto_increment PRIMARY KEY,
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE testoque (
	codigoModelo BIGINT(20) not null,
	codigoFilial BIGINT(20) not null,
	codigoSubinventario BIGINT(20) not null,
	quantidade BIGINT(20),
	quantidadeReserva BIGINT(20),
	PRIMARY KEY (codigoModelo, codigoFilial,codigoSubinventario)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tmovimentacaoestoque (
	codigo BIGINT(20) auto_increment not null,
	codigomodelo BIGINT(20) not null,
	codigoFilialOrigem BIGINT(20) ,
	codigoSubinventarioOrigem BIGINT(20) ,
	codigoFilialDestino BIGINT(20) ,
	codigoSubinventarioDestino BIGINT(20) ,
	quantidade BIGINT(20),
	PRIMARY KEY (codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE ttransferencia (
	codigo BIGINT(20) auto_increment not null,
	codigoFilialOrigem BIGINT(20) not null,
	codigoFilialDestino BIGINT(20) not null,
	PRIMARY KEY (codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE ttransferenciaItem (
	codigoTransferencia BIGINT(20) not null,
	codigoAtivo BIGINT(20) not null,
	PRIMARY KEY (codigoTransferencia,codigoAtivo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

