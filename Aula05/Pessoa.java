package Aula05;

public class Pessoa {

    public static void main(String[] args) {

        ContaBanco vo = new ContaBanco(123456789, "Lourdes Valquíria");

        // vo.exibirStatus();
        vo.abrirConta("cp");
        // vo.depositar(60000);
        vo.pagarMensal();
        vo.pagarMensal();
        vo.pagarMensal();
        vo.pagarMensal();
        vo.pagarMensal();
        vo.pagarMensal();
        vo.pagarMensal();
        vo.pagarMensal();

        vo.fecharConta();

        vo.exibirStatus();
    }
}
