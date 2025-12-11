package Aula11;

public class Tecnico extends Pessoa {

    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public Tecnico(String nome, int idade, String sexo, String registroProfissional) {
        super(nome, idade, sexo);
        this.registroProfissional = registroProfissional;
    }

    public void praticar(int n) {
        System.out.println(this.getNome() + " você praticou por " + n + " horas.");
    }
}
