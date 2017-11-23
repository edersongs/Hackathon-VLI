insert into tativo (codigo,descricao,dataAquisicao,valor,codigomodelo, codigofilial) values (1,'mesa','2016-03-05',300.00,1, 3170206);
insert into tativo (codigo,descricao,dataAquisicao,valor,codigomodelo, codigofilial) values (2,'cadeira','2017-03-05',200.00,2, 3170107);

insert into tmodelo (codigo,descricao) values (1,'modelo de mesa');
insert into tmodelo (codigo,descricao) values (2,'modelo de cadeira');

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
