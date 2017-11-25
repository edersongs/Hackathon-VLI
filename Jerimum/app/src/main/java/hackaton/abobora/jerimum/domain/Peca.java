package hackaton.abobora.jerimum.domain;

/**
 * Created by eduardosr on 25/11/2017.
 */



public class Peca {

    private Long codigo;
    private String descricao;
    private TipoPeca tipoPeca;
    private StatusPeca statusPeca;



    public Peca(Long codigo, String descricao, TipoPeca tipoPeca,StatusPeca statusPeca) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipoPeca = tipoPeca;
        this.statusPeca = statusPeca;
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

    public TipoPeca getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(TipoPeca tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    public StatusPeca getStatusPeca() {
        return statusPeca;
    }

    public void setStatusPeca(StatusPeca statusPeca) {
        this.statusPeca = statusPeca;
    }



}

