/**
 * 
 */
package abobora.hackathon.gervasio.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */
@Embeddable
public class EstoqueId implements Serializable {

	private static final long serialVersionUID = 3130644008000734430L;

	@ManyToOne
	@JoinColumn(name = "codigoModelo", referencedColumnName = "codigo")
	private Modelo modelo;
	
	@ManyToOne
	@JoinColumn(name = "codigoFilial", referencedColumnName = "codigo")
	private Filial filial;
	
	@ManyToOne
	@JoinColumn(name = "codigoSubinventario", referencedColumnName = "codigo")
	private SubInventario subInventario;
	
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
}
