package Aula14;

public class Video implements AcoesVideo {

    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video() {
        this.setTitulo("Sem Título.");
        this.setReproduzindo(false);
    }

    public Video(String titulo) {
        this();
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // Métodos da INTERFACE

    public void play() {
        this.setReproduzindo(true);
        System.out.println("\n Você despausou o vídeo!");
    }

    public void pause() {
        this.setReproduzindo(false);
        System.out.println("\n Você pausou o vídeo!");
    }

    public void like(int n) {
        this.setCurtidas(this.getCurtidas() + n);
        System.out.println("Você recebeu " + n + " curtidas no seu vídeo chamado ''" + this.getTitulo() + "''.");
    }
}
