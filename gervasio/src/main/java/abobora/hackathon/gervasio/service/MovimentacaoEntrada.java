package abobora.hackathon.gervasio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abobora.hackathon.gervasio.domain.Estoque;
import abobora.hackathon.gervasio.domain.EstoqueId;
import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.repository.EstoqueRepository;
import abobora.hackathon.gervasio.repository.MovimentacaoRepository;

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
	
	@Autowired private EstoqueRepository estoqueRepository;
	@Autowired private MovimentacaoRepository movimentacaoRepository;
	
	@Override
	public void movimentarEstoque(MovimentacaoEstoque movimentacaoEstoque) {
		
		Estoque estoqueExemplo = new Estoque();
		EstoqueId estoqueId = new EstoqueId();
		
		estoqueId.setFilial(movimentacaoEstoque.getFilialDestino());
		estoqueId.setSubInventario(movimentacaoEstoque.getSubInventarioDestino());
		estoqueId.setModelo(movimentacaoEstoque.getModelo());
		
		estoqueExemplo.setEstoqueID(estoqueId);
		
		if(estoqueRepository.buscarPeloId(movimentacaoEstoque.getModelo().getCodigo(),
				movimentacaoEstoque.getFilialDestino().getCodigo(),movimentacaoEstoque.getSubInventarioDestino().getCodigo()) == null) {
			estoqueExemplo.setQuantidade(0L);
			estoqueExemplo.setQuantidadeReserva(0L);
			estoqueRepository.save(estoqueExemplo);
		}
		
		// incrementar estoque
		estoqueRepository.incrementarEstoque(movimentacaoEstoque);
		// salvar movimentacao
		movimentacaoRepository.save(movimentacaoEstoque);
	}

}
