package Aula12;

public class Cachorro extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("O cão está correndo!\n");
    }

    @Override
    public void alimentar() {
        System.out.println("O cão está comendo ração!\n");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
}
