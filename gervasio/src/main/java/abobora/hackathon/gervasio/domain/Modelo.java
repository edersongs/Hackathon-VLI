package abobora.hackathon.gervasio.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Eduardo Silva Rosa
 *   	   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Entity
@Table(name="tmodelo")
public class Modelo implements Serializable {
	
	private static final long serialVersionUID = -4320251910988702388L;

	private Long codigo;
	private String descricao;

	@Id
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Modelo other = (Modelo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
