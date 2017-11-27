package abobora.hackathon.gervasio.domain;

import java.util.List;

public class NotificacaoPeca {

	private Long codigo;
	private String observacao;
	private Filial filialSolicitante;
	private Peca peca;
	private Long quantidade;
	private String unidadeMedida;
	private List<Filial> filiaPeca;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Filial getFilialSolicitante() {
		return filialSolicitante;
	}

	public void setFilialSolicitante(Filial filialSolicitante) {
		this.filialSolicitante = filialSolicitante;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public List<Filial> getFiliaPeca() {
		return filiaPeca;
	}

	public void setFiliaPeca(List<Filial> filiaPeca) {
		this.filiaPeca = filiaPeca;
	}

}
