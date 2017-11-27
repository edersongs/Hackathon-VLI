/**
 * 
 */
package abobora.hackathon.gervasio.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/**
 * @author Eduardo Silva Rosa
 * 		   edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr 
 *         + 55 (34) 9 9179-4411
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "tIteTransferencia")
public class ItemTransferencia implements Serializable {

	@Id
	private Ativo ativo;
	@Id
	@ManyToOne
	@Cascade(value = { org.hibernate.annotations.CascadeType.ALL })
	@JoinColumn(name = "codigoTransferencia", referencedColumnName="codigo")
	private Transferencia transferencia;

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public Transferencia getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

}
