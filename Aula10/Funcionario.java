package Aula10;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = false;
    }

    public void invertTrabalhando() {
        if(this.isTrabalhando()) {
            this.setTrabalhando(false);
            System.out.println("\nO funcionário" + this.getNome() + " não esta mais trabalhando.");
        } else {
            this.setTrabalhando(true);
            System.out.println("\nO funcionário " + this.getNome() + " agora esta trabalhando.");
        }
    }
}
