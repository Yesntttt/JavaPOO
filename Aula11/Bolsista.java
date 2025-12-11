package Aula11;

import java.util.Scanner;

public class Bolsista extends Aluno {

    private double bolsa;

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(String nome, int idade, String sexo, int matr, String curso, double bolsa) {
        super(nome, idade, sexo, matr, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println(this.getNome() + " você renovou sua bolsa.");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
}
