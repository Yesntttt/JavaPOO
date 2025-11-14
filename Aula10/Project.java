package Aula10;

public class Project {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gabriel", 17, "Masculino");
        Aluno p2 = new Aluno("Enzo Sardá", 17, "Masculino", 12345, "Design Gráfico");
        Professor p3 = new Professor("David", 34, "Masculino", "Motion Design", 12500);
        Funcionario p4 = new Funcionario("João pé de feijão", 999, "Pé de feijão", "Coordenação");

        p1.fazerAniv();

        p2.cancelarMatr();

        p3.receberAumento(1500);

        p4.invertTrabalhando();
    }
}
