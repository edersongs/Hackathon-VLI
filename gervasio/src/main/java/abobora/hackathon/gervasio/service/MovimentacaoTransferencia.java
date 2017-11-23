package abobora.hackathon.gervasio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.exceptions.MovimentacaoExcpetion;
import abobora.hackathon.gervasio.repository.AtivoRepository;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Service
public class MovimentacaoTransferencia implements MovimentacaoEstoqueService{
	
	@Autowired MovimentacaoEntrada movimentacaoEntrada;
	@Autowired MovimentacaoSaida movimentacaoSaida;
	@Autowired AtivoRepository ativoRepository;

	@Override
	public void movimentarEstoque(MovimentacaoEstoque movimentacaoEstoque) throws MovimentacaoExcpetion {
		
		movimentacaoSaida.movimentarEstoque(movimentacaoEstoque);
		MovimentacaoEstoque movimentacaoEstoqueInvertida = inverterOrigemDestino(movimentacaoEstoque);
		movimentacaoEntrada.movimentarEstoque(movimentacaoEstoqueInvertida);
		
	}

	/**
	 * @param movimentacaoEstoque
	 * @return
	 */
	private MovimentacaoEstoque inverterOrigemDestino(MovimentacaoEstoque movimentacaoEstoque) {
		MovimentacaoEstoque movimentacaoEstoqueInvertida = new MovimentacaoEstoque();
		
		movimentacaoEstoqueInvertida.setFilialDestino(movimentacaoEstoque.getFilialOrigem());
		movimentacaoEstoqueInvertida.setFilialOrigem(movimentacaoEstoque.getFilialDestino());
		movimentacaoEstoqueInvertida.setModelo(movimentacaoEstoque.getModelo());
		movimentacaoEstoqueInvertida.setSubInventarioDestino(movimentacaoEstoque.getSubInventarioOrigem());
		movimentacaoEstoqueInvertida.setSubInventarioOrigem(movimentacaoEstoque.getSubInventarioDestino());
		movimentacaoEstoqueInvertida.setQuantidade(movimentacaoEstoque.getQuantidade());
				
		return movimentacaoEstoqueInvertida;
	}

}
