import java.util.Date;

public class Emprestimo {
    private Date dataDeEmprestimo, dataPrevistaDeDevolucao, dataDeEntregaReal;
    private int situacao;

    public Date getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }
    public void setDataDeEmprestimo(Date dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }
    public Date getDataPrevistaDeDevolucao() {
        return dataPrevistaDeDevolucao;
    }
    public void setDataPrevistaDeDevolucao(Date dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }
    public Date getDataDeEntregaReal() {
        return dataDeEntregaReal;
    }
    public void setDataDeEntregaReal(Date dataDeEntregaReal) {
        this.dataDeEntregaReal = dataDeEntregaReal;
    }
    public int getSituacao() {
        return situacao;
    }
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Emprestimo(Date dataDeEmprestimo, Date dataPrevistaDeDevolucao, Date dataDeEntregaReal, int situacao) {
        super();
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.dataDeEntregaReal = dataDeEntregaReal;
        this.situacao = situacao;
    }


}