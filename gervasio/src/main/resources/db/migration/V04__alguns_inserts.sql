insert into tstatusAtivo (codigo,descricao) values (1,'Ativo');
insert into tstatusAtivo (codigo,descricao) values (2,'Danificado');
insert into tstatusAtivo (codigo,descricao) values (3,'Manutenção');
insert into tstatusAtivo (codigo,descricao) values (4,'Transferindo');
insert into tstatusAtivo (codigo,descricao) values (5,'Recebido');
insert into tstatusAtivo (codigo,descricao) values (6,'Baixado');



insert into tsubinventario (codigo,descricao) values (1,'RECEBIMENTO');


insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 3170206, 1, 40, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 3170107, 1, 55, 1);

insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 1100056, 1, 20, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 1200013, 1, 90, 1);

insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 5300108, 1, 100, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 4112306, 1, 515, 1);

insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 5222005, 1, 10, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 5220405, 1, 9, 1);

insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 3115458, 1, 10, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 3113404, 1, 25, 1);

insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 2602308, 1, 110, 2);
insert into testoque (codigoModelo, codigoFilial, codigoSubinventario, quantidade, quantidadeReserva) values (1, 4120101, 1, 558, 1);


insert into tmovimentacaoestoque (	codigo ,codigomodelo, codigoFilialOrigem , codigoSubinventarioOrigem , codigoFilialDestino ,	codigoSubinventarioDestino , quantidade ) values (1, 1,1100015, 1, 1100023, 1,9);

insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (1, 1100015,  1100023);
insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (2, 1101609,  5221601);
insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (3, 5211008,  1200104);
insert into ttransferencia ( codigo , codigoFilialOrigem ,  codigoFilialDestino ) values (4, 1200203,  1200336);