package abobora.hackathon.gervasio.domain;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
public class Estoque {

	private Modelo modelo;
	private Filial filial;
	private SubInventario subInventario;
	private Long quantidade;
	private Long quantidadeReserva;

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public SubInventario getSubInventario() {
		return subInventario;
	}

	public void setSubInventario(SubInventario subInventario) {
		this.subInventario = subInventario;
	}

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

}
