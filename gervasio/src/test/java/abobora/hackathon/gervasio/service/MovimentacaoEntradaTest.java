/**
 * 
 */
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
public class MovimentacaoEntradaTest {
	
	@Autowired private MovimentacaoEntrada movimentacaoEntrada;
	
	@Test
	public void testMovEntradaSucesso() {
		MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
		
		Ativo ativo = new Ativo();
		ativo.setCodigo(1L);
		
		Modelo modelo = new Modelo();
		modelo.setCodigo(1L);
		
		
		SubInventario subInventarioDestino = new SubInventario();
		subInventarioDestino.setCodigo(1L);
		
		Filial filialDestino = new Filial();
		filialDestino.setCodigo(1100015L);
		
		
		movimentacaoEstoque.setModelo(modelo);
		movimentacaoEstoque.setFilialDestino(filialDestino);
		movimentacaoEstoque.setSubInventarioDestino(subInventarioDestino);
		movimentacaoEstoque.setQuantidade(10L);
		
		movimentacaoEntrada.movimentarEstoque(movimentacaoEstoque);
	}

}
