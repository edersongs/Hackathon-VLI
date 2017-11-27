/**
 * 
 */
package abobora.hackathon.gervasio.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="tstatusAtivo")
public class StatusAtivo implements Serializable{
	

	@Id
	private Long codigo;
	private String descricao;
	
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
	
	

}
