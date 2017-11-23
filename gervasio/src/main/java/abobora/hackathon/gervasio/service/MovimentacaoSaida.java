package abobora.hackathon.gervasio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import abobora.hackathon.gervasio.domain.Estoque;
import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.exceptions.MovimentacaoExcpetion;
import abobora.hackathon.gervasio.repository.EstoqueRepository;
import abobora.hackathon.gervasio.repository.MovimentacaoRepository;

/**
 * @author Eduardo Silva Rosa 
 *         edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr 
 *         + 55 (34) 9 9179-4411
 *
 */
@Service
public class MovimentacaoSaida implements MovimentacaoEstoqueService {

	@Autowired
	private EstoqueRepository estoqueRepository;
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;

	@Override
	public void movimentarEstoque(MovimentacaoEstoque movimentacaoEstoque) throws MovimentacaoExcpetion {

		Estoque estoqueConsulta = new Estoque();
		estoqueConsulta.getEstoqueID().setFilial(movimentacaoEstoque.getFilialOrigem());
		estoqueConsulta.getEstoqueID().setSubInventario(movimentacaoEstoque.getSubInventarioDestino());
		estoqueConsulta.getEstoqueID().setModelo(movimentacaoEstoque.getModelo());

		Example<Estoque> example = Example.of(estoqueConsulta);

		Estoque estoque = estoqueRepository.findOne(example);

		if (estoque.getQuantidade() - estoque.getQuantidadeReserva() > movimentacaoEstoque.getQuantidade()) {
			// incrementar estoque
			estoqueRepository.decrementarEstoque(movimentacaoEstoque);
			// salvar movimentacao
			movimentacaoRepository.save(movimentacaoEstoque);
		}else {
			throw new MovimentacaoExcpetion("Quantidade insuficienta para realizar a saída");
		}

	}

}
