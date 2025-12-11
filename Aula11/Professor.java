package Aula11;

import Aula10.Pessoa;

public class Professor extends Pessoa {

    private String especialidade;
    private int salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, String sexo, String especialidade, int salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(int numero) {
        this.setSalario(this.getSalario() + numero);
        System.out.println("\n" + this.getNome() + " recebeu um aumento de R$" + numero + " e agora seu salário é de R$" + this.getSalario());
    }
}
