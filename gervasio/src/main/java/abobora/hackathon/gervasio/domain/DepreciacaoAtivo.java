/**
 * 
 */
package abobora.hackathon.gervasio.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import abobora.hackathon.gervasio.domain.enums.TipoBaixa;

/**
 * @author Éderson Gervásio
 *		  edersongervasiosilva@gmail.com
 *		  linkedin.com/in/edersongs
 *	   	  github.com/edersongs	
 *	      + 55 (34) 9 9272-2350	
 *
 */
@Entity
@Table(name = "tdepreciacaoAtivos")
public class DepreciacaoAtivo implements Serializable {

	private static final long serialVersionUID = -6784402533266375880L;
	
	@Id
	private Long codigo;
	
	private BigDecimal valorDepreciado;
	
	private Date dataBaixa;
	
	@Enumerated(EnumType.STRING)
	private TipoBaixa tipoBaixa;
	
	private BigDecimal valorBaixa;
	
	@ManyToOne
	@JoinColumn(name = "codigoAtivo", referencedColumnName = "codigo")
	private Ativo ativo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getValorDepreciado() {
		return valorDepreciado;
	}

	public void setValorDepreciado(BigDecimal valorDepreciado) {
		this.valorDepreciado = valorDepreciado;
	}

	public Date getDataBaixa() {
		return dataBaixa;
	}

	public void setDataBaixa(Date dataBaixa) {
		this.dataBaixa = dataBaixa;
	}

	public TipoBaixa getTipoBaixa() {
		return tipoBaixa;
	}

	public void setTipoBaixa(TipoBaixa tipoBaixa) {
		this.tipoBaixa = tipoBaixa;
	}

	public BigDecimal getValorBaixa() {
		return valorBaixa;
	}

	public void setValorBaixa(BigDecimal valorBaixa) {
		this.valorBaixa = valorBaixa;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
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
		DepreciacaoAtivo other = (DepreciacaoAtivo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
