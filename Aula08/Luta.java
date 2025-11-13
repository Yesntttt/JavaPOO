package Aula08;

import java.util.concurrent.ThreadLocalRandom;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if(this.aprovada) {
            desafiante.apresentar();
            desafiado.apresentar();
            int vencedor = ThreadLocalRandom.current().nextInt(0, 3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();

                case 1:
                    System.out.println(this.desafiante.getNome() + " venceu a luta!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();

                case 2:
                    System.out.println(this.desafiado.getNome() + " venceu a luta!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }


    }
}
