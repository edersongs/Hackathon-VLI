package abobora.hackathon.gervasio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.domain.TipoMovimentacao;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */

@Component
public class MovimentacaoFactory {
	
	@Autowired
	private MovimentacaoEntrada movimentacaoEntrada;
	@Autowired
	private MovimentacaoSaida movimentacaoSaida;
	@Autowired
	private MovimentacaoTransferencia movimentacaoTransferencia;
	
	public MovimentacaoEstoqueService getInstance(MovimentacaoEstoque movimentacaoEstoque){
		
		if(TipoMovimentacao.ENTRADA.equals(movimentacaoEstoque.getTipoMovimentacao())){
			return movimentacaoEntrada;
		}
		
		if(TipoMovimentacao.SAIDA.equals(movimentacaoEstoque.getTipoMovimentacao())){
			return movimentacaoSaida;
		}
		
		if(TipoMovimentacao.TRANSFERENCIA.equals(movimentacaoEstoque.getTipoMovimentacao())){
			return movimentacaoTransferencia;
		}
		
		return null;
	}
	
	

}
