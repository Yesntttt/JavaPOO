package Aula06;

public class Pessoa {

    public static void main(String[] args) {

        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.fecharMenu();
        c1.menosVolume(10);
        c1.maisVolume(40);
        c1.abrirMenu();
        c1.ligarMudo();
        c1.abrirMenu();
        c1.desligarMudo();
        c1.abrirMenu();
        c1.desligar();
        c1.abrirMenu();
    }
}
