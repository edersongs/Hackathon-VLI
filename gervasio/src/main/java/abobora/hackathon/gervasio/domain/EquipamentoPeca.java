package abobora.hackathon.gervasio.domain;

public class EquipamentoPeca {

	private Equipamento equipamento;
	private Peca peca;
	private Long quantidadePeca;

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public Long getQuantidadePeca() {
		return quantidadePeca;
	}

	public void setQuantidadePeca(Long quantidadePeca) {
		this.quantidadePeca = quantidadePeca;
	}

}
