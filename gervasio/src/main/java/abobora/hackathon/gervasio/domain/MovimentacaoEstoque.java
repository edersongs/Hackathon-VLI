package abobora.hackathon.gervasio.domain;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */

public class MovimentacaoEstoque {

	private Long codigo;
	private Modelo modelo;
	private Filial filialOrigem;
	private SubInventario subInventarioOrigem;
	private Filial filialDestino;
	private SubInventario subInventarioDestino;
	private TipoMovimentacao tipoMovimentacao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Filial getFilialOrigem() {
		return filialOrigem;
	}

	public void setFilialOrigem(Filial filialOrigem) {
		this.filialOrigem = filialOrigem;
	}

	public SubInventario getSubInventarioOrigem() {
		return subInventarioOrigem;
	}

	public void setSubInventarioOrigem(SubInventario subInventarioOrigem) {
		this.subInventarioOrigem = subInventarioOrigem;
	}

	public Filial getFilialDestino() {
		return filialDestino;
	}

	public void setFilialDestino(Filial filialDestino) {
		this.filialDestino = filialDestino;
	}

	public SubInventario getSubInventarioDestino() {
		return subInventarioDestino;
	}

	public void setSubInventarioDestino(SubInventario subInventarioDestino) {
		this.subInventarioDestino = subInventarioDestino;
	}
	
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

}
