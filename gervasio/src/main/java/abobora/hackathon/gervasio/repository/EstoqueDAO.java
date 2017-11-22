package abobora.hackathon.gervasio.repository;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;

public interface EstoqueDAO {
	public void incrementarEstoque(MovimentacaoEstoque movimentacaoEstoque);
	public void decrementarEstoque(MovimentacaoEstoque movimentacaoEstoque);

}
