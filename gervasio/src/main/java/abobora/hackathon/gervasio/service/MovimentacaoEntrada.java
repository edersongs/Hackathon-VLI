package abobora.hackathon.gervasio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.repository.EstoqueRepositorio;
import abobora.hackathon.gervasio.repository.MovimentacaoRepositorio;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Service
public class MovimentacaoEntrada implements MovimentacaoEstoqueService{
	
	@Autowired private EstoqueRepositorio estoqueRepositorio;
	@Autowired private MovimentacaoRepositorio movimentacaoRepositorio;
	
	@Override
	public void movimentarEstoque(MovimentacaoEstoque movimentacaoEstoque) {
		// incrementar estoque
		estoqueRepositorio.incrementarEstoque(movimentacaoEstoque);
		// salvar movimentacao
		movimentacaoRepositorio.save(movimentacaoEstoque);
	}

}
