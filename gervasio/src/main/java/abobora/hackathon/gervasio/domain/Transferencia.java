/**
 * 
 */
package abobora.hackathon.gervasio.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Eduardo Silva Rosa
 *         edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr
 *         + 55 (34) 9 9179-4411    
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name="ttransferencia")
public class Transferencia implements Serializable{
	
	@Id
	private Long codigo;
	@ManyToOne
	@JoinColumn(name="codigoFilialOrigem",referencedColumnName="codigo")
	private Filial filialOrigem;
	@ManyToOne
	@JoinColumn(name="codigoFilialDestino",referencedColumnName="codigo")
	private Filial filialDestino;
	@OneToMany(mappedBy="transferencia")
	private List<ItemTransferencia> itens;
	@Transient
	private Boolean selecionado;
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public Filial getFilialOrigem() {
		if (filialOrigem == null) {
			filialOrigem = new Filial();
		}
		
		return filialOrigem;
	}
	public void setFilialOrigem(Filial filialOrigem) {
		this.filialOrigem = filialOrigem;
	}
	
	public Filial getFilialDestino() {
		return filialDestino;
	}
	
	public void setFilialDestino(Filial filialDestino) {
		this.filialDestino = filialDestino;
	}
	
	/**
	 * @return the itens
	 */
	public List<ItemTransferencia> getItens() {
		return itens;
	}
	
	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<ItemTransferencia> itens) {
		this.itens = itens;
	}
	
	
	public Boolean getSelecionado() {
		if (selecionado == null) {
			selecionado = Boolean.FALSE;
		}
		return selecionado;
	}

	public void setSelecionado(Boolean selecionado) {
		this.selecionado = selecionado;
	}
}
