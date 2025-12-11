package Aula11;

import Aula10.Pessoa;

public class Aluno extends Pessoa {

    private int matr;
    private String curso;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

    public void cancelarMatr() {
        this.setMatr(0);
        System.out.println("\n" + this.getNome() + " cancelou a sua matricula.");
    }

    public void pagarMensalidade() {
        System.out.println(this.getNome() + " voce pagou a mensalidade.");
    }
}
