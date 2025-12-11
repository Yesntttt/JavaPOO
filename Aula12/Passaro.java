package Aula12;

public class Passaro extends Animal {

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public Passaro(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("O pássaro está voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("O pássaro está comendo minhoca.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu!");
    }

    public void fazerNinho() {
        System.out.println("Fiz um ninho!");
    }
}
