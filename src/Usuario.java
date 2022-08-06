public class Usuario extends Pessoa{

    private String telefone, matricula;
    private boolean status;

    private Pessoa pessoa;

    public Usuario(String telefone, String matricula, boolean status, Pessoa pessoa) {
        this.telefone = telefone;
        this.matricula = matricula;
        this.status = status;
        this.pessoa = pessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibirUsuario() {
        System.out.println("Dados do usuário");
        System.out.println("Nome: " + pessoa.getNome() + "; CPF: " + pessoa.getCpf() + "; Telefone: " + telefone + "; Matrícula: "+ matricula);
    }

    public void usuarioDebito() {
        // Se for verdadeiro, o usuário não pode emprestar livro
        if(status == true) {
            System.out.println("O Usuário não pode alugar livro, pois existe pendências de entrega!!!");
        }else{
            System.out.println("Pode alugar o livro!!!");
        }
    }
    public int UsuarioCadastrado(int newCpf){
        if(pessoa.getCpf() == newCpf){
            System.out.println("O usuário valido, pode fazer consulta");
        }else{
            System.out.println("Usuário não existe no sistema");
        }
        return newCpf;
    }

}
