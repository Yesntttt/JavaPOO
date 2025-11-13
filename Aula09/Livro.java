package Aula09;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Construtores:

    public Livro() {
        this.setPagAtual(0);
        this.setAberto(false);
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    // Métodos da INTERFACE:

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Você abriu o livro!");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Você fechou o livro!");
    }

    @Override
    public void folhear(int numero) {
        if((this.getPagAtual() + numero) <= this.getTotPaginas()) {
            this.setPagAtual(numero);
            System.out.println("Agora você esta ná pagina: " + this.getPagAtual() + ".");
        } else {
            System.out.println("ERRO! Você folheou páginas demais.");
        }
    }

    @Override
    public void avancarPagina() {
        if(this.getPagAtual() <= this.getTotPaginas()) {
            this.setPagAtual(getPagAtual() + 1);
            System.out.println("Você avançou uma página!");
        }
    }

    @Override
    public void voltarPagina() {
        if(this.getPagAtual() <= this.getTotPaginas()) {
            this.setPagAtual(getPagAtual() - 1);
            System.out.println("Você voltou uma página!");
        }
    }

    public void detalhes() {
        if(this.isAberto()) {
            System.out.println("\nO livro que você esta lendo é " + this.getTitulo());
            System.out.println("Do autor " + this.getAutor() + ".");
            System.out.println("O total de páginas é " + totPaginas + " páginas.");
            System.out.println("O leitor está atualmente ná página " + this.pagAtual + ".");
            System.out.println("O livro está aberto!");
            System.out.println("O leitor é " + this.getLeitor().getNome() + ".\n");
        } else {
            System.out.println("\nO livro está fechado e não é possível ver os detalhes.\n");
        }
    }
}
