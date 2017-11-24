package abobora.hackathon.gervasio.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import abobora.hackathon.gervasio.domain.enums.TipoMovimentacao;

/**
 * @author Eduardo Silva Rosa edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa https://github.com/edusr + 55 (34) 9
 *         9179-4411
 *
 */
@Entity
@Table(name = "tmovimentacaoestoque")
public class MovimentacaoEstoque {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;
	
	@ManyToOne(targetEntity=Modelo.class)
	@JoinColumn(name = "codigomodelo", referencedColumnName = "codigo")
	private Modelo modelo;
	
	@ManyToOne(targetEntity=Filial.class)
	@JoinColumn(name = "codigoFilialOrigem", referencedColumnName = "codigo")
	private Filial filialOrigem;
	
	@ManyToOne(targetEntity=SubInventario.class)
	@JoinColumn(name = "codigoSubinventarioOrigem", referencedColumnName = "codigo")
	private SubInventario subInventarioOrigem;
	
	@ManyToOne(targetEntity=Filial.class)
	@JoinColumn(name = "codigoFilialDestino", referencedColumnName = "codigo")
	private Filial filialDestino;
	
	@ManyToOne(targetEntity=SubInventario.class)
	@JoinColumn(name = "codigoSubinventarioDestino", referencedColumnName = "codigo")
	private SubInventario subInventarioDestino;
	
	@Transient
	private TipoMovimentacao tipoMovimentacao;
	
	private Long quantidade;

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

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		MovimentacaoEstoque other = (MovimentacaoEstoque) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
