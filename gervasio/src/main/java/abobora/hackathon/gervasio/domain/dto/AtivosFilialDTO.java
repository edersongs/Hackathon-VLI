/**
 * 
 */
package abobora.hackathon.gervasio.domain.dto;

import java.math.BigDecimal;

/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */

public class AtivosFilialDTO {

	private String filial;
	private Long quantidadeTotal;
	private BigDecimal valorTotal;
	
	public AtivosFilialDTO() {}
	
	public AtivosFilialDTO(String filial, Long quantidadeTotal) {

		this.filial = filial;
		this.quantidadeTotal = quantidadeTotal;
	}

	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public Long getQuantidadeTotal() {
		return quantidadeTotal;
	}
	public void setQuantidadeTotal(Long quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
}
