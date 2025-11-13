package Aula08;

import Aula08.Lutador;

public class UEC {

    public static void main(String[] args) {

        Aula08.Lutador l1 = new Aula08.Lutador("Gabriel Pierri", "Brasileira", 17, 1.80, 60, 10, 0, 0);
        Aula08.Lutador l2 = new Aula08.Lutador("Ana Gabriela", "Brasileira", 17, 1.60, 65, 8, 1, 1);
        Aula08.Lutador l3 = new Aula08.Lutador("Marcelo da Silva Nunes", "Brasileira", 46, 1.82, 93, 13, 1, 2);
        Aula08.Lutador l4 = new Aula08.Lutador("Giseli Pierri Nunes", "Brasileira", 43, 1.82, 85, 8, 3, 3);
        Aula08.Lutador l5 = new Aula08.Lutador("Jéssica Pierri Nunes", "Francesa", 22, 1.69, 68, 3, 5, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1, l2);
        UEC01.lutar();
    }
}
