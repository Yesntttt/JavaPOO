package Aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("A carga da caneta " + this.cor + " é de " + this.carga);
        System.out.println(" esta tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Estou tampada e não consigo rabiscar.");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
