package Aula07;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador() {
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int empates, int derrotas) {
        this();
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setEmpates(empates);
        this.setDerrotas(derrotas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso < 52.2) {
            categoria = "Peso inválido para entrar na competição";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Peso inválido para entrar na competição";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void apresentar() {
        System.out.println("O nome do lutador é... " + this.getNome());
        System.out.println("Com nacionalidade " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos de idade.");
        System.out.println("Altura de " + this.getAltura() + "m");
        System.out.println("Pesando... " + this.getPeso() + "kg.");
        System.out.println("Com " + this.getVitorias() + " Vitórias");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println("e " + this.getDerrotas() + " Derrotas\n");
    }

    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas() + "\n");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getEmpates() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
