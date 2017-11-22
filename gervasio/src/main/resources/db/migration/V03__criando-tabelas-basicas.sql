CREATE TABLE tativo (
	codigo BIGINT(20) PRIMARY KEY,
	descricao VARCHAR(200) NOT NULL,
	data_aquisicao date NOT NULL,
	valor NUMERIC(18,4) NOT NULL,
	codigo_modelo BIGINT(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tmodelo (
	codigo BIGINT(20) PRIMARY KEY,
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tfilial (
	codigo BIGINT(20) PRIMARY KEY,
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tsubinventario (
	codigo BIGINT(20) PRIMARY KEY,
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
	codigo BIGINT(20) not null,
	codigomodelo BIGINT(20) not null,
	codigoFilialOrigem BIGINT(20) not null,
	codigoSubinventarioOrigem BIGINT(20) not null,
	codigoFilialDestino BIGINT(20) not null,
	codigoSubinventarioDestino BIGINT(20) not null,
	quantidade BIGINT(20),
	PRIMARY KEY (codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


