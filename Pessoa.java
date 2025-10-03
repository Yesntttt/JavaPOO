package Aula07;

public class Pessoa {

    public static void main(String[] args) {

        Lutador l1 = new Lutador("Gabriel Pierri", "Brasileira", 17, 1.80, 60, 10, 0, 0);
        l1.apresentar();

        l1.ganharLuta();
        l1.ganharLuta();
        l1.status();

        Lutador l2 = new Lutador("Ana Gabriela", "Brasileira", 17, 1.60, 65, 8, 1, 1);
        l2.apresentar();

        Lutador l3 = new Lutador("Marcelo da Silva Nunes", "Brasileira", 46, 1.82, 93, 13, 1, 2);

        Lutador l4 = new Lutador("Giseli Pierri Nunes", "Brasileira", 43, 1.82, 85, 8, 3, 3);

        Lutador l5 = new Lutador("Jéssica Pierri Nunes", "Francesa", 22, 1.69, 68, 3, 5, 4);
    }
}
