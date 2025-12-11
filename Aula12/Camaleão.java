package Aula12;

public class Camaleão extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public Camaleão(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("O camaleão está andando nas sombras...");
    }

    @Override
    public void alimentar() {
        System.out.println("O camaleão está comendo mosquitos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O camaleão é silencioso...");
    }
}
