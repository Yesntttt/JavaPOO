package Aula12;

public class Peixe extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("O peixe está nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("O peixe está comendo ração");
    }

    @Override
    public void emitirSom() {
        System.out.println("...");
    }

    public void soltarBolha() {
        System.out.println("Blub!");
    }
}
