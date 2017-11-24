/**
 * 
 */
package abobora.hackathon.gervasio.service;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import abobora.hackathon.gervasio.domain.Ativo;
import abobora.hackathon.gervasio.domain.Estoque;
import abobora.hackathon.gervasio.domain.EstoqueId;
import abobora.hackathon.gervasio.domain.Filial;
import abobora.hackathon.gervasio.domain.Modelo;
import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.domain.SubInventario;
import abobora.hackathon.gervasio.exceptions.MovimentacaoExcpetion;
import abobora.hackathon.gervasio.repository.EstoqueRepository;

/**
 * @author Eduardo Silva Rosa
 *         edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr
 *         + 55 (34) 9 9179-4411    
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovimentacaoSaidaTest {
	
	@Autowired private MovimentacaoSaida movimentacaoSaida;
	@Autowired private EstoqueRepository estoqueRepository;
	
	@Test
	public void testMovSaidaSucesso() throws MovimentacaoExcpetion {
		MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
		
		Ativo ativo = new Ativo();
		ativo.setCodigo(1L);
		
		Modelo modelo = new Modelo();
		modelo.setCodigo(1L);
		
		
		SubInventario subInventarioDestino = new SubInventario();
		subInventarioDestino.setCodigo(1L);
		
		Filial filialDestino = new Filial();
		filialDestino.setCodigo(1L);
		
		Estoque estoque = new Estoque();
		EstoqueId estoqueId = new EstoqueId();
		estoqueId.setFilial(filialDestino);
		estoqueId.setSubInventario(subInventarioDestino);
		estoqueId.setModelo(modelo);
		
		estoque.setEstoqueID(estoqueId);
		estoque.setQuantidade(100L);
		estoque.setQuantidadeReserva(0L);
		
		estoqueRepository.save(estoque);
		
		movimentacaoEstoque.setModelo(modelo);
		movimentacaoEstoque.setFilialOrigem(filialDestino);
		movimentacaoEstoque.setSubInventarioOrigem(subInventarioDestino);
		movimentacaoEstoque.setQuantidade(10L);
		
		movimentacaoSaida.movimentarEstoque(movimentacaoEstoque);
	}
	
	@Test(expected = MovimentacaoExcpetion.class)
	public void testMovSaidaFalhaReserva() throws MovimentacaoExcpetion {
		MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
		
		Ativo ativo = new Ativo();
		ativo.setCodigo(1L);
		
		Modelo modelo = new Modelo();
		modelo.setCodigo(1L);
		
		
		SubInventario subInventarioDestino = new SubInventario();
		subInventarioDestino.setCodigo(1L);
		
		Filial filialDestino = new Filial();
		filialDestino.setCodigo(2L);
		
		Estoque estoque = new Estoque();
		EstoqueId estoqueId = new EstoqueId();
		estoqueId.setFilial(filialDestino);
		estoqueId.setSubInventario(subInventarioDestino);
		estoqueId.setModelo(modelo);
		
		estoque.setEstoqueID(estoqueId);
		estoque.setQuantidade(100L);
		estoque.setQuantidadeReserva(99L);
		
		estoqueRepository.save(estoque);
		
		
		movimentacaoEstoque.setModelo(modelo);
		movimentacaoEstoque.setFilialOrigem(filialDestino);
		movimentacaoEstoque.setSubInventarioOrigem(subInventarioDestino);
		movimentacaoEstoque.setQuantidade(10L);
		
		movimentacaoSaida.movimentarEstoque(movimentacaoEstoque);
	}
	
	@After
	public void after() {
		estoqueRepository.deleteAll();
	}

}
