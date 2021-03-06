package abobora.hackathon.gervasio.service;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.exceptions.MovimentacaoExcpetion;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411
 *
 */
public interface MovimentacaoEstoqueService {
	
	public void movimentarEstoque(MovimentacaoEstoque movimentacaoEstoque) throws MovimentacaoExcpetion;

}
