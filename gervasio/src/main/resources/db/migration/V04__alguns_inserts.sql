insert into tstatusAtivo (codigo,descricao) values (1,'Ativo');
insert into tstatusAtivo (codigo,descricao) values (2,'Danificado');
insert into tstatusAtivo (codigo,descricao) values (3,'Manutenção');
insert into tstatusAtivo (codigo,descricao) values (4,'Transferindo');
insert into tstatusAtivo (codigo,descricao) values (5,'Recebido');
insert into tstatusAtivo (codigo,descricao) values (6,'Baixado');



insert into tsubinventario (codigo,descricao) values (1,'RECEBIMENTO');


insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 1, 1, 40, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (2, 2, 1, 55, 1);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (3, 3, 1, 40, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (5, 4, 1, 55, 1);

insert into tmovimentacaoestoque (	codigo ,codigomodelo, codigoFilialOrigem , codigoSubinventarioOrigem , codigoFilialDestino ,	codigoSubinventarioDestino , quantidade ) values (1, 1, 1, 1, 2, 1,9);

insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (1, 1,  2);
insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (2, 2,  1);
insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (3, 3,  4);
insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (4, 4,  3);
