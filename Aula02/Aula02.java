package Aula02;

public class Aula02 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 85;
        c1.tampada = false;

        c1.tampar();
        c1.status();
        System.out.println();
        c1.rabiscar();
    }
}
