package Aula09;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Ana Gabriela Folster", 17, "Feminino");
        p[1] = new Pessoa("Gabriel Pierri Nunes", 17, "Masculino");

        l[0] = new Livro("O Cortiço", "Machado de Assis", 150, p[0]);
        l[1] = new Livro("Diario de um banana", "Stephen Hawking", 85, p[1]);
        l[2] = new Livro("Como ser uma namorada dos sonhos", "Gabriel Pensador", 92, p[0]);

        l[0].abrir();
        l[0].folhear(50);
        l[0].detalhes();
        l[0].avancarPagina();

        p[0].fazerAniver();
    }
}
