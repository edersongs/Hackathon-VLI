package abobora.hackathon.gervasio.domain;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */

public class Ativo {
	private Long codigo;
	private String descricao;
	private Modelo modelo;

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

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
}
