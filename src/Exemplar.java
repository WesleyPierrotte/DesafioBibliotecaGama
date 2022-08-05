public class Exemplar {

    private int codigo;
    private boolean cativa, emprestada;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public boolean isCativa() {
        return cativa;
    }
    public void setCativa(boolean cativa) {
        this.cativa = cativa;
    }
    public boolean isEmprestada() {
        return emprestada;
    }
    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    public Exemplar(int codigo, boolean cativa, boolean emprestada) {
        this.codigo = codigo;
        this.cativa = cativa;
        this.emprestada = emprestada;
    }

    public void exibirExemplar() {
        System.out.println("Dados do Exemplar: ");
        System.out.println("Código:" + codigo + "; Cativa:" + cativa + "; emprestada:" + emprestada);

    }



}