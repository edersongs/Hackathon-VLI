package abobora.hackathon.gervasio.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Entity
@Table(name = "testoque")
public class Estoque {

	@EmbeddedId
	private EstoqueId estoqueID;
	
	private Long quantidade;
	private Long quantidadeReserva;

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	public Long getQuantidadeReserva() {
		return quantidadeReserva;
	}
	
	public void setQuantidadeReserva(Long quantidadeReserva) {
		this.quantidadeReserva = quantidadeReserva;
	}
	
	public EstoqueId getEstoqueID() {
		return estoqueID;
	}

	public void setEstoqueID(EstoqueId estoqueID) {
		this.estoqueID = estoqueID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estoqueID == null) ? 0 : estoqueID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		if (estoqueID == null) {
			if (other.estoqueID != null)
				return false;
		} else if (!estoqueID.equals(other.estoqueID))
			return false;
		return true;
	}
}
