public class Livro {
    private String titulo, ano, editora, isbn;
    private Autor autor;
    private int edicao;

    public Livro(String titulo, String ano, String editora, String isbn, Autor autor, int edicao) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.isbn = isbn;
        this.autor = autor;
        this.edicao = edicao;
    }

    public void exibirLivro() {
        System.out.println("Dados do Livro: ");
        System.out.println("Título:" + titulo + "; Autor:" + autor.getNome() + "; Ano:" + ano + "; Edicao:" + edicao + "; Editora:" + editora + "; ISBN:" + isbn);

    }

    public void  alterarLivro( String novoTitulo){
        titulo = novoTitulo;
    }



}
