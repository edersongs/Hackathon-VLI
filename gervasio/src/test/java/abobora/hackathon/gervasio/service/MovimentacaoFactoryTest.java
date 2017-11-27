package abobora.hackathon.gervasio.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.domain.enums.TipoMovimentacao;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovimentacaoFactoryTest {
	
	@Autowired MovimentacaoFactory movimentacaoFactory;
	
	private MovimentacaoEstoque movimentacaoEntrada;
	private MovimentacaoEstoque movimentacaoSaida;
	private MovimentacaoEstoque movimentacaoTransferencia;
	
	@Before
	public void before(){
		movimentacaoEntrada = new MovimentacaoEstoque();
		movimentacaoSaida = new MovimentacaoEstoque();
		movimentacaoTransferencia = new MovimentacaoEstoque();
		
		movimentacaoEntrada.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacaoSaida.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacaoTransferencia.setTipoMovimentacao(TipoMovimentacao.TRANSFERENCIA);
	}
	
	@Test
	public void factoryCriaMovimentacaoEntrada(){
		MovimentacaoEstoqueService service = movimentacaoFactory.getInstance(movimentacaoEntrada);
		Assert.assertTrue(service instanceof MovimentacaoEntrada);
	}
	
	@Test
	public void factoryCriaMovimentacaoSaida(){
		MovimentacaoEstoqueService service = movimentacaoFactory.getInstance(movimentacaoSaida);
		Assert.assertTrue(service instanceof MovimentacaoSaida);
	}
	
	@Test
	public void factoryCriaMovimentacaoTransferencia(){
		MovimentacaoEstoqueService service = movimentacaoFactory.getInstance(movimentacaoTransferencia);
		Assert.assertTrue(service instanceof MovimentacaoTransferencia);
	}
}
