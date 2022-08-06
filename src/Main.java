import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Usuario usuario1;
        usuario1 = new Usuario("21 999487289","23",false,
                new Pessoa("HEADBUG USER ONE",151587561));

        usuario1.exibirUsuario();
        usuario1.usuarioDebito();

        Livro livro1;
        livro1 = new Livro("Gama Desafio","2022","HEADBUG","1234",new Autor("HEADBUG",1234567)
                ,1);

        Livro livro2;
        livro1 = new Livro("Gama Desafio 2","2023","HEADBUG","1234",new Autor("HEADBUG",1234567)
                ,4);

        livro1.exibirLivro();


        // se o usuário não entregar na data determinada? O usuário será bloqueado ou acrescentará mais tempo?

        Exemplar exemplar1;
        exemplar1 = new Exemplar(01, true, false);

        usuario1.UsuarioCadastrado(151587561);

        livro1.ConsultaTituloLivro("Gama Desafio");

        livro1.alterarLivro("Gama desafio part 2");
        livro1.ConsultaAutor("HEADBUG");



        teclado.close();
    }


}
