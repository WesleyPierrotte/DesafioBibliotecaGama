public class Livro {
    private String titulo, ano, editora, isbn;
    private Autor autor;
    private int edicao;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void  alterarLivro(String novoTitulo){
        titulo = novoTitulo;
    }

    public String ListarLivroCadastrado(String listarLivro){
        getTitulo().equals(listarLivro);
        return listarLivro;
    }

    public String ConsultaTituloLivro(String tituloLivro){
        if(getTitulo().equals(tituloLivro)){
            System.out.println("O livro " +tituloLivro+ " existe na biblioteca ");
        }else{
            System.out.println("não existe o livro na biblioteca");
        }
        return tituloLivro;

    }

    public String ConsultaAutor(String consAutor) {
        if (autor.getNome().equals(consAutor)) {
            System.out.println("O nome do Autor " + consAutor + " consta na biblioteca  // Por favor, consulte pelo livro desejado");
        } else {
            System.out.println("O nome do auto não consta na biblioteca");
        }
        return consAutor;

        /* O segundo metodo para resolver essa questão seria, criar uma arraylist colocando todos os livros criados
         * e criar um metodo, onde fosse consultado o arraylist e o seu Autor */
    }

}
