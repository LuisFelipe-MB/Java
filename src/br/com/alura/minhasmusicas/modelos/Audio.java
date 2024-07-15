package br.com.alura.minhasmusicas.modelos;

public class Audio{
    private String titulo;
    private boolean reproduzindo;
    private int duracao, classificacao, totalCurtidas, totalDeReproducoes;


    public void curtir() {
        this.totalCurtidas++;
        System.out.println("curtiu");
    }

    public void reproduzir() {
        this.reproduzindo = true;
        this.totalDeReproducoes++;
    }

    public void pausar() {
        this.reproduzindo = false;
        System.out.println(" pausado");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    protected void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

}
