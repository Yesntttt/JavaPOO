package Aula06;

public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menu;
    private int volumeSalvo;

    // Contrutor padrão

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.menu = false;
    }

    // Getter & Setters

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public int getVolumeSalvo() {
        return volumeSalvo;
    }

    public void setVolumeSalvo(int volumeSalvo) {
        this.volumeSalvo = volumeSalvo;
    }

    // Métodos da INTERFACE
    public void ligar() {
        this.setLigado(true);
    }
    public void desligar() {
        this.setLigado(false);
    }
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("\n--------MENU--------");
            System.out.println("Dispositivo LIGADO");
            System.out.println("O volume está em " + this.getVolume());

            for(int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("|");
            }
            if(this.isTocando()) {
                System.out.println("\nO dispositivo ESTÁ tocando.");
            } else {
                System.out.println("\nO dispositivo NÃO esta tocando.");
            }
            this.setMenu(true);
            System.out.println("--------------------\n");
        } else {
            System.out.println("Dispositivo DESLIGADO.");
        }
    }
    public void fecharMenu() {
        if(this.isLigado() && this.isMenu()) {
            System.out.println("Fechando menu...");
        }
    }

    public void maisVolume(int volume) {
        if(this.getVolume() + volume > -1 && this.getVolume() + volume < 101) {
            if(this.isLigado()) {
                this.setVolume(getVolume() + volume);
                System.out.println("Volume aumentado em " + volume + ".");
            } else {
                System.out.println("Dispositivo DESLIGADO.");
            }
        } else if(this.getVolume() + volume > 100) {
            System.out.println("O volume informado de " + volume + " excedeu o máximo de 100 por " + (100 - volume));
        } else if(this.getVolume() + volume < 0) {  // DESNECESSÁRIO PORÉM É UM MÉT.ODO DE SEGURANÇA
            System.out.println("O volume informado de " + volume + " excedeu o mínimo de 0 por " + (this.getVolume() - volume) * -1);
        }
    }
    public void menosVolume(int volume) {
        if(this.getVolume() - volume > -1 && this.getVolume() - volume < 101) {
            if(this.isLigado()) {
                this.setVolume(getVolume() - volume);
                System.out.println("Volume diminuido em " + volume + ".");
            } else {
                System.out.println("Dispositivo DESLIGADO.");
            }
        } else if(this.getVolume() - volume > 100) { // DESNECESSÁRIO PORÉM É UM MÉT.ODO DE SEGURANÇA
            System.out.println("O volume informado de " + volume + " excedeu o máximo de 100 por " + (100 - volume));
        } else if(this.getVolume() - volume < 0) {
            System.out.println("O volume informado de " + volume + " excedeu o mínimo de 0 por " + (this.getVolume() - volume) * -1);
        }
    }

    public void ligarMudo() {
        this.setVolumeSalvo(volume);
        this.volume = 0;
        System.out.println("Dispositivo MUDO");
    }
    public void desligarMudo() {
        if(volume == 0) {
            this.setVolume(volumeSalvo);
            System.out.println("Dispositivo DESMUTADO");
        } else {
            System.out.println("O dispositivo não esta mudo.");
        }
    }
    public void play() {
        if(this.isLigado()) {
            this.setTocando(true);
            System.out.println("O dispositivo esta TOCANDO.");
        } else {
            System.out.println("Dispositivo DESLIGADO.");
        }
    }
    public void pause() {
        if(this.isLigado()) {
            this.setTocando(false);
            System.out.println("O dispositivo NÃO esta TOCANDO.");
        } else {
            System.out.println("Dispositivo DESLIGADO.");
        }
    }
}
