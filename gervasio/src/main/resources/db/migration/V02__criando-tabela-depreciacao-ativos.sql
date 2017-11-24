CREATE TABLE tdepreciacaoAtivos (
	codigo BIGINT(20) PRIMARY KEY,
	valorDepreciado NUMERIC(18,4) NOT NULL,
	dataBaixa date NULL,
	tipoBaixa VARCHAR(200) NULL,
	valorBaixa NUMERIC(18,4) NULL,
	codigoAtivo BIGINT(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;