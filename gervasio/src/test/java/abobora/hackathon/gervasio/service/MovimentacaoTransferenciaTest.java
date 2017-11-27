package abobora.hackathon.gervasio.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import abobora.hackathon.gervasio.domain.Ativo;
import abobora.hackathon.gervasio.domain.Filial;
import abobora.hackathon.gervasio.domain.Modelo;
import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.domain.SubInventario;
import abobora.hackathon.gervasio.exceptions.MovimentacaoExcpetion;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovimentacaoTransferenciaTest {
	
	@Autowired private MovimentacaoTransferencia movTransferencia;

	@Test
	public void testMovEntradaSucesso() throws MovimentacaoExcpetion {
		MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
		
		Ativo ativo = new Ativo();
		ativo.setCodigo(1L);
		
		Modelo modelo = new Modelo();
		modelo.setCodigo(1L);
		
		
		SubInventario subInventarioDestino = new SubInventario();
		subInventarioDestino.setCodigo(1L);
		
		Filial filialDestino = new Filial();
		filialDestino.setCodigo(1L);
		
		SubInventario subInventarioOrigem = new SubInventario();
		subInventarioOrigem.setCodigo(1L);
		
		Filial filialOrigem = new Filial();
		filialOrigem.setCodigo(2L);
		
		
		movimentacaoEstoque.setModelo(modelo);
		movimentacaoEstoque.setFilialDestino(filialDestino);
		movimentacaoEstoque.setSubInventarioDestino(subInventarioDestino);
		
		movimentacaoEstoque.setFilialOrigem(filialOrigem);
		movimentacaoEstoque.setSubInventarioOrigem(subInventarioOrigem);
		
		movimentacaoEstoque.setQuantidade(10L);
		
		movTransferencia.movimentarEstoque(movimentacaoEstoque);
	}

}
