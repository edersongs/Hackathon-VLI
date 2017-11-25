package abobora.hackathon.gervasio.domain;

import java.io.Serializable;

public class TipoPeca implements Serializable {

	private Long codigo;
	private String descricao;
	private Boolean recuperavel;
	
	public TipoPeca(Long codigo, String descricao, Boolean recuperavel) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.recuperavel = recuperavel;
	}

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

	public Boolean getRecuperavel() {
		return recuperavel;
	}

	public void setRecuperavel(Boolean recuperavel) {
		this.recuperavel = recuperavel;
	}	

}
