package Aula12;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro(4, 5, 4, "Loiro");

        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        System.out.println("\n" + c1.getCorPelo());
    }
}
